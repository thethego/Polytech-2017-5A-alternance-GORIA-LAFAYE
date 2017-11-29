package com.epulapp.zequizz;
import android.net.Uri;
import android.os.AsyncTask;

import com.epulapp.model.Beer;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.xml.transform.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


/**
 * Created by lafay on 29/11/2017.
 */

public class RequestPunkAPI extends Observable{

    private List<Beer> beers;

    public RequestPunkAPI(){
        this.beers = new ArrayList();
        this.updateList();
    }

    public interface PunkAPIService{
        @GET("beers")
        Call<List<Beer>> listBeers();
    }

    public void updateList(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.punkapi.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PunkAPIService service = retrofit.create(PunkAPIService.class);
        service.listBeers().enqueue(new Callback<List<Beer>>() {
            @Override
            public void onResponse(Call<List<Beer>> call, Response<List<Beer>> response) {
                beers = response.body();
                notifyObservers();
            }

            @Override
            public void onFailure(Call<List<Beer>> call, Throwable t) {

            }
        });

    }

    public List<Beer> getBeers(){
        return this.beers;
    }


}

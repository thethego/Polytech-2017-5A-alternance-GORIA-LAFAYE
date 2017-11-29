package com.epulapp.zequizz;
import com.epulapp.model.Beer;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


/**
 * Created by lafay on 29/11/2017.
 */

public class RequestPunkAPI {

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
        try {
            this.beers = service.listBeers().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Beer> getBeers(){
        return this.beers;
    }
}

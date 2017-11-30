package com.epulapp.zequizz;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import com.epulapp.model.Beer;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
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

public class  RequestPunkAPI{

    private List<Beer> beers;
    private BeerAdapter adapter;

    public RequestPunkAPI(){
        this.beers = new ArrayList();
        this.updateList();
    }

    public interface PunkAPIService{
        @GET("beers")
        Call<List<Beer>> listBeers();
    }
    public void setAdapter(BeerAdapter adapter){
        this.adapter = adapter;
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
                if(adapter!=null){

                    for (Beer b: beers) {
                        new DownloadImageTask(b.beerImage).execute(b.getImageUrl());

                    }

                    adapter.swap(beers);
                    Log.d("Requester","notify");
                }
            }

            @Override
            public void onFailure(Call<List<Beer>> call, Throwable t) {

            }
        });

    }

    public List<Beer> getBeers(){
        return this.beers;
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        public Bitmap bmImage;
        private String url;

        public DownloadImageTask(Bitmap bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            url = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage=result;
            Beer beer = null;
            for(Beer b:beers){
                if(b.getImageUrl() == url){
                    b.beerImage = bmImage;
                    adapter.swap(beers);
                }
            }
        }
    }

}

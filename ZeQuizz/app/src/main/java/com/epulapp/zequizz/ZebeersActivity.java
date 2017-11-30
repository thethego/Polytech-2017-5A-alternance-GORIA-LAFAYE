package com.epulapp.zequizz;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.epulapp.model.Beer;

public class ZebeersActivity extends AppCompatActivity implements ListBeerFragment.OnFragmentInteractionListener,BeerDetailFragment.OnFragmentInteractionListener {

    private FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zebeers);

        if (savedInstanceState != null) {
            return;
        }

        Fragment newFragment = new ListBeerFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.beerListFragment_container, newFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void showDetails(Beer beer){
        BeerDetailFragment newFragment = new BeerDetailFragment();
        newFragment.setBeer(beer);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.beerListFragment_container, newFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}

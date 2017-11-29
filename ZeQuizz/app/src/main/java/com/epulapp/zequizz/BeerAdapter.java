package com.epulapp.zequizz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.epulapp.model.Beer;

import java.util.List;

/**
 * Created by lafay on 29/11/2017.
 */

public class BeerAdapter extends RecyclerView.Adapter<BeerAdapter.MyViewHolder>{
    private List<Beer> beersList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, alc, year;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            alc = (TextView) view.findViewById(R.id.alc);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public BeerAdapter(List<Beer> beersList) {
        this.beersList = beersList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.beer_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Beer beer = beersList.get(position);
        holder.name.setText(beer.getName());
        holder.alc.setText(beer.getAbv().toString());
        holder.year.setText(beer.getFirstBrewed());
    }

    @Override
    public int getItemCount() {
        return beersList.size();
    }
}

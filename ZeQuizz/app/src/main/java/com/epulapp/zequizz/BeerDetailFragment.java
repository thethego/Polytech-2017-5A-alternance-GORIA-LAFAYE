package com.epulapp.zequizz;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.epulapp.model.Beer;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BeerDetailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BeerDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BeerDetailFragment extends Fragment {

    private Beer beer;

    private OnFragmentInteractionListener mListener;

    public BeerDetailFragment() {
        // Required empty public constructor
    }

    /**

     *
     * @param beer the beer shown.
     * @return A new instance of fragment BeerDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BeerDetailFragment newInstance() {
        BeerDetailFragment fragment = new BeerDetailFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        beer = ZebeersActivity.detailBeer;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_beer_detail, container, false);
        ((TextView)v.findViewById(R.id.txtBeerName)).setText(beer.getName());
        ((TextView)v.findViewById(R.id.txtDetail)).setText(beer.getDescription());
        ((TextView)v.findViewById(R.id.txtAlc)).setText(beer.getAbv().toString());
        ((TextView)v.findViewById(R.id.txtYear)).setText(beer.getFirstBrewed());
        ((ImageView)v.findViewById(R.id.beerImageView)).setImageBitmap(beer.beerImage);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void setBeer(Beer beer){
        this.beer = beer;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

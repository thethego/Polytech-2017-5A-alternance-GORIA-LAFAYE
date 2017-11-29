package com.epulapp.zequizz;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MenuFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_menu, container, false);
        Button b = v.findViewById(R.id.btnOffTeam);
        b.setOnClickListener(mBtnOffTeamListener);
        return v;
    }

    private View.OnClickListener mBtnOffTeamListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ((MainActivity)getActivity()).addQuizzFragment();
        }
    };

}

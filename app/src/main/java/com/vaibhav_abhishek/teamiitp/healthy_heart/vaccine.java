package com.vaibhav_abhishek.teamiitp.healthy_heart;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class vaccine extends Fragment {
    TextView zika,swineflu,medicine_and_math,cough;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_vaccine, container, false);


        return v;
    }





}

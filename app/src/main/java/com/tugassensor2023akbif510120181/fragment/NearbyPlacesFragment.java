package com.tugassensor2023akbif510120181.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tugassensor2023akbif510120181.R;
import com.tugassensor2023akbif510120181.activity.MapsActivity;

public class NearbyPlacesFragment extends Fragment {

    Activity context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nearby_places, container, false);
    }

    public void onStart(){
        super.onStart();
        Button btn= (Button) context.findViewById(R.id.nearby_places);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MapsActivity.class);
                startActivity(intent);
            }
        });
    }

}

// 10120181
// Akhdan Rafly
// IF - 5

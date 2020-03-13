package com.example.freebay_v2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SupportFragment extends Fragment implements OnMapReadyCallback{

    TextView tutorial;
    //GoogleMap map;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_support, container, false);

//        SupportMapFragment mapFragment = (SupportMapFragment) getFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);

//        tutorial.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//
//        });
        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
//        map = googleMap;
//
//        LatLng uoh = new LatLng(53.643727, -1.7809775);
//        map.addMarker(new MarkerOptions().position(uoh).title("Headquaters"));
//        map.moveCamera(CameraUpdateFactory.newLatLng(uoh));
    }

}

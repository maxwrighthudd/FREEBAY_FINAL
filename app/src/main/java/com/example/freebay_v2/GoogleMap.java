package com.example.freebay_v2;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.appcompat.app.AppCompatActivity;

public class GoogleMap extends AppCompatActivity implements OnMapReadyCallback {

    com.google.android.gms.maps.GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.google_map);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
        map = googleMap;

        LatLng uoh = new LatLng(53.643727,-1.7809775 );
        map.addMarker(new MarkerOptions().position(uoh).title("Headquaters"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(uoh, 15));
    }
}

package com.example.freebay_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SwipeFragment extends Fragment {
    RelativeLayout layout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_swipe, container, false);
    }


    @Override
    public void onViewCreated(@NonNull android.view.View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        layout = getView().findViewById(R.id.relativeLayout);

        layout.setOnTouchListener(new OnSwipeTouchListener(getActivity()) {
            //Replace both 'Toast' functions with the function for switching active prdouct images

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                Toast.makeText(getActivity(), "Disliked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                Toast.makeText(getActivity(), "Liked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipeUp() {
                super.onSwipeUp();
                Toast.makeText(getActivity(), "Super Like", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

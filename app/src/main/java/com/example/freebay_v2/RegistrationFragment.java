package com.example.freebay_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class RegistrationFragment extends Fragment {
    Button continueBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_registration, container, false);
    }
}
//        continueBtn = (Button) v.findViewById(R.id.registrationBtn);
//        continueBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentManager fm = getFragmentManager();
//                RegistrationFragment registrationFragment = new RegistrationFragment();
//                fm.beginTransaction().replace(R.id.registration, registrationFragment).commit();
//            }
//        });
//        return v;
//    }



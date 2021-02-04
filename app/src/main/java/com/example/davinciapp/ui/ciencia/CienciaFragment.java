package com.example.davinciapp.ui.ciencia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.davinciapp.R;

public class CienciaFragment extends Fragment {

    private CienciaViewModel cienciaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cienciaViewModel =
                new ViewModelProvider(this).get(CienciaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ciencia, container, false);
        final TextView textView = root.findViewById(R.id.text_ciencia);
        cienciaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

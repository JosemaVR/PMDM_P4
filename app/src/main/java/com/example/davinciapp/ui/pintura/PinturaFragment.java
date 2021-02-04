package com.example.davinciapp.ui.pintura;

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

public class PinturaFragment extends Fragment {

    private PinturaViewModel pinturaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pinturaViewModel =
                new ViewModelProvider(this).get(PinturaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pintura, container, false);
        final TextView textView = root.findViewById(R.id.text_pintura);
        pinturaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

package com.example.davinciapp.ui.escultura;

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

public class EsculturaFragment extends Fragment {

    private EsculturaViewModel esculturaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        esculturaViewModel =
                new ViewModelProvider(this).get(EsculturaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_escultura, container, false);
        final TextView textView = root.findViewById(R.id.text_escultura);
        esculturaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

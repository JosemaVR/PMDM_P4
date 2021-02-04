package com.example.davinciapp.ui.pintura;

import android.widget.ImageView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PinturaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PinturaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("A pesar de la relativa toma de conciencia y la admiración que Leonardo despertó como " +
                "científico e inventor en los últimos años, su fama ha descansado sobre sus creaciones como pintor " +
                "de varias obras, autentificadas o que se le atribuyen, y que están consideradas grandes obras " +
                "maestras del patrimonio universal.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
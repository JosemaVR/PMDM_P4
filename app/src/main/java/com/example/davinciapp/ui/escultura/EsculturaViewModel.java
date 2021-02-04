package com.example.davinciapp.ui.escultura;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EsculturaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EsculturaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("No se conserva ninguna de sus esculturas. El proyecto escultórico de " +
                "Leonardo del que más se sabe es el de una estatua ecuestre que representara a " +
                "Francisco Sforza, padre de Ludovico el Moro");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
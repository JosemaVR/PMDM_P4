package com.example.davinciapp.ui.inicio;

import android.text.Html;
import android.widget.ImageView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InicioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InicioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("En esta aplicación encontrará información acerca de la obra de Leonardo da Vinci." +
                "\n\n Acceda a las distintas secciones desde los menús disponibles en la barra superior.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
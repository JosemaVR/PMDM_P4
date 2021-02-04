package com.example.davinciapp.ui.ciencia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CienciaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CienciaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("El método científico de Leonardo se basaba fundamentalmente en la " +
                "observación, «la ciencia fue el capitán, la práctica fue el soldado». Sus " +
                "investigaciones científicas no se refieren exclusivamente más que a lo que ha " +
                "estado acompañado de la práctica.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
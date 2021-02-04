package com.example.davinciapp.ui.invento;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InventoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Junto a Herón de Alejandría, se considera a Leonardo un precursor " +
                "importante de un cierto número de máquinas modernas. Sin embargo, más allá del " +
                "asombro que provoca la imaginación prospectiva del autor, se puede constatar " +
                "rápidamente que el funcionamiento real de las máquinas no debió ser su principal " +
                "preocupación.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
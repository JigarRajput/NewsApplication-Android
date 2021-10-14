package com.example.newsapp.ui.GujaratSamachar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Gujarat Samachar fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
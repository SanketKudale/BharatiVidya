package com.sanket.padaayi.ui.letters;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LettersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LettersViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
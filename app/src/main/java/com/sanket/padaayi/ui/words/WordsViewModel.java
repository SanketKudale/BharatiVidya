package com.sanket.padaayi.ui.words;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WordsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WordsViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
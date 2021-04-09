package com.example.androidstudioproject.ui.delete;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DeleteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DeleteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Delete fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
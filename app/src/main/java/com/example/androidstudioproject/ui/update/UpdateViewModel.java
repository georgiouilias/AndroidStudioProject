package com.example.androidstudioproject.ui.update;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UpdateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UpdateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Update fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
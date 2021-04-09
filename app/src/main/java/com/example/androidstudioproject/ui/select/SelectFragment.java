package com.example.androidstudioproject.ui.select;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.androidstudioproject.R;
import com.example.androidstudioproject.ui.insert.InsertViewModel;

public class SelectFragment extends Fragment {

    private SelectViewModel selectViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        selectViewModel =
                new ViewModelProvider(this).get(SelectViewModel.class);
        View root = inflater.inflate(R.layout.fragment_select, container, false);
        final TextView textView = root.findViewById(R.id.text_select);
        selectViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
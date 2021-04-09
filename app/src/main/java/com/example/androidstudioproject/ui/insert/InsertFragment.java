package com.example.androidstudioproject.ui.insert;

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

public class InsertFragment extends Fragment {

    private InsertViewModel insertViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        insertViewModel =
                new ViewModelProvider(this).get(InsertViewModel.class);
        View root = inflater.inflate(R.layout.fragment_insert, container, false);
        final TextView textView = root.findViewById(R.id.text_insert);
        insertViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
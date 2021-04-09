package com.example.androidstudioproject.ui.delete;

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

public class DeleteFragment extends Fragment {

    private DeleteViewModel deleteViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        deleteViewModel =
                new ViewModelProvider(this).get(DeleteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_delete, container, false);
        final TextView textView = root.findViewById(R.id.text_delete);
        deleteViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
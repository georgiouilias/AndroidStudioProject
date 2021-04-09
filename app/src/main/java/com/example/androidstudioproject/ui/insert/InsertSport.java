package com.example.androidstudioproject.ui.insert;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidstudioproject.MainActivity;
import com.example.androidstudioproject.R;
import com.example.androidstudioproject.Sports;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InsertSport#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InsertSport extends Fragment {
    EditText editText,editText1,editText2,getEditText3;
    Button addButton;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InsertSport() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Insert_sport.
     */
    // TODO: Rename and change types and number of parameters
    public static InsertSport newInstance(String param1, String param2) {
        InsertSport fragment = new InsertSport();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert_sport, container, attachToRoot: false);
        editText1 = view.findViewById(R.id.editText);
        editText2 = view.findViewById(R.id.editText1);
        editText3 = view.findViewById(R.id.editText2);
        editText4 = view.findViewById(R.id.editText3);
        addButton = view.findViewById(R.id.submitsport);
        addButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_sportid = 0;
                try {
                    Var_sportid = Integer.parseInt(editText1.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                String Var_sportname = editText2.getText().toString();
                String Var_sporttype = editText3.getText().toString();
                String Var_sportgender = editText4.getText().toString();
                MainActivity.myDatabase.mydaotemp().addSport(Sports);
                Toast.makeText(getActivity(), "Egine", Toast.LENGTH_LONG).show();
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");

            }
        }));



        return inflater.inflate(R.layout.fragment_insert_sport, container, false);
    }
}
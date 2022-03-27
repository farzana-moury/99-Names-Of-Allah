package com.example.a99namesofallah.NameSet;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a99namesofallah.MemorizeNamesFragment;
import com.example.a99namesofallah.R;

public class
NameSet extends Fragment {

    // constants to represent each piece of information on a particular rating
    private static final String ARABIC_NAME = "arabic_name";
    private static final String ENGLISH_NAME = "english";
    private static final String MEANING = "meaning";
    private static final String INDEX = "index";

    // properties that will hold the information
    private String arabicName;
    private String englishName;
    private String meaning;
    private String index;

    public static NameSet newInstance(String arabicName, String englishName, String meaning) {
        NameSet fragment = new NameSet();
        // putting data into the bundle to be transferred to another fragment
        Bundle args = new Bundle();
        args.putString(ARABIC_NAME, arabicName);
        args.putString(ENGLISH_NAME, englishName);
        args.putString(MEANING, meaning);
        fragment.setArguments(args);
        return fragment;
    }

    public static NameSet newInstance(String arabicName, String englishName, String meaning, String index) {
        NameSet fragment = new NameSet();
        // putting data into the bundle to be transferred to another fragment
        Bundle args = new Bundle();
        args.putString(ARABIC_NAME, arabicName);
        args.putString(ENGLISH_NAME, englishName);
        args.putString(MEANING, meaning);
        args.putString(INDEX, index);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // taking the values from the bundle
        if (getArguments() != null) {
            arabicName = getArguments().getString(ARABIC_NAME);
            englishName = getArguments().getString(ENGLISH_NAME);
            meaning = getArguments().getString(MEANING);
            index = getArguments().getString(INDEX);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.name_set, container, false);

        // if there is a value within each information,
        if( arabicName != null) {
            TextView arabName = view.findViewById(R.id.arab_name); // arabic name
            arabName.setText(arabicName);
        }

        if( englishName != null) {
            TextView engName = view.findViewById(R.id.eng_name); // english name
            engName.setText(englishName);
        }

        if( meaning != null) {
            TextView meaningText = view.findViewById(R.id.meaning); // meaning of the name
            meaningText.setText(meaning);
        }

        if( index != null) {
            TextView indexText = MemorizeNamesFragment.binding.index; // index of the name
            indexText.setText(index);
        }

        return view;
    }
}
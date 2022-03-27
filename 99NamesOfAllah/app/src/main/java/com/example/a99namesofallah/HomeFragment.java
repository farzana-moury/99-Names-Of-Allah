package com.example.a99namesofallah;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a99namesofallah.Lists.Lists;

import java.util.Arrays;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //storing the arrays of names and meanings
        Resources res = getResources();
        Lists.arabicNames = Arrays.asList(res.getStringArray(R.array.arabic_names));
        Lists.englishNames = Arrays.asList(res.getStringArray(R.array.english_names));
        Lists.meanings = Arrays.asList(res.getStringArray(R.array.meanings));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        //Read Button
        Button readFragmentButton = view.findViewById(R.id.read_button);

        //Clicking the read button will take us to the Read Names Fragment (Page)
        readFragmentButton.setOnClickListener(view1 -> Navigation.findNavController(view1).navigate(R.id.action_homeFragment_to_ReadNames));

        //Memorize Button
        Button memorizeFragmentButton = view.findViewById(R.id.memorize_button);

        //Clicking the memorize button will take us to the Memorize Names Fragment (Page)
        memorizeFragmentButton.setOnClickListener(view2 -> Navigation.findNavController(view2).navigate(R.id.action_homeFragment_to_MemorizeNames));

        return view;
    }
}
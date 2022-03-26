package com.example.a99namesofallah;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.a99namesofallah.Lists.Lists;
import com.example.a99namesofallah.databinding.FragmentMemorizeNamesBinding;

public class MemorizeNamesFragment extends Fragment {

    private FragmentMemorizeNamesBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentMemorizeNamesBinding.inflate(inflater, container, false);

        TextView testString = binding.testText1;
        testString.setText(
            Lists.arabicNames.get(55)
            + "\n\n" + Lists.englishNames.get(55)
            + "\n\n" + Lists.meanings.get(55));

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
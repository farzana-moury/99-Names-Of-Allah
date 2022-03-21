package com.example.a99namesofallah;

import static com.example.a99namesofallah.databinding.FragmentReadNamesBinding.inflate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.a99namesofallah.Lists.Lists;
import com.example.a99namesofallah.databinding.FragmentReadNamesBinding;

public class ReadNamesFragment extends Fragment {

    private FragmentReadNamesBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentReadNamesBinding.inflate(inflater, container, false);

        TextView testString = binding.testText2;
        testString.setText(
            Lists.arabicNames.get(0)
            + "\n\n" + Lists.englishNames.get(0)
            + "\n\n" + Lists.meanings.get(0));

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
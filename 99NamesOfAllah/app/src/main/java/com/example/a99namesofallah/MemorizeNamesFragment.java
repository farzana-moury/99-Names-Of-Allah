package com.example.a99namesofallah;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.a99namesofallah.Lists.Lists;
import com.example.a99namesofallah.NameSet.NameSet;
import com.example.a99namesofallah.databinding.FragmentMemorizeNamesBinding;

import java.util.Random;

public class MemorizeNamesFragment extends Fragment {

    @SuppressLint("StaticFieldLeak")
    public static FragmentMemorizeNamesBinding binding;
    ViewPager2 viewPager2;
    int randomPosition = 0;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentMemorizeNamesBinding.inflate(inflater, container, false);

        // set an adapter to the custom one we made below
        MemorizeNamesFragment.CustomViewPagerAdapter adapter = new MemorizeNamesFragment.CustomViewPagerAdapter(requireActivity());
        viewPager2 = binding.viewPager2;

        //initially showing a random name set
        randomPosition = new Random().nextInt(100); //generates between 0 to 99
        viewPager2.setAdapter(adapter);

        //and hiding it from view
        viewPager2.setVisibility(View.INVISIBLE);

        //showing the answer whenever you click the answer button
        Button answerButton = binding.answerButton;
        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //name set will appear when you want to see the answer
               viewPager2.setVisibility(View.VISIBLE);
            }
        });

        //randomizing (shuffling) the name set whenever you click the shuffle button
        Button shuffleButton = binding.shuffleButton;
        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomPosition = new Random().nextInt(99);
                viewPager2.setAdapter(adapter);

            //name set will disappear and you will have to guess again
                viewPager2.setVisibility(View.INVISIBLE);
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public class CustomViewPagerAdapter extends FragmentStateAdapter {

        public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            if (position == 0) {
                return NameSet.newInstance(Lists.arabicNames.get(randomPosition), Lists.englishNames.get(randomPosition),
                        Lists.meanings.get(randomPosition), "Guess Name " + randomPosition);
            }
            return NameSet.newInstance("", "",
                    "", "Guess Name " + randomPosition);
        }

        @Override
        public int getItemCount() {
            return 1;
        }
    }
}
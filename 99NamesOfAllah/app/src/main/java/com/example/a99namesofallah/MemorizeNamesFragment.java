package com.example.a99namesofallah;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

    private FragmentMemorizeNamesBinding binding;
    ViewPager2 viewPager;
    int randomPosition = 0;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentMemorizeNamesBinding.inflate(inflater, container, false);

        // set an adapter to the custom one we made below
        MemorizeNamesFragment.CustomViewPagerAdapter adapter = new MemorizeNamesFragment.CustomViewPagerAdapter(requireActivity());
        viewPager = binding.viewPager2;
        randomPosition = new Random().nextInt(99);
        viewPager.setAdapter(adapter);

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

    public class CustomViewPagerAdapter extends FragmentStateAdapter {

        public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            if (position == 0) {
                return NameSet.newInstance(Lists.arabicNames.get(randomPosition), Lists.englishNames.get(randomPosition),
                        Lists.meanings.get(randomPosition));
            }
            return NameSet.newInstance("Default", "Default",
                    "Default");
        }

        @Override
        public int getItemCount() {
            return 1;
        }
    }
}
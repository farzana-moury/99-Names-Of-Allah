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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.a99namesofallah.Lists.Lists;
import com.example.a99namesofallah.NameSet.NameSet;
import com.example.a99namesofallah.databinding.FragmentReadNamesBinding;

import java.util.Objects;

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

        // set an adapter to the custom one we made below
        CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(requireActivity());
        ViewPager2 viewPager = binding.viewPager;
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
            switch (position){
                case 0: return NameSet.newInstance(Lists.arabicNames.get(0), Lists.englishNames.get(0),
                        Lists.meanings.get(0));
                case 1: return NameSet.newInstance(Lists.arabicNames.get(1), Lists.englishNames.get(1),
                        Lists.meanings.get(1));
                case 2: return NameSet.newInstance(Lists.arabicNames.get(2), Lists.englishNames.get(2),
                        Lists.meanings.get(2));
                case 3: return NameSet.newInstance(Lists.arabicNames.get(3), Lists.englishNames.get(3),
                        Lists.meanings.get(3));
                case 4: return NameSet.newInstance(Lists.arabicNames.get(4), Lists.englishNames.get(4),
                        Lists.meanings.get(4));
                default: return NameSet.newInstance("Default", "Default",
                        "Default");
            }
        }

        @Override
        public int getItemCount() {
            return 100;
        }
    }

}
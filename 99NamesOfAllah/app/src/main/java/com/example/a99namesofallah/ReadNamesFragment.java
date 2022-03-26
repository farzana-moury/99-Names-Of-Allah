package com.example.a99namesofallah;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.a99namesofallah.Lists.Lists;
import com.example.a99namesofallah.NameSet.NameSet;
import com.example.a99namesofallah.databinding.FragmentReadNamesBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ReadNamesFragment extends Fragment {

    private FragmentReadNamesBinding binding;
    ViewPager2 viewPager;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentReadNamesBinding.inflate(inflater, container, false);

        // set an adapter to the custom one we made below
        CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(requireActivity());
        viewPager = binding.viewPager;
        viewPager.setAdapter(adapter);

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //tab layout will help the user navigate through all the names easily
        TabLayout tabLayout = view.findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText("" + position + " "))
                .attach();
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
                case 5: return NameSet.newInstance(Lists.arabicNames.get(5), Lists.englishNames.get(5),
                        Lists.meanings.get(5));
                case 6: return NameSet.newInstance(Lists.arabicNames.get(6), Lists.englishNames.get(6),
                        Lists.meanings.get(6));
                case 7: return NameSet.newInstance(Lists.arabicNames.get(7), Lists.englishNames.get(7),
                        Lists.meanings.get(7));
                case 8: return NameSet.newInstance(Lists.arabicNames.get(8), Lists.englishNames.get(8),
                        Lists.meanings.get(8));
                case 9: return NameSet.newInstance(Lists.arabicNames.get(9), Lists.englishNames.get(9),
                        Lists.meanings.get(9));
                case 10: return NameSet.newInstance(Lists.arabicNames.get(10), Lists.englishNames.get(10),
                        Lists.meanings.get(10));
                case 11: return NameSet.newInstance(Lists.arabicNames.get(11), Lists.englishNames.get(11),
                        Lists.meanings.get(11));
                case 12: return NameSet.newInstance(Lists.arabicNames.get(12), Lists.englishNames.get(12),
                        Lists.meanings.get(12));
                case 13: return NameSet.newInstance(Lists.arabicNames.get(13), Lists.englishNames.get(13),
                        Lists.meanings.get(13));
                case 14: return NameSet.newInstance(Lists.arabicNames.get(14), Lists.englishNames.get(14),
                        Lists.meanings.get(14));
                case 15: return NameSet.newInstance(Lists.arabicNames.get(15), Lists.englishNames.get(15),
                        Lists.meanings.get(15));
                case 16: return NameSet.newInstance(Lists.arabicNames.get(16), Lists.englishNames.get(16),
                        Lists.meanings.get(16));
                case 17: return NameSet.newInstance(Lists.arabicNames.get(17), Lists.englishNames.get(17),
                        Lists.meanings.get(17));
                case 18: return NameSet.newInstance(Lists.arabicNames.get(18), Lists.englishNames.get(18),
                        Lists.meanings.get(18));
                case 19: return NameSet.newInstance(Lists.arabicNames.get(19), Lists.englishNames.get(19),
                        Lists.meanings.get(19));
                case 20: return NameSet.newInstance(Lists.arabicNames.get(20), Lists.englishNames.get(20),
                        Lists.meanings.get(20));
                case 21: return NameSet.newInstance(Lists.arabicNames.get(21), Lists.englishNames.get(21),
                        Lists.meanings.get(21));
                case 22: return NameSet.newInstance(Lists.arabicNames.get(22), Lists.englishNames.get(22),
                        Lists.meanings.get(22));
                case 23: return NameSet.newInstance(Lists.arabicNames.get(23), Lists.englishNames.get(23),
                        Lists.meanings.get(23));
                case 24: return NameSet.newInstance(Lists.arabicNames.get(24), Lists.englishNames.get(24),
                        Lists.meanings.get(24));
                case 25: return NameSet.newInstance(Lists.arabicNames.get(25), Lists.englishNames.get(25),
                        Lists.meanings.get(25));
                case 26: return NameSet.newInstance(Lists.arabicNames.get(26), Lists.englishNames.get(26),
                        Lists.meanings.get(26));
                case 27: return NameSet.newInstance(Lists.arabicNames.get(27), Lists.englishNames.get(27),
                        Lists.meanings.get(27));
                case 28: return NameSet.newInstance(Lists.arabicNames.get(28), Lists.englishNames.get(28),
                        Lists.meanings.get(28));
                case 29: return NameSet.newInstance(Lists.arabicNames.get(29), Lists.englishNames.get(29),
                        Lists.meanings.get(29));
                case 30: return NameSet.newInstance(Lists.arabicNames.get(30), Lists.englishNames.get(30),
                        Lists.meanings.get(30));
                case 31: return NameSet.newInstance(Lists.arabicNames.get(31), Lists.englishNames.get(31),
                        Lists.meanings.get(31));
                case 32: return NameSet.newInstance(Lists.arabicNames.get(32), Lists.englishNames.get(32),
                        Lists.meanings.get(32));
                case 33: return NameSet.newInstance(Lists.arabicNames.get(33), Lists.englishNames.get(33),
                        Lists.meanings.get(33));
                case 34: return NameSet.newInstance(Lists.arabicNames.get(34), Lists.englishNames.get(34),
                        Lists.meanings.get(34));
                case 35: return NameSet.newInstance(Lists.arabicNames.get(35), Lists.englishNames.get(35),
                        Lists.meanings.get(35));
                case 36: return NameSet.newInstance(Lists.arabicNames.get(36), Lists.englishNames.get(36),
                        Lists.meanings.get(36));
                case 37: return NameSet.newInstance(Lists.arabicNames.get(37), Lists.englishNames.get(37),
                        Lists.meanings.get(37));
                case 38: return NameSet.newInstance(Lists.arabicNames.get(38), Lists.englishNames.get(38),
                        Lists.meanings.get(38));
                case 39: return NameSet.newInstance(Lists.arabicNames.get(39), Lists.englishNames.get(39),
                        Lists.meanings.get(39));
                case 40: return NameSet.newInstance(Lists.arabicNames.get(40), Lists.englishNames.get(40),
                        Lists.meanings.get(40));
                case 41: return NameSet.newInstance(Lists.arabicNames.get(41), Lists.englishNames.get(41),
                        Lists.meanings.get(41));
                case 42: return NameSet.newInstance(Lists.arabicNames.get(42), Lists.englishNames.get(42),
                        Lists.meanings.get(42));
                case 43: return NameSet.newInstance(Lists.arabicNames.get(43), Lists.englishNames.get(43),
                        Lists.meanings.get(43));
                case 44: return NameSet.newInstance(Lists.arabicNames.get(44), Lists.englishNames.get(44),
                        Lists.meanings.get(44));
                case 45: return NameSet.newInstance(Lists.arabicNames.get(45), Lists.englishNames.get(45),
                        Lists.meanings.get(45));
                case 46: return NameSet.newInstance(Lists.arabicNames.get(46), Lists.englishNames.get(46),
                        Lists.meanings.get(46));
                case 47: return NameSet.newInstance(Lists.arabicNames.get(47), Lists.englishNames.get(47),
                        Lists.meanings.get(47));
                case 48: return NameSet.newInstance(Lists.arabicNames.get(48), Lists.englishNames.get(48),
                        Lists.meanings.get(48));
                case 49: return NameSet.newInstance(Lists.arabicNames.get(49), Lists.englishNames.get(49),
                        Lists.meanings.get(49));
                case 50: return NameSet.newInstance(Lists.arabicNames.get(50), Lists.englishNames.get(50),
                        Lists.meanings.get(50));
                case 51: return NameSet.newInstance(Lists.arabicNames.get(51), Lists.englishNames.get(51),
                        Lists.meanings.get(51));
                case 52: return NameSet.newInstance(Lists.arabicNames.get(52), Lists.englishNames.get(52),
                        Lists.meanings.get(52));
                case 53: return NameSet.newInstance(Lists.arabicNames.get(53), Lists.englishNames.get(53),
                        Lists.meanings.get(53));
                case 54: return NameSet.newInstance(Lists.arabicNames.get(54), Lists.englishNames.get(54),
                        Lists.meanings.get(54));
                case 55: return NameSet.newInstance(Lists.arabicNames.get(55), Lists.englishNames.get(55),
                        Lists.meanings.get(55));
                case 56: return NameSet.newInstance(Lists.arabicNames.get(56), Lists.englishNames.get(56),
                        Lists.meanings.get(56));
                case 57: return NameSet.newInstance(Lists.arabicNames.get(57), Lists.englishNames.get(57),
                        Lists.meanings.get(57));
                case 58: return NameSet.newInstance(Lists.arabicNames.get(58), Lists.englishNames.get(58),
                        Lists.meanings.get(58));
                case 59: return NameSet.newInstance(Lists.arabicNames.get(59), Lists.englishNames.get(59),
                        Lists.meanings.get(59));
                case 60: return NameSet.newInstance(Lists.arabicNames.get(60), Lists.englishNames.get(60),
                        Lists.meanings.get(60));
                case 61: return NameSet.newInstance(Lists.arabicNames.get(61), Lists.englishNames.get(61),
                        Lists.meanings.get(61));
                case 62: return NameSet.newInstance(Lists.arabicNames.get(62), Lists.englishNames.get(62),
                        Lists.meanings.get(62));
                case 63: return NameSet.newInstance(Lists.arabicNames.get(63), Lists.englishNames.get(63),
                        Lists.meanings.get(63));
                case 64: return NameSet.newInstance(Lists.arabicNames.get(64), Lists.englishNames.get(64),
                        Lists.meanings.get(64));
                case 65: return NameSet.newInstance(Lists.arabicNames.get(65), Lists.englishNames.get(65),
                        Lists.meanings.get(65));
                case 66: return NameSet.newInstance(Lists.arabicNames.get(66), Lists.englishNames.get(66),
                        Lists.meanings.get(66));
                case 67: return NameSet.newInstance(Lists.arabicNames.get(67), Lists.englishNames.get(67),
                        Lists.meanings.get(67));
                case 68: return NameSet.newInstance(Lists.arabicNames.get(68), Lists.englishNames.get(68),
                        Lists.meanings.get(68));
                case 69: return NameSet.newInstance(Lists.arabicNames.get(69), Lists.englishNames.get(69),
                        Lists.meanings.get(69));
                case 70: return NameSet.newInstance(Lists.arabicNames.get(70), Lists.englishNames.get(70),
                        Lists.meanings.get(70));
                case 71: return NameSet.newInstance(Lists.arabicNames.get(71), Lists.englishNames.get(71),
                        Lists.meanings.get(71));
                case 72: return NameSet.newInstance(Lists.arabicNames.get(72), Lists.englishNames.get(72),
                        Lists.meanings.get(72));
                case 73: return NameSet.newInstance(Lists.arabicNames.get(73), Lists.englishNames.get(73),
                        Lists.meanings.get(73));
                case 74: return NameSet.newInstance(Lists.arabicNames.get(74), Lists.englishNames.get(74),
                        Lists.meanings.get(74));
                case 75: return NameSet.newInstance(Lists.arabicNames.get(75), Lists.englishNames.get(75),
                        Lists.meanings.get(75));
                case 76: return NameSet.newInstance(Lists.arabicNames.get(76), Lists.englishNames.get(76),
                        Lists.meanings.get(76));
                case 77: return NameSet.newInstance(Lists.arabicNames.get(77), Lists.englishNames.get(77),
                        Lists.meanings.get(77));
                case 78: return NameSet.newInstance(Lists.arabicNames.get(78), Lists.englishNames.get(78),
                        Lists.meanings.get(78));
                case 79: return NameSet.newInstance(Lists.arabicNames.get(79), Lists.englishNames.get(79),
                        Lists.meanings.get(79));
                case 80: return NameSet.newInstance(Lists.arabicNames.get(80), Lists.englishNames.get(80),
                        Lists.meanings.get(80));
                case 81: return NameSet.newInstance(Lists.arabicNames.get(81), Lists.englishNames.get(81),
                        Lists.meanings.get(81));
                case 82: return NameSet.newInstance(Lists.arabicNames.get(82), Lists.englishNames.get(82),
                        Lists.meanings.get(82));
                case 83: return NameSet.newInstance(Lists.arabicNames.get(83), Lists.englishNames.get(83),
                        Lists.meanings.get(83));
                case 84: return NameSet.newInstance(Lists.arabicNames.get(84), Lists.englishNames.get(84),
                        Lists.meanings.get(84));
                case 85: return NameSet.newInstance(Lists.arabicNames.get(85), Lists.englishNames.get(85),
                        Lists.meanings.get(85));
                case 86: return NameSet.newInstance(Lists.arabicNames.get(86), Lists.englishNames.get(86),
                        Lists.meanings.get(86));
                case 87: return NameSet.newInstance(Lists.arabicNames.get(87), Lists.englishNames.get(87),
                        Lists.meanings.get(87));
                case 88: return NameSet.newInstance(Lists.arabicNames.get(88), Lists.englishNames.get(88),
                        Lists.meanings.get(88));
                case 89: return NameSet.newInstance(Lists.arabicNames.get(89), Lists.englishNames.get(89),
                        Lists.meanings.get(89));
                case 90: return NameSet.newInstance(Lists.arabicNames.get(90), Lists.englishNames.get(90),
                        Lists.meanings.get(90));
                case 91: return NameSet.newInstance(Lists.arabicNames.get(91), Lists.englishNames.get(91),
                        Lists.meanings.get(91));
                case 92: return NameSet.newInstance(Lists.arabicNames.get(92), Lists.englishNames.get(92),
                        Lists.meanings.get(92));
                case 93: return NameSet.newInstance(Lists.arabicNames.get(93), Lists.englishNames.get(93),
                        Lists.meanings.get(93));
                case 94: return NameSet.newInstance(Lists.arabicNames.get(94), Lists.englishNames.get(94),
                        Lists.meanings.get(94));
                case 95: return NameSet.newInstance(Lists.arabicNames.get(95), Lists.englishNames.get(95),
                        Lists.meanings.get(95));
                case 96: return NameSet.newInstance(Lists.arabicNames.get(96), Lists.englishNames.get(96),
                        Lists.meanings.get(96));
                case 97: return NameSet.newInstance(Lists.arabicNames.get(97), Lists.englishNames.get(97),
                        Lists.meanings.get(97));
                case 98: return NameSet.newInstance(Lists.arabicNames.get(98), Lists.englishNames.get(98),
                        Lists.meanings.get(98));
                case 99: return NameSet.newInstance(Lists.arabicNames.get(99), Lists.englishNames.get(99),
                        Lists.meanings.get(99));
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
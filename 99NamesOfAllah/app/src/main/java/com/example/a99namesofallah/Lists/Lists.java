package com.example.a99namesofallah.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.a99namesofallah.R;
import com.example.a99namesofallah.R.string;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Lists extends Fragment{
    //lists for all 99 names, including arabic and english, as well as their meanings
    public static List<String> arabicNames = new ArrayList<>();
    public static List<String> englishNames = new ArrayList<>();
    public static List<String> meanings = new ArrayList<>();
}

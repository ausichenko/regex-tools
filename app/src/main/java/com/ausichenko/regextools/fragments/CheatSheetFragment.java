package com.ausichenko.regextools.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ausichenko.regextools.R;

public class CheatSheetFragment extends Fragment {

    public CheatSheetFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cheat_sheet, container, false);
    }
}

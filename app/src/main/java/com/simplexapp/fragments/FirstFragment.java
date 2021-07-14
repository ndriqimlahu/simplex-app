package com.simplexapp.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.simplexapp.R;

public class FirstFragment extends Fragment {
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        System.out.println("The function called is: onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("The function called is: onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        System.out.println("The function called is: onCreateView");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        System.out.println("The function called is: onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("The function called is: onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("The function called is: onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("The function called is: onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("The function called is: onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("The function called is: onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("The function called is: onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("The function called is: onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("The function called is: onDetach");
    }
}
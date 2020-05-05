package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment1,container);
        final FragmentActivity fragmentActivity = getActivity();
        if(view!=null)
        {
            Button frag1 = (Button)view.findViewById(R.id.f1);
            frag1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
                    Fragment fragment2 = fragmentManager.findFragmentById(R.id.fragment2);
                    final TextView textView = (TextView)fragment2.getView().findViewById(R.id.tv1);
                    textView.setText("You clicked Fragment 1");
                }
            });

            Button frag2 = (Button)view.findViewById(R.id.f2);
            frag2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
                    Fragment fragment2 = fragmentManager.findFragmentById(R.id.fragment2);
                    final TextView textView = (TextView)fragment2.getView().findViewById(R.id.tv1);
                    textView.setText("You clicked Fragment 2");

                }
            });

            Button frag3 = (Button)view.findViewById(R.id.f3);
            frag3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
                    Fragment fragment2 = fragmentManager.findFragmentById(R.id.fragment2);
                    final TextView textView = (TextView)fragment2.getView().findViewById(R.id.tv1);
                    textView.setText("You clicked Fragment 3");

                }
            });
        }
        return view;
    }
}
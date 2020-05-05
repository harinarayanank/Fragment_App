package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view1 = inflater.inflate(R.layout.fragment2,container);
        if(view1!=null)
        {
            TextView textView1 = (TextView)view1.findViewById(R.id.tv1);
            textView1.setText("Click button");
        }
        return view1;
    }
}

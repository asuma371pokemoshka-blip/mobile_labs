package com.example.lab_1_java;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // savedInstanceState == null означает, что активность создаётся впервые
        // (а не пересоздаётся, например, при повороте экрана).
        // Это защита от дублирования фрагментов.
        if (savedInstanceState == null) {

            BlankFragment blankFragment = new BlankFragment();

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction transaction = fragmentManager.beginTransaction();

            transaction.replace(R.id.fragment_container, blankFragment);

            transaction.commit();
        }
    }
}
package com.example.week7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DetailActivity extends AppCompatActivity {


    private ScrollView scrollView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        final String search = intent.getStringExtra("currency");


        FragmentManager myManager = getSupportFragmentManager();
        FragmentTransaction myTransaction = myManager.beginTransaction();
        Fragment myFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("currency", search);
        myFragment.setArguments(bundle);
        myTransaction.replace(R.id.scrollView, myFragment);
        myTransaction.commit();



    }
}

package com.example.week7;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

import com.example.week7.Entities.Coin;
import com.example.week7.Entities.CoinLoreResponse;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {



    private static final String TAG = "MainActivity";

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    //final Coin coin = new Coin();
    //List<Coin> coins;
    Boolean inWide;
    ScrollView scrollView;

    Gson gson = new Gson();
    CoinLoreResponse coinLoreResponse = gson.fromJson(CoinLoreResponse.json, CoinLoreResponse.class);
    List<Coin> coins = coinLoreResponse.getData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: starting");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inWide = findViewById(R.id.scrollView) != null;



        //coins = new List<Coin>();



        Log.d(TAG, "onCreate: made array");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        Log.d(TAG, "onCreate: initialised up recyclerview");

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Log.d(TAG, "onCreate: layout manager made");


        MyAdapter.RecyclerViewClickListener listener = new MyAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                clickResponse(position);
            }
        };
        Log.d(TAG, "onCreate: made listener");
        adapter = new MyAdapter(coins, listener);

        recyclerView.setAdapter(adapter);



        Log.d(TAG, "onCreate: complete");


    }

    public void clickResponse (int position){
        //Put your intent code here for CryptBag
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("currency", coins.get(position).getSymbol());
        Configuration config = getResources().getConfiguration();


        if(config.screenWidthDp >= 900){
            final String search = intent.getStringExtra("currency");

            FragmentManager myManager = getSupportFragmentManager();
            FragmentTransaction myTransaction = myManager.beginTransaction();
            Fragment myFragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("currency", search);
            myFragment.setArguments(bundle);
            myTransaction.replace(R.id.scrollView, myFragment);
            myTransaction.commit();
        } else {
            startActivity(intent);
        }

        Log.d(TAG, "clickResponse: pressed " + position);
    }
}



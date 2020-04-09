package com.example.week8;
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
import android.widget.Toast;

import com.example.week8.Entities.Coin;
import com.example.week8.Entities.CoinLoreResponse;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {



    private static final String TAG = "MainActivity";

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
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
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        MyAdapter.RecyclerViewClickListener listener = new MyAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                clickResponse(position);
            }
        };
        adapter = new MyAdapter(coins, listener);

        recyclerView.setAdapter(adapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinlore.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CoinService service = retrofit.create(CoinService.class);
        Call<CoinLoreResponse> coinsCall = service.getCoins();

        coinsCall.enqueue(new Callback<CoinLoreResponse>(){
            @Override
            public void onResponse(Call<CoinLoreResponse> call, Response<CoinLoreResponse> response) {
                List<Coin> coinsAPI = response.body().getData();
                ((MyAdapter)adapter).setCoins(coinsAPI);
            }

            @Override
            public void onFailure(Call<CoinLoreResponse>call, Throwable t){
                Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_SHORT).show();
            }

        });


    }

    public void clickResponse (int position){
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("currency", coins.get(position).getSymbol());
        //intent.putExtra("currency", position);
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





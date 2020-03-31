package com.example.week7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.week7.Entities.Coin;
import com.example.week7.Entities.CoinLoreResponse;
import com.google.gson.Gson;

import java.util.List;


public class DetailFragment extends Fragment {

    private ImageView searchGoogle;
    private TextView currencyCode;
    private TextView value;
    private TextView change1h;
    private TextView change24h;
    private TextView change7d;
    private TextView marketcap;
    private TextView volume;
    private TextView currencyName;


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        searchGoogle = (ImageView) view.findViewById(R.id.searchGoogle);
        currencyCode = (TextView) view.findViewById(R.id.currencyCode);
        currencyName = (TextView) view.findViewById(R.id.currencyName);
        value = (TextView) view.findViewById(R.id.value);
        change1h = (TextView) view.findViewById(R.id.change1h);
        change24h = (TextView) view.findViewById(R.id.change24h);
        change7d = (TextView) view.findViewById(R.id.change7d);
        marketcap = (TextView) view.findViewById(R.id.marketcap);
        volume = (TextView) view.findViewById(R.id.volume);

        /*if (getArguments().getBoolean("inWide")) {
            String message = getArguments().getString("message");


        }*/

        final String search = getArguments().getString("currency");


        currencyCode.setText(search);

        final Coin coin = new Coin();
        Gson gson = new Gson();
        CoinLoreResponse coinLoreResponse = gson.fromJson(CoinLoreResponse.json, CoinLoreResponse.class);
        List<Coin> coins = coinLoreResponse.getData();

        currencyName.setText(coin.searchcoin(search).getName());
        value.setText("$"+coin.searchcoin(search).getPriceBtc());
        change1h.setText(coin.searchcoin(search).getPercentChange1h()+"%");
        change24h.setText(coin.searchcoin(search).getPercentChange24h()+"%");
        change7d.setText(coin.searchcoin(search).getPercentChange7d()+"%");
        marketcap.setText("$"+coin.searchcoin(search).getMarketCapUsd());
        volume.setText("$"+Double.toString(coin.searchcoin(search).getVolume24()));

        searchGoogle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/#q=" + coin.searchcoin(search).getName())));
            }
        });
        return view;
    }


}

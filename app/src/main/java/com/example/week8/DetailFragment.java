package com.example.week8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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


public class DetailFragment extends Fragment {

    Coin coin = new Coin();

    private ImageView searchGoogle;
    private TextView currencyCode;
    private TextView value;
    private TextView change1h;
    private TextView change24h;
    private TextView change7d;
    private TextView marketcap;
    private TextView volume;
    private TextView currencyName;

    Gson gson = new Gson();
    CoinLoreResponse coinLoreResponse = gson.fromJson(CoinLoreResponse.json, CoinLoreResponse.class);
    List<Coin> coins = coinLoreResponse.getData();
    public DetailFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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

        final String search = getArguments().getString("currency");
        currencyCode.setText(coin.searchcoin(search).getSymbol());
        currencyName.setText(coin.searchcoin(search).getName());

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
                coins.clear();
                coins.addAll(coinsAPI);



                for(int i = 0; i < coins.size(); i++){
                    //if(coin.getSymbol().equals(search)){
                    if(search.equals(coins.get(i).getSymbol())){

                        value.setText("$"+coins.get(i).getPriceUsd());
                        change1h.setText(coins.get(i).getPercentChange1h()+"%");
                        change24h.setText(coins.get(i).getPercentChange24h()+"%");
                        change7d.setText(coins.get(i).getPercentChange7d()+"%");
                        marketcap.setText("$"+coins.get(i).getMarketCapUsd());
                        volume.setText("$"+coins.get(i).getVolume24());

                        break;
                    }else{
                        System.out.println("not working");
                    }
                }

                DetailFragment.this.getActivity().setTitle(coin.getName());
            }

            @Override
            public void onFailure(Call<CoinLoreResponse>call, Throwable t){
                Toast.makeText(getActivity(), "fail", Toast.LENGTH_SHORT).show();
            }

        });

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

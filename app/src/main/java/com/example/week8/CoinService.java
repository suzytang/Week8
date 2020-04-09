package com.example.week8;

import com.example.week8.Entities.CoinLoreResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinService {
    @GET("/api/tickers")
    Call<CoinLoreResponse> getCoins();
}

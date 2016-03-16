package com.example.yugantjoshi.quotegenerator.data;

import com.example.yugantjoshi.quotegenerator.data.model.Quote;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QuotesInterface {

    @GET("?method=getQuote&format=json&lang=en")
    Call<Quote> getQuote(@Query("key") int key);

}

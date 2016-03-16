package com.example.yugantjoshi.quotegenerator.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.yugantjoshi.quotegenerator.R;
import com.example.yugantjoshi.quotegenerator.data.QuotesInterface;
import com.example.yugantjoshi.quotegenerator.data.model.Quote;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "http://api.forismatic.com/api/1.0/";

    QuotesInterface quoteService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initRetrofit();
    }

    private void initRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        quoteService = retrofit.create(QuotesInterface.class);
    }

    @OnClick(R.id.main_activity__fetch_quote_button)
    public void fetchQuotesButtonClicked() {
        int anyKeyIDontKnowWhatTheKeyIs = 555;
        quoteService.getQuote(anyKeyIDontKnowWhatTheKeyIs).enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(final Call<Quote> call, final Response<Quote> response) {
                Toast.makeText(getApplicationContext(), response.body().toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(final Call<Quote> call, final Throwable t) {
                Toast.makeText(getApplicationContext(), "Rest call to get quote failed!", Toast.LENGTH_LONG).show();
            }
        });
    }

}

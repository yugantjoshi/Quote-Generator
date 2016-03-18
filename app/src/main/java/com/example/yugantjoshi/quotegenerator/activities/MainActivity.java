package com.example.yugantjoshi.quotegenerator.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
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
    TextView quoteTextView, authorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = (TextView) findViewById(R.id.quote_text);
        authorTextView = (TextView) findViewById(R.id.author_text);

        createRetrofit();
        generateQuote();

        quoteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateQuote();
            }
        });
    }

    private void createRetrofit()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.quoteService = retrofit.create(QuotesInterface.class);
    }

    public void generateQuote()
    {
        int key=0;
        this.quoteService.getQuote(key).enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                String quoteText;
                String authorText;

                quoteText =  response.body().quoteText.toString();
                authorText = response.body().quoteAuthor.toString();

                quoteTextView.setGravity(Gravity.CENTER);
                authorTextView.setGravity(Gravity.CENTER);

                quoteTextView.setText(quoteText);
                authorTextView.setText(authorText);
            }
            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                Toast.makeText(MainActivity.this,R.string.quote_fail,Toast.LENGTH_LONG).show();
                t.printStackTrace();
            }
        });
    }


}

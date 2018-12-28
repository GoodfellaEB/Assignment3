package com.example.leo.assignment2.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.leo.assignment2.R;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignInActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://api.myservice.com/";
    Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

    }

    public void SignInOnClick(View v) {

        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);

        try {
            Intent k = new Intent(SignInActivity.this, DashboardActivity.class);
            startActivity(k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

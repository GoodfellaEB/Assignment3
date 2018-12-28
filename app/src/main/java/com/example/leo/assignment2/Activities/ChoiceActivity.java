package com.example.leo.assignment2.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leo.assignment2.R;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void goToSignIn(View v) {
        try {
            Intent k = new Intent(this, SignInActivity.class);
            startActivity(k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goToSignUp(View v) {
        try {
            Intent k = new Intent(this, SignUpActivity.class);
            startActivity(k);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

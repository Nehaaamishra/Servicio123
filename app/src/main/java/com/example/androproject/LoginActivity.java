package com.example.androproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class LoginActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String LoginStatus = "statusKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Sign In");
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

    }

    public void onSignin(View view) {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(LoginStatus, "loggedin");
        editor.commit();
        startActivity(new Intent(LoginActivity.this,DetailsActivity.class));
        this.finish();
    }

    public void goBack(View view) {
        //handling back press
        super.getClass();
        this.finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}

package com.example.flavors.flavour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.flavors.BuildConfig;
import com.example.flavors.R;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textView);

        String tag = getString(R.string.textViewLabel);
        String environment = BuildConfig.ENVIRONMENT;
        String packageName = BuildConfig.APPLICATION_ID;
        String url = BuildConfig.BASE_URL;
        String apiKey = getString(R.string.apikey);
        //or
        //String apiKey = BuildConfig.apikey;

        String finalString ="Tag: ="+tag+"\nEnvironment:= "+environment+"\nUrl:= "+url+"\nApi Key:="+apiKey+"\nPackage:="+packageName;

        textView.setText(finalString);
    }
}
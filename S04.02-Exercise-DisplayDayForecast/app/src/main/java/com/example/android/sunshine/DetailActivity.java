package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mWeatherForDayTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);
        mWeatherForDayTextView=(TextView)findViewById(R.id.tv_weather_for_day);
        setDetailsText();
        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
    }

    private void setDetailsText() {
        Intent intentThatStartedThisAcitivity=getIntent();
        if(intentThatStartedThisAcitivity.hasExtra(("weatherForDay"))){
        String wheaterForDay= intentThatStartedThisAcitivity.getStringExtra("weatherForDay");
        mWeatherForDayTextView.setText(wheaterForDay);
    }
    }
}
package com.mts2792.weather.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.mts2792.weather.R;

public class DailyForecastActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);
    }
}

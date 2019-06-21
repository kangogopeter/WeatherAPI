package com.codestar.weatherapi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mFindWeatherLocationButton;
    private EditText mLocationEditText;
    private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindWeatherLocationButton = (Button) findViewById(R.id.findWeatherLocationButton);
        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/Allura-Regular.otf");
        Typeface ostrichFontBlack = Typeface.createFromAsset(getAssets(), "fonts/Allura-Regular.otf");
        Typeface ostrichFontHeavy = Typeface.createFromAsset(getAssets(), "fonts/Allura-Regular.otf");
        mAppNameTextView.setTypeface(ostrichFontHeavy);
        mFindWeatherLocationButton.setTypeface(ostrichFontBlack);
        mLocationEditText.setTypeface(ostrichFont);

        mFindWeatherLocationButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v == mFindWeatherLocationButton) {
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();

        }
    }
}
package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val homeRL = findViewById<RelativeLayout>(R.id.idRLHome);
         val loadingPB = findViewById<ProgressBar>(R.id.idPBLoading);
         val cityNameTV = findViewById<TextView>(R.id.idTVCityName);
         val temperatureTV = findViewById<TextView>(R.id.idTVTemperature);
         val conditionTV = findViewById<TextView>(R.id.idTVCondition);
         val weatherTV = findViewById<TextView>(R.id.idRVWeather);
         val cityEdt = findViewById<TextInputEditText>(R.id.idEdtCity);
         val backIV = findViewById<ImageView>(R.id.idIVBlack);
         val iconIV = findViewById<ImageView>(R.id.idIVIcon);
         val searchIV = findViewById<ImageView>(R.id.idIVSearch);


    }
}
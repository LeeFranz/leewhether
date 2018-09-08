package com.leo.leecoolwhether;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
//        if(prefs.getString("weather",null) != null) {
//            Log.d(TAG,"start defalut weather page");
//            Intent intent = new Intent(this,WeatherActivity.class);
//            startActivity(intent);
//            //finish();
//        }
    }
}

package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg1 = findViewById(R.id.TvMsg2);
        txtVMsg1.setText(R.string.Msg2);

        Log.i("LifeCycle","Oncreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","onDestroy Called");
    }
}
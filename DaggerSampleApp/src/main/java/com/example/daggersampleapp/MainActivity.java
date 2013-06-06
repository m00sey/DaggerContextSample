package com.example.daggersampleapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject ArmService armService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((DaggerSampleApp) getApplication()).inject(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        armService.wave();
    }
}

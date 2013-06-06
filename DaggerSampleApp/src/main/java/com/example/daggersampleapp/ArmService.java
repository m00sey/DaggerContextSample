package com.example.daggersampleapp;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ArmService {

    private static final String TAG = "ArmService";
    @Inject @ForApplication Context context;
    
    @Inject
    public ArmService() {
    }

    public void wave() {
        Log.d(TAG, "waving " + context.getString(R.id.action_settings));
    }
}

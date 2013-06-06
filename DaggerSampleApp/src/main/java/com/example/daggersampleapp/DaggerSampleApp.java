package com.example.daggersampleapp;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;


public class DaggerSampleApp extends Application {

    private ObjectGraph mObjectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        mObjectGraph = ObjectGraph.create(getModules().toArray());
    }

    protected List<Object> getModules(){
        return Arrays.asList(
                new AndroidModule(this),
                new DSAModule()
        );
    }

    public void inject(Object object){
        mObjectGraph.inject(object);
    }
}

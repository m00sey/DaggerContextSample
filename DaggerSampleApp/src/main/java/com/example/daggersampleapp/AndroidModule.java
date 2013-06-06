package com.example.daggersampleapp;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(library = true)
public class AndroidModule {

    private final DaggerSampleApp daggerSampleApp;

    public AndroidModule(DaggerSampleApp daggerSampleApp){
       this.daggerSampleApp = daggerSampleApp;
    }

    @Provides @Singleton @ForApplication Context provideApplicationContext(){
        return daggerSampleApp;
    }

}

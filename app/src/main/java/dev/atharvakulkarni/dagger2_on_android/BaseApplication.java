package dev.atharvakulkarni.dagger2_on_android;



import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import dev.atharvakulkarni.dagger2_on_android.di.DaggerAppComponent;


public class BaseApplication extends DaggerApplication
{
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector()
    {
        return DaggerAppComponent.builder().application(this).build();
//        return null;
    }
}
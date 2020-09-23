package dev.atharvakulkarni.dagger2_on_android;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import dagger.android.support.DaggerAppCompatActivity;
import dev.atharvakulkarni.dagger2_on_android.models.User;
import dev.atharvakulkarni.dagger2_on_android.ui.auth.AuthActivity;
import dev.atharvakulkarni.dagger2_on_android.ui.auth.AuthResource;


public abstract class BaseActivity extends DaggerAppCompatActivity {

    private static final String TAG = "DaggerExample";

    @Inject
    public SessionManager sessionManager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        subscribeObservers();
    }

    private void subscribeObservers(){
        sessionManager.getAuthUser().observe(this, new Observer<AuthResource<User>>() {
            @Override
            public void onChanged(AuthResource<User> userAuthResource) {
                if(userAuthResource != null){
                    switch (userAuthResource.status){
                        case LOADING:{
                            Log.d(TAG, "onChanged: BaseActivity: LOADING...");
                            break;
                        }

                        case AUTHENTICATED:{
                            Log.d(TAG, "onChanged: BaseActivity: AUTHENTICATED... " +
                                    "Authenticated as: " + userAuthResource.data.getEmail());
                            break;
                        }

                        case ERROR:{
                            Log.d(TAG, "onChanged: BaseActivity: ERROR...");
                            break;
                        }

                        case NOT_AUTHENTICATED:{
                            Log.d(TAG, "onChanged: BaseActivity: NOT AUTHENTICATED. Navigating to Login screen.");
                            navLoginScreen();
                            break;
                        }
                    }
                }
            }
        });
    }

    private void navLoginScreen(){
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
        finish();
    }
}
















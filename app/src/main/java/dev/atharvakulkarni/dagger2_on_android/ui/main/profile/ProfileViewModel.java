package dev.atharvakulkarni.dagger2_on_android.ui.main.profile;

import android.util.Log;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import dev.atharvakulkarni.dagger2_on_android.SessionManager;
import dev.atharvakulkarni.dagger2_on_android.models.User;
import dev.atharvakulkarni.dagger2_on_android.ui.auth.AuthResource;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "DaggerExample";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: viewmodel is ready...");
    }

    public LiveData<AuthResource<User>> getAuthenticatedUser(){
        return sessionManager.getAuthUser();
    }
}




















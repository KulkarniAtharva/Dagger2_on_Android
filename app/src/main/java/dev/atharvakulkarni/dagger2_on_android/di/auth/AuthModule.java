package dev.atharvakulkarni.dagger2_on_android.di.auth;



import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dev.atharvakulkarni.dagger2_on_android.models.User;
import dev.atharvakulkarni.dagger2_on_android.network.auth.AuthApi;
import retrofit2.Retrofit;

@Module
public class AuthModule {

    @AuthScope
    @Provides
    @Named("auth_user")
    static User someUser(){
        return new User();
    }

    @AuthScope
    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }
}

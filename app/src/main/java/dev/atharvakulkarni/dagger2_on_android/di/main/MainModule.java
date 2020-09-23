package dev.atharvakulkarni.dagger2_on_android.di.main;


import dagger.Module;
import dagger.Provides;
import dev.atharvakulkarni.dagger2_on_android.network.main.MainApi;
import dev.atharvakulkarni.dagger2_on_android.ui.main.posts.PostsRecyclerAdapter;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostsRecyclerAdapter provideAdapter(){
        return new PostsRecyclerAdapter();
    }

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}

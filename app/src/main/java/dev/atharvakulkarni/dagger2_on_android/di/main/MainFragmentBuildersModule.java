package dev.atharvakulkarni.dagger2_on_android.di.main;




import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dev.atharvakulkarni.dagger2_on_android.ui.main.posts.PostsFragment;
import dev.atharvakulkarni.dagger2_on_android.ui.main.profile.ProfileFragment;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment contributePostsFragment();
}

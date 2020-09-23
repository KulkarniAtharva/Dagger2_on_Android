package dev.atharvakulkarni.dagger2_on_android.di;



import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dev.atharvakulkarni.dagger2_on_android.di.auth.AuthModule;
import dev.atharvakulkarni.dagger2_on_android.di.auth.AuthScope;
import dev.atharvakulkarni.dagger2_on_android.di.auth.AuthViewModelsModule;
import dev.atharvakulkarni.dagger2_on_android.di.main.MainFragmentBuildersModule;
import dev.atharvakulkarni.dagger2_on_android.di.main.MainModule;
import dev.atharvakulkarni.dagger2_on_android.di.main.MainScope;
import dev.atharvakulkarni.dagger2_on_android.di.main.MainViewModelsModule;
import dev.atharvakulkarni.dagger2_on_android.ui.auth.AuthActivity;
import dev.atharvakulkarni.dagger2_on_android.ui.main.MainActivity;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();


    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}

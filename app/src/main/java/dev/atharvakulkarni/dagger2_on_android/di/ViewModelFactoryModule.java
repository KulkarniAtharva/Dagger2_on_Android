package dev.atharvakulkarni.dagger2_on_android.di;



import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dev.atharvakulkarni.dagger2_on_android.viewmodels.ViewModelProviderFactory;


@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

}

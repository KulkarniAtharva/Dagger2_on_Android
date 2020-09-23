package dev.atharvakulkarni.dagger2_on_android.di.auth;



import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dev.atharvakulkarni.dagger2_on_android.di.ViewModelKey;
import dev.atharvakulkarni.dagger2_on_android.ui.auth.AuthViewModel;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}

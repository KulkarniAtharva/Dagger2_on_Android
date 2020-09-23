package dev.atharvakulkarni.dagger2_on_android.di.main;



import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dev.atharvakulkarni.dagger2_on_android.di.ViewModelKey;
import dev.atharvakulkarni.dagger2_on_android.ui.main.posts.PostsViewModel;
import dev.atharvakulkarni.dagger2_on_android.ui.main.profile.ProfileViewModel;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);
}





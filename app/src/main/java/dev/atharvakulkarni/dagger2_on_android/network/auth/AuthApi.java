package dev.atharvakulkarni.dagger2_on_android.network.auth;



import dev.atharvakulkarni.dagger2_on_android.models.User;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthApi
{

    @GET("users/{id}")
    Flowable<User> getUser(
            @Path("id") int id
    );
}

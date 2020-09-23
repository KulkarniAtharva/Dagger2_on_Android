package dev.atharvakulkarni.dagger2_on_android.network.main;



import java.util.List;

import dev.atharvakulkarni.dagger2_on_android.models.Post;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainApi
{

    // /posts?userId=1/
    @GET("posts")
    Flowable<List<Post>> getPostsFromUser(
            @Query("userId") int id
    );

}
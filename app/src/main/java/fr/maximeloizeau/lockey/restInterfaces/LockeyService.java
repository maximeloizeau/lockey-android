package fr.maximeloizeau.lockey.restInterfaces;

import java.util.HashMap;

import fr.maximeloizeau.lockey.models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Maxime on 16-Jan-16.
 */
public interface LockeyService {
    @POST("login")
    Call<User> login(@Body HashMap loginInfo);

    @POST("signup")
    Call<User> signUp(@Body User user);
}

package com.leotech.usersretrofitdemo.api;

import com.leotech.usersretrofitdemo.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("users")
    Call<List<User>> listUsers();

}

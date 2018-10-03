package com.leotech.usersretrofitdemo.controller;

import android.util.Log;

import com.leotech.usersretrofitdemo.data.DataInterface;
import com.leotech.usersretrofitdemo.view.UsersViewInterface;
import com.leotech.usersretrofitdemo.api.ApiManager;
import com.leotech.usersretrofitdemo.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataCallController implements DataInterface{
    private ApiManager manager = new ApiManager();

    String TAG = DataCallController.class.getSimpleName();

    @Override
    public void getUsers(final UsersViewInterface viewInterface){
        Call<List<User>> call = manager.getService().listUsers();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {

                if (!response.isSuccessful()){
                    Log.i(TAG,"Unsuccessful, code: "+response.code());
                    return;
                }
                else{
                    List<User> users = response.body();

                    for(User user : users){
                        user.getUserID();
                        user.getFullName();
                        user.getEmail();
                        user.getPhone();
                        user.getUsername();
                    }
                    viewInterface.setUpAdapterAndView(users);
                }
            }
            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.i(TAG, "Error : " + t.getLocalizedMessage());
            }
        });
    }
}

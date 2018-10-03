package com.leotech.usersretrofitdemo.controller;

import android.view.View;

import com.leotech.usersretrofitdemo.data.DataInterface;
import com.leotech.usersretrofitdemo.view.UsersViewInterface;
import com.leotech.usersretrofitdemo.model.User;

public class MainController {

    private UsersViewInterface view;
    private DataInterface call;

    public MainController(UsersViewInterface view, DataInterface call) {
        this.view = view;
        this.call = call;
        getUsersFromDataSource();
    }

    public void getUsersFromDataSource(){
        call.getUsers(view);
    }

}

package com.leotech.usersretrofitdemo.controller;

import com.leotech.usersretrofitdemo.view.UsersViewInterface;

public class MainController {

    private UsersViewInterface view;
    private DataCallController call;

    public MainController(UsersViewInterface view, DataCallController call) {
        this.view = view;
        this.call = call;
        getUsersFromDataSource();
    }

    public void getUsersFromDataSource(){
        call.getUsers(view);
    }

}

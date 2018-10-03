package com.leotech.usersretrofitdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.leotech.usersretrofitdemo.R;
import com.leotech.usersretrofitdemo.controller.MainController;
import com.leotech.usersretrofitdemo.controller.DataCallController;
import com.leotech.usersretrofitdemo.model.User;
import com.leotech.usersretrofitdemo.utils.UsersAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements UsersViewInterface {


    String TAG = MainActivity.class.getSimpleName();
    private List<User> listOfUsers;
    private RecyclerView recyclerView;
    UsersAdapter adapter;
    private MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.user_rv);
        controller = new MainController(this, new DataCallController());
        getControllerUsers();
    }

    private  void getControllerUsers(){
        controller.getUsersFromDataSource();
    }

    public void setUpAdapterAndView(List<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
        if(this.listOfUsers != null){
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            adapter = new UsersAdapter(listOfUsers, this);
            recyclerView.setAdapter(adapter);
        }
        else{
            Log.i(TAG, "user list is empty");
        }

    }
}

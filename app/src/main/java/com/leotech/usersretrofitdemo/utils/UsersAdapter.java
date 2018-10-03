package com.leotech.usersretrofitdemo.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.leotech.usersretrofitdemo.R;
import com.leotech.usersretrofitdemo.model.User;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {

    private Context context;
    private List<User> listOfUsers;

    public UsersAdapter(List<User> listOfUsers, Context context){
        this.listOfUsers = listOfUsers;
        this.context = context;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.user_list, viewGroup, false);
        return new UserViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {
        User currentUser = listOfUsers.get(i);
        userViewHolder.tv_user_fullname.setText(currentUser.getFullName());
        userViewHolder.tv_user_email.setText(currentUser.getEmail());
        userViewHolder.tv_user_id.setText(String.valueOf(currentUser.getUserID()));

    }

    @Override
    public int getItemCount() {
        return listOfUsers.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_user_fullname;
        private TextView tv_user_email;
        private TextView tv_user_id;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_user_fullname = itemView.findViewById(R.id.tv_user_fullname);
            this.tv_user_email = itemView.findViewById(R.id.tv_user_email);
            this.tv_user_id = itemView.findViewById(R.id.tv_user_id);
        }


    }
}

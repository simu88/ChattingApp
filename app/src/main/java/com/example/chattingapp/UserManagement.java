package com.example.chattingapp;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserManagement {

    public static void checkCurrentUser() {     //현재 사용자 확인
        // [START check_current_user]
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // User is signed in
        } else {


            // No user is signed in
        }
        // [END check_current_user]
    }


}

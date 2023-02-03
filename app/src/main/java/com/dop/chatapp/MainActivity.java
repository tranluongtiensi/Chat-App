package com.dop.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(task -> {
//            if (!task.isSuccessful()) {
//                Log.d("FCM", "Fetching FCM registration token failed", task.getException());
//                return;
//            }
//
//            // Get new FCM registration token
//            String token = task.getResult();
//            Log.d("FCM", "TOKEN:" + token);

            // Log and toast
//                String msg = getString(R.string.msg_token_fmt, token);
//                Log.d("FCM", msg);
//                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
//        });
    }
}
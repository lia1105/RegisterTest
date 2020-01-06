package com.lia.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UsernameActivity extends AppCompatActivity {

    private EditText user;
    Button nexttopassword = findViewById(R.id.next_pw);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        user = findViewById(R.id.username);
        nexttopassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpassword = new Intent(UsernameActivity.this, PasswordActivity.class);
                intentpassword.putExtra("user name", user.getText().toString());
                startActivity(intentpassword);

            }
        });

     }

    }


package com.lia.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_USERNAMEACTIVITY = 110;
    private TextView username;
    private TextView email;
    private TextView password;
    private Button next;
    private Intent intentusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentusername = new Intent(MainActivity.this, UsernameActivity.class);
                startActivity(intentusername);
            }
        });
    }
   @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String name = intent.getStringExtra("user name");
        String passid = intent.getStringExtra("password");
        String emailid = intent.getStringExtra("email");
        username.setText(name);
        password.setText(passid);
        email.setText(emailid);
    }

}

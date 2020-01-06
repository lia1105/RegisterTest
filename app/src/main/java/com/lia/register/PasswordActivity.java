package com.lia.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class PasswordActivity extends AppCompatActivity {

    private EditText pw;
    private Button nextemail;
    private int REQUEST_CODE_EMAILACTIVITY = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        pw = findViewById(R.id.password);
        //填入密碼
        final Intent intentpassword = getIntent();
        //取得姓名資料

        nextemail = findViewById(R.id.next_mail);
        nextemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentemail = new Intent(PasswordActivity.this, EmailActivity.class);
                intentemail
                        .putExtra("user name", intentpassword.getStringExtra("user name"))
                        .putExtra("password", pw.getText().toString());

                startActivity(intentemail);
            }
        });
    }
}




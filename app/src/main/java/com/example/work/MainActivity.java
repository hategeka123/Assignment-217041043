package com.example.work;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
     Button Login, Register;
     EditText Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.bLogin);
        Register =(Button)findViewById(R.id.bRegister);
         Login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getApplicationContext(),"Login successfull",Toast.LENGTH_LONG).show();
                 Intent intent = new Intent(MainActivity.this,Work3.class);
                 startActivity(intent);
             }
         });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = Username.getText().toString();
                String pass =Password.getText().toString();
                if (user.equals("")||pass.equals("")){
                    Toast.makeText(getApplicationContext(),"fii all detail",Toast.LENGTH_LONG).show();
                }
                else if (user.equals("jmv")&& pass.equals("1234")){
                    Toast.makeText(getApplicationContext(),"Register yourself",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,Work2.class);
                    startActivity(intent);
                }
               else
                   Toast.makeText(getApplicationContext(),"invalid username or Password",Toast.LENGTH_LONG).show();
            }
        });
    }
}

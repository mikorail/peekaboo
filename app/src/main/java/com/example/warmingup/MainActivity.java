package com.example.warmingup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username;
    String password;
    TextView tv_username;
    TextView tv_password;
    EditText et_username;
    EditText et_password;
    Button   login;

//    public MainActivity(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_username = (TextView) findViewById(R.id.tv_username);
        tv_password = (TextView) findViewById(R.id.tv_password);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        login = (Button) findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String username = et_username.getText().toString();
                String password= et_password.getText().toString();
                if(TextUtils.isEmpty(username)){
                    Toast.makeText(getApplicationContext(),"enter username!",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(getApplicationContext(),"enter proper password!",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Intent intent = new Intent(MainActivity.this,PageActivity.class);
                    intent.putExtra("username",username);
                    startActivity(intent);
                    finish();
                }
            }
        });


    }

    public void masuk(View view) {
    }
}

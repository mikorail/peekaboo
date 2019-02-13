package com.example.warmingup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PageActivity extends AppCompatActivity {
    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        welcome=(TextView)findViewById(R.id.welcome);
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("username");
        welcome.setText("Hallo, " +username+ " Selamat datang di Coba App");
    }
}

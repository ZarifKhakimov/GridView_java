package com.example.gridview_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gridview_java.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button button = findViewById(R.id.b_push);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecyclerActivity();
            }
        });
    }

    void openRecyclerActivity(){
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }

}
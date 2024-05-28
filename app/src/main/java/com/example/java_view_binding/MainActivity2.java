package com.example.java_view_binding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.java_view_binding.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding secondxml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        secondxml = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(secondxml.getRoot());

        // Set click listener for textView2
        secondxml.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the text of textView2
                secondxml.textView2.setText("The text content of the textView is being changed after button is being clicked");
            }
        });

        secondxml.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}

package com.example.a1stapplication.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a1stapplication.MainActivity;
import com.example.a1stapplication.R;

public class MainTest extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_module_1);
        context = MainTest.this;
    }

    public void tanvir(View viewp) {
        Intent pp = new Intent(context, MainActivity.class);
        startActivity(pp);
    }
}

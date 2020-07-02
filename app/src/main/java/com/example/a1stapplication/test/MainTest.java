package com.example.a1stapplication.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.a1stapplication.MainActivity;
import com.example.a1stapplication.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class MainTest extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        context = MainTest.this;

        final TextInputEditText editTextLCItem8 = findViewById(R.id.editTextLCItem8);

        // Date Picker
        final DatePickerDialog datePickerDialog1 = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String ui = dayOfMonth +"-"+(month+1) + "-" + year;
                Log.e("Date", ui);
                editTextLCItem8.setText(ui);
            }
        }, Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        editTextLCItem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!datePickerDialog1.isShowing())
                    datePickerDialog1.show();
            }
        });


    }

    public void tanvir(View viewp) {
        Intent pp = new Intent(context, MainActivity.class);
        startActivity(pp);
    }
}

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
        setContentView(R.layout.new_module_1);
        context = MainTest.this;

        final TextInputEditText checkboxLC_Ques38 = findViewById(R.id.checkboxLC_Ques38);
        final TextInputEditText qus_40 = findViewById(R.id.checkboxLC_Ques40);
        final TextInputEditText qus_49=findViewById(R.id.checkboxLC_Ques49);
        final TextInputEditText qus_52=findViewById(R.id.checkboxLC_Ques52);

        // Date Picker
datePicker(checkboxLC_Ques38);
datePicker(qus_40);
datePicker(qus_49);
datePicker(qus_52);





    }

    public void datePicker(final TextInputEditText textInputEditText) {
        final DatePickerDialog datePickerDialog1 = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String ui = dayOfMonth +"-"+(month+1) + "-" + year;
                Log.e("Date", ui);
                textInputEditText.setText(ui);
            }
        }, Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        textInputEditText.setOnClickListener(new View.OnClickListener() {
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

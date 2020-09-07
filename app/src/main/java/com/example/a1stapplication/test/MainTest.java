package com.example.a1stapplication.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.a1stapplication.MainActivity;
import com.example.a1stapplication.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

import static com.example.a1stapplication.R.id.spinnerLCItem8;
import static com.example.a1stapplication.R.id.visible;

public class MainTest extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_module_1);
        context = MainTest.this;


        Spinner spinner = findViewById(R.id.spinnerLCItem97_gha);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //String item_position = String.valueOf(position);
                //int positonInt = Integer.valueOf(item_position);
                if (position == 1) {
                    findViewById(R.id.textViewLC_Title_qus_97_uma).setVisibility(View.VISIBLE);
                    findViewById(R.id.checkboxLC_Ques97_uma).setVisibility(view.VISIBLE);
                } else {
                    findViewById(R.id.textViewLC_Title_qus_97_uma).setVisibility(View.GONE);
                    findViewById(R.id.checkboxLC_Ques97_uma).setVisibility(view.GONE);
                }
                Toast.makeText(MainTest.this, "value is "+ position, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        Spinner spinner3 = findViewById(R.id.spinnerLCItem7);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==2){
                    findViewById(R.id.textViewLC_Title2).setVisibility(view.VISIBLE);
                    findViewById(R.id.spinnerLCItem8).setVisibility(view.VISIBLE);
                } else {
                    findViewById(R.id.textViewLC_Title2).setVisibility(view.GONE);
                    findViewById(R.id.spinnerLCItem8).setVisibility(view.GONE);
                    findViewById(R.id.textViewLCItem7_0_1).setVisibility(view.GONE);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Spinner spinner4 = findViewById(R.id.spinnerLCItem8);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            private Object AdapterView;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==4){
                    findViewById(R.id.textViewLCItem7_0_1).setVisibility(view.VISIBLE);

                }  else {
                    findViewById(R.id.textViewLCItem7_0_1).setVisibility(view.GONE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Spinner spinner5 = findViewById(R.id.spinnerLCItem18_1);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==4){
                    findViewById(R.id.linearLayoutLCItem18_1).setVisibility(view.VISIBLE);
                } else {
                    findViewById(R.id.linearLayoutLCItem18_1).setVisibility(view.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        /*findViewById(R.id.spinnerLCItem97_gha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.linearLayoutLCItem7_0_1tem7_0_97_gha).setVisibility(View.VISIBLE);
            }
        });*/

        final TextInputEditText checkboxLC_Ques38 = findViewById(R.id.checkboxLC_Ques38);
        final TextInputEditText qus_40 = findViewById(R.id.checkboxLC_Ques40);
        final TextInputEditText qus_49=findViewById(R.id.checkboxLC_Ques49);
        final TextInputEditText qus_52=findViewById(R.id.checkboxLC_Ques52);
        final TextInputEditText qus_71=findViewById(R.id.checkboxLC_Ques71);
        final TextInputEditText qus_97_uma=findViewById(R.id.checkboxLC_Ques97_uma);

        // Date Picker
datePicker(checkboxLC_Ques38);
datePicker(qus_40);
datePicker(qus_49);
datePicker(qus_52);
datePicker(qus_71);
datePicker(qus_97_uma);





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

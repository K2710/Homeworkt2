package com.sn0ki.homeworkt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class student extends MainActivity implements AdapterView.OnItemSelectedListener {
private CheckBox seleccion1;
private CheckBox seleccion2;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_input);
        seleccion1  = (CheckBox) findViewById(R.id.sexinput1);
        seleccion2 = (CheckBox) findViewById(R.id.sexinput2);
        Spinner spinner = (Spinner) findViewById(R.id.spinnercarrera);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.carreras, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    public void savestateCheckbox(View view){
        seleccion1.setEnabled(true);
        seleccion2.setEnabled(true);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
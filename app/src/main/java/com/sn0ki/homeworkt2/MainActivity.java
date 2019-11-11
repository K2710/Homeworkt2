package com.sn0ki.homeworkt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    private CheckBox seleccion;
    private Menu menu;

    public boolean  onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        this.menu = menu;
        return super.onCreateOptionsMenu(menu);

    }

    private static final String TAG="MainActivity";
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case   R.id.addstudent:
                Intent intent = new Intent(this, student.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }}

}
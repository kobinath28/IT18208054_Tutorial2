package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private static final String TAG = "Activity3";

    EditText n1;
    EditText n2;
    TextView ans;

    int x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {}

    public void addition (View view) {ans.setText(String.valueOf(x+y));}

    public void sub(View view) {ans.setText(String.valueof(x-y));}

    public void mul(View view) {ans.setText(String.valueof(x*y));}

    public void div(View view) {ans.setText(String.valueof(x/y));}

}

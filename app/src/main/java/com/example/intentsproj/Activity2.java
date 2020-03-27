package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    EditText num1;
    EditText num2;

    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        TextView nameView = findViewById(R.id.txtName2);
        nameView.setText("Hello"+name);

        num1 = findViewById(R.id.edtNum1);
        num2 = findViewById(R.id.edtNum2);

        btnSend = findViewById(R.id.btnSend2);

        btnSend.setOnClickListener((v); {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Intent intent1 = new Intent(Activity2.this, Activity3.class);
                intent1.putExtra("n1", n1);
                intent1.putExtra("n2", n2);

                startActivity(intent1);
        };
    }
}

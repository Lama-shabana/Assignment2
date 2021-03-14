package com.example.app1test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity<editName> extends AppCompatActivity {
private EditText editName;
    private EditText editEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName=findViewById(R.id.editName);
        editEmail=findViewById(R.id.editEmail);
    }

    public void btnshow_onclick(View view) {
        String name = editName.getText().toString().trim();
        String email = editEmail.getText().toString().trim();
        if (!name.isEmpty() && !email.isEmpty()){
            Toast.makeText(this ,name,Toast.LENGTH_LONG).show();
            Toast.makeText(this ,email,Toast.LENGTH_LONG).show();
        }
    }
}
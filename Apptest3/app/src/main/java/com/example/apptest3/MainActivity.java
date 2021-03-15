package com.example.apptest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editL;
    private EditText editW;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editL=findViewById(R.id.editL);
        editW=findViewById(R.id.editW);

    }

    private void calculate_wl(){
        String Length = editL.getText().toString().trim();
        String Wgth = editW.getText().toString().trim();
      //string mass=  (Length * Wgth).toString();
        //Toast.makeText(this,mass.LENGTH_SHORT).show();
    }
    public void btn_OnClick(View view) {
        String Length = editL.getText().toString().trim();
        String Wgth = editW.getText().toString().trim();
        if (!Length.isEmpty() && !Wgth.isEmpty()){
            Toast.makeText(this ,Length,Toast.LENGTH_LONG).show();
            Toast.makeText(this ,Wgth,Toast.LENGTH_LONG).show();
     // Toast.makeText(this,editW,Toast.LENGTH_SHORT).show();
        }
    }
}
package com.example.test2app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edithope;
    private TextView txthopy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setoupviews();
    }
private void setoupviews(){
        edithope = findViewById(R.id.txtcopy);
    txthopy = findViewById(R.id.txtcopy);

}
    public void btn_onclickHopies(View view) {
String hoppies = edithope.getText().toString();
txthopy.setVisibility(View.VISIBLE);
        Toast.makeText(this,hoppies,Toast.LENGTH_SHORT).show();
    }
}
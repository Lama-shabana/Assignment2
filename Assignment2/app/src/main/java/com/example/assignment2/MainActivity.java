package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    public void btnSaveOnClick(View view) {
//        CV[] userInfo = new CV[2];
//       // userInfo[0] = new userInfo("Java Core", "John");
//      //  userInfo[1] = new userInfo("C# in a Nutshell", "Mark");
//
//        // Book book = new Book("Professional C#", "Samer");
//
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
//        SharedPreferences.Editor editor = prefs.edit();
//       // Gson gson = new Gson();
//        String booksString = gson.toJson(userInfo);
//
//        editor.putString("123", booksString);
//        editor.commit();
//        Toast.makeText(this, "Data Saved:\n" + booksString,
//                Toast.LENGTH_SHORT).show();
//
//
//    }

//    public void btnLoadOnClick(View view) {
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
//      //  Gson gson = new Gson();
//        String str = prefs.getString("123", "");
//        CV[] userInfo = gson.fromJson(str, CV[].class);
//
//        Toast.makeText(this, "number of books" + userInfo.length
//                , Toast.LENGTH_SHORT).show();
//    }
}
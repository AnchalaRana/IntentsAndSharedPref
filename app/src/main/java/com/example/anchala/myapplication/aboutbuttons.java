package com.example.anchala.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class aboutbuttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutbuttons);


// TOAST
//        Toast toast = Toast.makeText(aboutbuttons.this , "hello",Toast.LENGTH_LONG);
//        toast.show();
//
//        WebView webView =findViewById(R.id.webview);
//        webView.loadUrl("https://google.com");

//          2nd Method
//        Button buttonSubmit = findViewById(R.id.button);
//        buttonSubmit.setOnClickListener(this);

        //3rd Method : Anonymous Method
//        Button buttonSubmit = findViewById(R.id.button);
//        buttonSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


        // 1st  Method using OnClick Attribute
//    public void submit(View view)
//    {
//        Log.d("ButtonClick", "submit: ");
//    }

        // 2nd Method Using Interface (i.e implements View.OnClickListener , we need to implement it )
//    @Override
//    public void onClick(View view) {
//        Log.d("ButtonClick", "submit: ");
//    }


    }

}

package com.example.anchala.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView textView;
    TextView phone_no;
    EditText Ent_phone_no;
    ImageButton Share_button , call_button , camera_button;
    ImageView Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.text_view1);
        phone_no = findViewById(R.id.phone_number);
        Ent_phone_no = findViewById(R.id.edit_text);
        Share_button = findViewById(R.id.share);
        call_button = findViewById(R.id.phonecall);
        camera_button = findViewById(R.id.camera);
        Image = findViewById(R.id.image_view);

        camera_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("camera intent", "onClick: camera");
                Intent camera_intent = new Intent();
                camera_intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent , 1888);
            }

            private void startActivityForResult(Intent camera_intent, int i) {

            }
        });

        call_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("call_intent", "onClick: Call button");
                Intent call_intent = new Intent();
                call_intent.setAction(Intent.ACTION_CALL);
                Log.d("call_intent", "onClick:action call");
                call_intent.setData(Uri.parse("tel:" + Ent_phone_no.getText()));
                Log.d("call_intent",Ent_phone_no.getText().toString());
                startActivity(call_intent);
            }
        });

        Share_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ShareButton", "onClick:Pressed ");
                Intent share_intent = new Intent();
                share_intent.setAction(Intent.ACTION_SEND);
                share_intent.putExtra(Intent.EXTRA_TEXT , textView.getText().toString());
                share_intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"abc@gmail.com"});
                share_intent.putExtra(Intent.EXTRA_SUBJECT,"Intents");
                Log.d("ShareButton", textView.getText().toString());
                share_intent.setType("text/plain");
                Log.d("ShareButton", "new Intent");
                startActivity(share_intent);
                Log.d("ShareButton", "Result");

            }

        });


        SharedPreferences.Editor preferences = getSharedPreferences("Anchala",MODE_PRIVATE).edit();
        preferences.putBoolean("isFirstTimeUser",true);
        preferences.commit();

        boolean isfirstUser;
        isfirstUser = preferences.getBoolean();
        if(isfirstUser)
        {
            Intent intent = new Intent();
            startActivity(intent);
        }

    }

}

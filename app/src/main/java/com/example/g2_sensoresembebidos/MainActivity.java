package com.example.g2_sensoresembebidos;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button camara;
    private Button bluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camara = (Button) findViewById(R.id.button_camara);
        bluetooth = (Button) findViewById(R.id.button_bluetooth);


        camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCamera();
            }
        });
    }
    private void onCamera(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 2);
    }
}
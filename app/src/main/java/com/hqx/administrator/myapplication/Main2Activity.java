package com.hqx.administrator.myapplication;

import android.content.Intent;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    Button bnt;
    ImageView bnt_abs;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
        getIntent();
        bnt = (Button) findViewById(R.id.activSend);
        bnt_abs = (ImageView) findViewById(R.id.absolutID);

        bnt_abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOptionsDialog();
            }
        });

        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOptionsDialog();

            }
        });

    }

    private void openOptionsDialog(){
        new AlertDialog.Builder(Main2Activity.this)
                .setTitle("关于 android xxxxxxxxx")
                .setMessage("Android BMl calc")
                .show();
    }
}

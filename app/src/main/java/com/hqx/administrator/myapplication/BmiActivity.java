package com.hqx.administrator.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class BmiActivity extends AppCompatActivity {
    EditText editWeight;
    EditText editHeight;

    String strHeight;
    String strWeight;

    Button bnt_send;
    Button bnt_cancel;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bmi);

        getIntent();

        bnt_send = (Button) findViewById(R.id.bnt_send);

        bnt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent();
            }
        });
    }

    private void openOptionsDialog(){
        new AlertDialog.Builder(BmiActivity.this)
                .setTitle("关于 android xxxxxxxxx")
                .setMessage("Android BMl calc")
                .show();
    }

    private void sendIntent(){
        intent = new Intent();
        editHeight = (EditText) findViewById(R.id.manHeight);
        editWeight = (EditText) findViewById(R.id.manWeight);

        strHeight = editHeight.getText().toString();
        strWeight = editWeight.getText().toString();
        intent.setClass(BmiActivity.this, addActivity.class);

        //Bundle bundle = new Bundle();

      //  bundle.putString("KEY_HEIGHT" , strHeight);
     //   bundle.putString("KEY_WEIGHT" , strWeight);
        intent.putExtra("KEY_HEIGHT" , strHeight);
        intent.putExtra("KEY_WEIGHT" , strWeight);

        startActivity(intent);

    }

    private void setParams () {
        bnt_send = (Button) findViewById(R.id.bnt_send);
        bnt_cancel = (Button) findViewById(R.id.bnt_cancel);

    }
}

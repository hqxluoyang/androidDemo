package com.hqx.administrator.myapplication;
import android.app.AlertDialog;
import android.content.Intent;
import android.widget.Toast;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button bntMessage;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        button = (Button) findViewById(R.id.submit);
        bntMessage = (Button) findViewById(R.id.sendMessage);

        bntMessage.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                openOptionsDialog();
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Toast.makeText(MainActivity.this , "BIM计算xxxxxx" , Toast.LENGTH_LONG).show();
                intent = new Intent();
                intent.setClass(MainActivity.this , BmiActivity.class);
                Bundle bundle = new Bundle();
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        Toast.makeText(MainActivity.this , "BIM计算" , Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this , "start android" , Toast.LENGTH_SHORT).show();
    }

    private void openOptionsDialog(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("关于 android")
                .setMessage("Android BMl calc")
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

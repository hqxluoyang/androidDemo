package com.hqx.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class addActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        getIntent();

        getValue();
    }

    private void getValue () {
        Bundle bundle = this.getIntent().getExtras();
        TextView textAdd = (TextView) findViewById(R.id.showAdd);
        double height = Double.parseDouble(bundle.getString("KEY_HEIGHT"));
        double weight = Double.parseDouble(bundle.getString("KEY_WEIGHT"));

        double add = height + weight;

        textAdd.setText("身高体重:" + add);

    }
}

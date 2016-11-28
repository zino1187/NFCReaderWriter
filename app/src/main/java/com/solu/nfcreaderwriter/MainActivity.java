package com.solu.nfcreaderwriter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    Switch my_swich;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_swich= (Switch)findViewById(R.id.my_swich);

        my_swich.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Toast.makeText(this, "스위치 바꿨어?", Toast.LENGTH_SHORT).show();
    }

}

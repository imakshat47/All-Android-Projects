package com.example.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherD extends AppCompatActivity {

    public static final String EXTRA_ONO = "OtherNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_d);

        int OtherNo = (Integer) getIntent().getExtras().get(EXTRA_ONO);

        Other other = Other.others[OtherNo];

        TextView name = (TextView)findViewById(R.id.name);
        TextView desc = (TextView)findViewById(R.id.desc);

        name.setText(other.getName());
        desc.setText(other.getDescription());
    }
}

package com.wrecked.byme.skuyfightcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pindah = findViewById(R.id.pindah);
        pindah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pindah:
                Intent pindah = new Intent(MainActivity.this,Pindah1.class);
                startActivity(pindah);
            break;
        }

    }

}
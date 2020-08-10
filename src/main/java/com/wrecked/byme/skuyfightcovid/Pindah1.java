package com.wrecked.byme.skuyfightcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pindah1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah1);

        Button pindahcuci = findViewById(R.id.pindahcuci);
        pindahcuci.setOnClickListener(this);
        Button pindahmasker = findViewById(R.id.pindahmasker);
        pindahmasker.setOnClickListener(this);
        Button pindahaktivitas = findViewById(R.id.pindahaktivitas);
        pindahaktivitas.setOnClickListener(this);
        Button exit = findViewById(R.id.exit);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pindahcuci:
                Intent pindahcuci = new Intent(Pindah1.this,cuci.class);
                startActivity(pindahcuci);
                break;
        }
        switch (v.getId()) {
            case R.id.pindahmasker:
                Intent pindahmasker = new Intent(Pindah1.this,masker.class);
                startActivity(pindahmasker);
                break;
        }
        switch (v.getId()) {
            case R.id.pindahaktivitas:
                Intent pindahaktivitas = new Intent(Pindah1.this,pola.class);
                startActivity(pindahaktivitas);
                break;
        }
        switch (v.getId()) {
            case R.id.exit:
                Intent exit = new Intent(Pindah1.this,exit.class);
                startActivity(exit);
                break;

        }
    }

}
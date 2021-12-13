package com.example.tiendadechaquetas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Formularioactivity extends AppCompatActivity {

      private TextView titulo;
      String name = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formularioactivity);

        titulo = (TextView)  findViewById(R.id.titulo);
        Intent intent = getIntent();
         name = intent.getStringExtra("name");

         titulo.setText(name);
    }

}
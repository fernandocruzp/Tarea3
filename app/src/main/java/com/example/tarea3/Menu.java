package com.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button registro, revisar, notas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        registro = (Button) findViewById(R.id.boton_registro);
        revisar = (Button) findViewById(R.id.boton_revisar_registro);
        notas =(Button) findViewById(R.id.boton_notas);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,RegistroTutorias.class);
                startActivity(intent);
            }
        });
        revisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,RevisarTutorias.class);
                startActivity(intent);
            }
        });
        notas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Notas.class);
                startActivity(intent);
            }
        });
    }
}
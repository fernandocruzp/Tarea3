package com.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class RevisarTutorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revisar_tutorias);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.bar_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.menu_principal){
            Log.d("Accion", (String) "Menú principal");
            Intent intent = new Intent(RevisarTutorias.this, MenuPrincipal.class);
            startActivity(intent);
            return true;
        }
        if(id == R.id.adios){
            Log.d("Accion", (String) "Cerrar sesión");
            Intent intent2 = new Intent(RevisarTutorias.this, InicioSesion.class);
            startActivity(intent2);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
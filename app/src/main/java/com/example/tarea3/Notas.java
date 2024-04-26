package com.example.tarea3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

public class Notas extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout= findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_vista);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.abrir_nav,R.string.cerrar_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contenedor, new ListarNotas()).commit();
            navigationView.setCheckedItem(R.id.listar);
        }
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
            Intent intent = new Intent(Notas.this, MenuPrincipal.class);
            startActivity(intent);
            return true;
        }
        if(id == R.id.adios){
            Log.d("Accion", (String) "Cerrar sesión");
            Intent intent2 = new Intent(Notas.this, InicioSesion.class);
            startActivity(intent2);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.listar){
            Log.d("NOtas","Listar");
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contenedor, new ListarNotas()).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
        if (item.getItemId() == R.id.nueva){
            Log.d("Notas","nuevas");
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contenedor,new NuevaNota()).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
        return false;
    }
    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
}
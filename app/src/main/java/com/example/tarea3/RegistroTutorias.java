package com.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegistroTutorias extends AppCompatActivity {
    private EditText editTextTutorName, editTextSchedule, editTextSpecificQuestion;
    private RadioGroup radioGroupUrgency;
    private Button buttonRegisterTutorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_tutorias);
        editTextTutorName = (EditText) findViewById(R.id.edit_text_tutor_name);
        editTextSchedule = (EditText) findViewById(R.id.edit_text_schedule);
        editTextSpecificQuestion = (EditText) findViewById(R.id.edit_text_specific_question);
        radioGroupUrgency = (RadioGroup) findViewById(R.id.radio_group_urgency);
        buttonRegisterTutorial = (Button) findViewById(R.id.button_register_tutorial);
        buttonRegisterTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistroTutorias.this,"Registro completado",Toast.LENGTH_SHORT);
            }
        });
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
            Intent intent = new Intent(RegistroTutorias.this, MenuPrincipal.class);
            startActivity(intent);
            return true;
        }
        if(id == R.id.adios){
            Log.d("Accion", (String) "Cerrar sesión");
            Intent intent2 = new Intent(RegistroTutorias.this, InicioSesion.class);
            startActivity(intent2);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
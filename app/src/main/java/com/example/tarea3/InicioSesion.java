package com.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InicioSesion extends AppCompatActivity {
    private EditText editTextStudentId, editTextPassword;
    private Button btnInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        editTextStudentId = (EditText) findViewById(R.id.edit_text_student_id);
        editTextPassword = (EditText) findViewById(R.id.edit_text_password);
        btnInicio=(Button) findViewById(R.id.boton_inicio);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioSesion.this, MenuPrincipal.class);
                Toast.makeText(InicioSesion.this,"BIenvenido",Toast
                        .LENGTH_SHORT);
                startActivity(intent);
            }
        });
    }
}
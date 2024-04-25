package com.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName, editTextStudentId, editTextPassword;
    private CheckBox checkBoxCiencias, checkBoxMatematicas, checkBoxActuaria, checkBoxFisica;
    private Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Registro alumno
        setContentView(R.layout.activity_main);
        editTextName = (EditText) findViewById(R.id.edit_text_name);
        editTextStudentId = (EditText) findViewById(R.id.edit_text_student_id);
        editTextPassword = (EditText) findViewById(R.id.edit_text_password);
        checkBoxCiencias = (CheckBox) findViewById(R.id.checkbox_ciencias_computacion);
        checkBoxMatematicas = (CheckBox)findViewById(R.id.checkbox_matematicas);
        checkBoxActuaria = (CheckBox)findViewById(R.id.checkbox_actuaria);
        checkBoxFisica = (CheckBox)findViewById(R.id.checkbox_fisica);
        btnRegistrar = (Button) findViewById(R.id.boton_regisgtrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,InicioSesion.class);
                Toast.makeText(MainActivity.this,"Alumno registrado",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}

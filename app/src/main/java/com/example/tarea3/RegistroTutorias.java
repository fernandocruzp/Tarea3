package com.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    }
}
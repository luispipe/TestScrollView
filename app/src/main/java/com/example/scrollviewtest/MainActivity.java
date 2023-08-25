package com.example.scrollviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    //Score va a llevar la nota del Test
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Traer elemento Pregunta 1
        CheckBox q1Ans1= findViewById(R.id.checkboxQ1Ans1);
        CheckBox q1Ans2= findViewById(R.id.checkboxQ1Ans2);
        CheckBox q1Ans3= findViewById(R.id.checkboxQ1Ans3);
        CheckBox q1Ans4= findViewById(R.id.checkboxQ1Ans4);

        //Traer elemento Pregunta 2
        RadioButton q2Ans1= findViewById(R.id.rbtnQ2Ans1);
        RadioButton q2Ans2= findViewById(R.id.rbtnQ2Ans2);
        RadioButton q2Ans3= findViewById(R.id.rbtnQ2Ans3);
        RadioButton q2Ans4= findViewById(R.id.rbtnQ2Ans4);

        //Traer elemento Pregunta 3
        RadioButton q3Ans1= findViewById(R.id.rbtnQ3Ans1);
        RadioButton q3Ans2= findViewById(R.id.rbtnQ3Ans2);
        RadioButton q3Ans3= findViewById(R.id.rbtnQ3Ans3);
        RadioButton q3Ans4= findViewById(R.id.rbtnQ3Ans4);

        //Traer elemento Pregunta 4
        CheckBox q4Ans1= findViewById(R.id.checkboxQ4Ans1);
        CheckBox q4Ans2= findViewById(R.id.checkboxQ4Ans2);
        CheckBox q4Ans3= findViewById(R.id.checkboxQ4Ans3);
        CheckBox q4Ans4= findViewById(R.id.checkboxQ4Ans4);

        //Traer elemento Pregunta 5
        RadioButton q5Ans1= findViewById(R.id.rbtnQ5Ans1);
        RadioButton q5Ans2= findViewById(R.id.rbtnQ5Ans2);
        RadioButton q5Ans3= findViewById(R.id.rbtnQ5Ans3);
        RadioButton q5Ans4= findViewById(R.id.rbtnQ5Ans4);

        //Button y las intenciones para la vista de aprobar o reprobar

        Button enviar= findViewById(R.id.btnEnviar);
        Intent pass= new Intent(getApplicationContext(), PassActivity.class);
        Intent fail= new Intent(getApplicationContext(), FailActivity.class);

        //Lógica si el usuario acierta 3 de 5 aprueba

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=0;
                //Verificar respuesta 1
                if (!q1Ans1.isChecked() && q1Ans2.isChecked()
                    && q1Ans3.isChecked() && !q1Ans4.isChecked()
                ){
                    //score++ es igual a sumarle 1 a el valor que tiene score
                    score++;
                }
                //Verificar respuesta 2

                //Verificar respuesta 3

                //Verificar respuesta 4

                //Verificar respuesta 5

            }
        });




    }
}
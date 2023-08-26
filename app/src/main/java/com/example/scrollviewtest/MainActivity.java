package com.example.scrollviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    //Score va a llevar la nota del Test y int es para número enteros
    int calificacion;

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

        //Lógica funcionamiento radio button
        q2Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2Ans2.setChecked(false);
                q2Ans3.setChecked(false);
                q2Ans4.setChecked(false);
            }
        });
        q2Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2Ans1.setChecked(false);
                q2Ans3.setChecked(false);
                q2Ans4.setChecked(false);
            }
        });
        q2Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2Ans2.setChecked(false);
                q2Ans1.setChecked(false);
                q2Ans4.setChecked(false);
            }
        });
        q2Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2Ans2.setChecked(false);
                q2Ans3.setChecked(false);
                q2Ans1.setChecked(false);
            }
        });
        q3Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3Ans2.setChecked(false);
                q3Ans3.setChecked(false);
                q3Ans4.setChecked(false);
            }
        });

        q3Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3Ans1.setChecked(false);
                q3Ans3.setChecked(false);
                q3Ans4.setChecked(false);
            }
        });
        q3Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3Ans2.setChecked(false);
                q3Ans1.setChecked(false);
                q3Ans4.setChecked(false);
            }
        });
        q3Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3Ans2.setChecked(false);
                q3Ans3.setChecked(false);
                q3Ans1.setChecked(false);
            }
        });
        q5Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5Ans2.setChecked(false);
                q5Ans3.setChecked(false);
                q5Ans4.setChecked(false);
            }
        });


        q5Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5Ans1.setChecked(false);
                q5Ans3.setChecked(false);
                q5Ans4.setChecked(false);
            }
        });
        q5Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5Ans2.setChecked(false);
                q5Ans1.setChecked(false);
                q5Ans4.setChecked(false);
            }
        });
        q5Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5Ans2.setChecked(false);
                q5Ans3.setChecked(false);
                q5Ans1.setChecked(false);
            }
        });

        //Lógica si el usuario acierta 3 de 5 aprueba

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calificacion=0;
                //Verificar respuesta 1
                if (!q1Ans1.isChecked() && q1Ans2.isChecked()
                    && q1Ans3.isChecked() && !q1Ans4.isChecked()
                ){
                    //score++ es igual a sumarle 1 a el valor que tiene score
                    calificacion++;
                }
                //Verificar respuesta 2
                if (q2Ans2.isChecked()){
                    calificacion++;
                }

                //Verificar respuesta 3
                if (q3Ans3.isChecked()){
                    calificacion++;
                }
                //Verificar respuesta 4
                if (!q4Ans1.isChecked() && q4Ans2.isChecked()
                && q4Ans3.isChecked() && !q4Ans4.isChecked()){
                    calificacion++;
                }
                //Verificar respuesta 5
                if (q5Ans2.isChecked()){
                    calificacion++;
                }

                if (calificacion>=3){
                    startActivity(pass);
                }else{
                    startActivity(fail);
                }

            }
        });




    }
}
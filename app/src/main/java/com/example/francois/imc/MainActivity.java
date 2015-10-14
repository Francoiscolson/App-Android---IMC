package com.example.francois.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Taille;
    EditText Poids;
    TextView result;
    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Taille = (EditText)findViewById(R.id.taille);
    Poids = (EditText)findViewById(R.id.poids);
        result = (TextView)findViewById(R.id.result);
        group= (RadioGroup)findViewById(R.id.group);
    }
        public void Click (View v)
    {
        String t = Taille.getText().toString();
        String p = Poids.getText().toString();
        switch (v.getId()){
             case R.id.envoie2:
                 float tValue = Float.valueOf(t);
                 float pValue = Float.valueOf(p);
                 if(tValue== 0 || pValue == 0){
                     Toast.makeText(getApplication(),"Vous devez entrer une valeur correcte svp", Toast.LENGTH_LONG).show();
                 }
                 else {

                     if(group.getCheckedRadioButtonId()== R.id.centi) {
                         tValue = tValue/100;
                         float imc = pValue / (tValue * tValue);
                         result.setText("Votre IMC est de : " + String.valueOf(imc));
                     }
                     else
                     {
                         float imc = pValue / (tValue * tValue);
                         result.setText("Votre IMC est de : " + String.valueOf(imc));

                     }
                 }
         }
    }

    }





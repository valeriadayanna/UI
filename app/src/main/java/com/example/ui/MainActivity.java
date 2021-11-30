package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import Modelo.Persona;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre,txtFechaNac,txtTelefono;
    RadioButton rdbMasculino,rdbFemenino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre=(EditText) findViewById(R.id.txtNombre);
        txtFechaNac=(EditText) findViewById(R.id.txtFechNac);
        txtTelefono=(EditText) findViewById(R.id.txtTelefono);
        rdbMasculino=(RadioButton) findViewById(R.id.rdbMaculino);
        rdbFemenino=(RadioButton) findViewById(R.id.rdbFemenino);
    }
    public void EventoClick(View vista)
    {
        String genero;
        if (rdbMasculino.isChecked())
        {
            genero="masculino";
        }
        else
                {
                      genero="femenino";
                }

        Persona persona=new Persona(txtNombre.getText().toString(),txtFechaNac.getText().toString(),genero,txtTelefono.getText().toString());
        Intent intent=new Intent(MainActivity.this, Inicio.class);
        Bundle bundle =new Bundle();
        bundle.putSerializable("Persona",persona);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
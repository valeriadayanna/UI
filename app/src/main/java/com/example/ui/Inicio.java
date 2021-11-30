package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import Modelo.Persona;

public class Inicio extends AppCompatActivity {
    TextView lblNombre,lblFechaNac,lblTelefono,lblGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Bundle bundle = this.getIntent().getExtras();
        Persona persona= (Persona) bundle.getSerializable("Persona");
        lblNombre=(TextView) findViewById(R.id.lblNombre);
        lblFechaNac=(TextView) findViewById(R.id.lblFecha);
        lblTelefono=(TextView) findViewById(R.id.lblTelefono);
        lblGenero=(TextView) findViewById(R.id.lblGenero);

        lblNombre.setText(persona.getNombre());
        lblFechaNac.setText(persona.getFecha());
        lblTelefono.setText(persona.getTelefono());
        lblGenero.setText(persona.getGenero());

    }
}
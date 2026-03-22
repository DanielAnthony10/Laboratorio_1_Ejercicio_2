package com.example.laboratorio_1_ejercicio_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellidos, etEdad;
    Button btnRegistrar;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etEdad = findViewById(R.id.etEdad);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        tvResultado = findViewById(R.id.tvResultado);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = etNombre.getText().toString();
                String apellidos = etApellidos.getText().toString();
                String edad = etEdad.getText().toString();

                tvResultado.setText(
                        "Estudiante registrado:\n" +
                                "Nombre: " + nombre + "\n" +
                                "Apellidos: " + apellidos + "\n" +
                                "Edad: " + edad
                );
            }
        });
    }
}
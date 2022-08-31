package com.example.calculadoraf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Resultados(View view) {
        EditText valor1 = (EditText) findViewById(R.id.EditValor1);
        EditText valor2 = (EditText) findViewById(R.id.EditValor2);
        TextView result = (TextView) findViewById(R.id.txtResultado);
        int v1 = Integer.parseInt(valor1.getText().toString());
        int v2 = Integer.parseInt(valor2.getText().toString());
        result.setText("El resultado es: "+String.valueOf(v1+v2));
    }
}
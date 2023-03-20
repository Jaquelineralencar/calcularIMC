package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText nome, peso, altura;
    private TextView resultado;
    private Button calcularImc;
    private double imcResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.etNome);
        peso = findViewById(R.id.etPeso);
        altura = findViewById(R.id.etAltura);
        resultado = findViewById(R.id.txtResultado);
        calcularImc = findViewById(R.id.btnCalculaImc);
        calcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double alturadouble = Double.parseDouble(altura.getText().toString());
               double pesodouble = Double.parseDouble(peso.getText().toString());
                imcResultado = (pesodouble/(alturadouble*alturadouble));
                DecimalFormat indice = new DecimalFormat("##,##");
                resultado.setText("Olá, " + nome.getText() + "seu IMC é de " + indice.format(imcResultado));
            }
        });
    }

}
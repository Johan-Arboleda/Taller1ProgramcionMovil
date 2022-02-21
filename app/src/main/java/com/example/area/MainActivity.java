package com.example.area;

import static com.example.area.R.id.cargarDato;
import static com.example.area.R.id.valorBaseUno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView UserDB;
    private TextView cargarDato;
    EditText ladoUno,ladoDos, baseUno, alturaUno;
    RadioButton rectangulo,triangulo;
    TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ladoUno = (EditText) findViewById(R.id.valorLadoUno);
        ladoDos = (EditText) findViewById(R.id.valorLadoDos);
        baseUno = (EditText) findViewById(R.id.valorBaseUno);
        alturaUno = (EditText) findViewById(R.id.valorAlturaUno);
        rectangulo = (RadioButton) findViewById(R.id.radioAreaRectangulo);
        triangulo = (RadioButton) findViewById(R.id.radioAreaTriangulo);
        resultado = (TextView) findViewById(R.id.resultado);

        cargarDato = (TextView) findViewById(R.id.cargarDato);



    }
    public void calcularAreas(View view){


        if (rectangulo.isChecked()){
            float sideOne = Float.parseFloat(ladoUno.getText().toString());
            float sideTwo = Float.parseFloat(ladoDos.getText().toString());
            resultado.setText(String.valueOf(sideOne*sideTwo));

        }
        if(triangulo.isChecked()){
            float baseOne = Float.parseFloat(baseUno.getText().toString());
            float alturaOne = Float.parseFloat(alturaUno.getText().toString());
            resultado.setText(String.valueOf((baseOne*alturaOne)/2));

        }
        cargarDato.setText(" ");
    }




    public void guardarDatos(View view){
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor objeto=preferencias.edit();
        objeto.putString("usuarios", resultado.getText().toString());
        objeto.commit();
        resultado.setText("Resultado");

    }

    public void cargarDatos(View view){
        SharedPreferences preferences= getSharedPreferences("datos", Context.MODE_PRIVATE);
        cargarDato.setText(preferences.getString("usuarios", ""));

    }




}
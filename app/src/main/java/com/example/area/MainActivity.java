package com.example.area;

import static com.example.area.R.id.valorBaseUno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
    }

    public void calcularAreas(View view){
        if (rectangulo.isChecked()){
            int sideOne = Integer.parseInt(ladoUno.getText().toString());
            int sideTwo = Integer.parseInt(ladoDos.getText().toString());
            resultado.setText(String.valueOf(sideOne*sideTwo));

        }
        if(triangulo.isChecked()){
            float baseOne = Float.parseFloat(baseUno.getText().toString());
            float alturaOne = Float.parseFloat(alturaUno.getText().toString());
            resultado.setText(String.valueOf((baseOne*alturaOne)/2));
        }
    }
}
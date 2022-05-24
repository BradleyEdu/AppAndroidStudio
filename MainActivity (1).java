package com.example.resistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView color1,color2,color3,color4,tvResultado,tvResTol;
    Button btnCalcular,btnRegresar;
    Spinner spin1,spin2,spin3,spin4;
    String col,tole="";
    int valor=0;

    String[] colores = {"NEGRO", "CAFE", "ROJO", "NARANJA","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO"};
    String[] tolerancia = {"NADA","DORADO","PLATA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color1=findViewById(R.id.color1);
        color2=findViewById(R.id.color2);
        color3=findViewById(R.id.color3);
        color4=findViewById(R.id.color4);
        tvResultado=findViewById(R.id.tvResultado);
        tvResTol=findViewById(R.id.tvResTol);

        btnCalcular=findViewById(R.id.btnCalcular);
        btnRegresar=findViewById(R.id.btnRegresar);

        spin1=findViewById(R.id.spin1);
        spin2=findViewById(R.id.spin2);
        spin3=findViewById(R.id.spin3);
        spin4=findViewById(R.id.spin4);

        ArrayAdapter<String> color = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, colores);
        spin1.setAdapter(color);
        spin2.setAdapter(color);
        spin3.setAdapter(color);
        final ArrayAdapter<String> tol = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, tolerancia);
        spin4.setAdapter(tol);

        System.out.println("Llegue aqui");

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                col = spin1.getSelectedItem().toString();

                switch (col){
                    case  "NEGRO":
                        color1.setBackgroundColor(getResources().getColor(R.color.Negro));
                        valor+=0;
                        break;
                    case  "CAFE":
                        color1.setBackgroundColor(getResources().getColor(R.color.Cafe));
                        valor+=10;
                        break;
                    case  "ROJO":
                        color1.setBackgroundColor(getResources().getColor(R.color.Rojo));
                        valor+=20;
                        break;
                    case  "NARANJA":
                        color1.setBackgroundColor(getResources().getColor(R.color.Naranja));
                        valor+=30;
                        break;
                    case  "AMARILLO":
                        color1.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                        valor+=40;
                        break;
                    case  "VERDE":
                        color1.setBackgroundColor(getResources().getColor(R.color.Verde));
                        valor+=50;
                        break;
                    case  "AZUL":
                        color1.setBackgroundColor(getResources().getColor(R.color.Azul));
                        valor+=60;
                        break;
                    case  "VIOLETA":
                        color1.setBackgroundColor(getResources().getColor(R.color.Violeta));
                        valor+=70;
                        break;
                    case  "GRIS":
                        color1.setBackgroundColor(getResources().getColor(R.color.Gris));
                        valor+=80;
                        break;
                    case  "BLANCO":
                        color1.setBackgroundColor(getResources().getColor(R.color.Blanco));
                        valor+=90;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //valor+="0";
            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                col = spin2.getSelectedItem().toString();

                switch (col){
                    case  "NEGRO":
                        color2.setBackgroundColor(getResources().getColor(R.color.Negro));
                        valor+=0;
                        break;
                    case  "CAFE":
                        color2.setBackgroundColor(getResources().getColor(R.color.Cafe));
                        valor+=1;
                        break;
                    case  "ROJO":
                        color2.setBackgroundColor(getResources().getColor(R.color.Rojo));
                        valor+=2;
                        break;
                    case  "NARANJA":
                        color2.setBackgroundColor(getResources().getColor(R.color.Naranja));
                        valor+=3;
                        break;
                    case  "AMARILLO":
                        color2.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                        valor+=4;
                        break;
                    case  "VERDE":
                        color2.setBackgroundColor(getResources().getColor(R.color.Verde));
                        valor+=5;
                        break;
                    case  "AZUL":
                        color2.setBackgroundColor(getResources().getColor(R.color.Azul));
                        valor+=6;
                        break;
                    case  "VIOLETA":
                        color2.setBackgroundColor(getResources().getColor(R.color.Violeta));
                        valor+=7;
                        break;
                    case  "GRIS":
                        color2.setBackgroundColor(getResources().getColor(R.color.Gris));
                        valor+=8;
                        break;
                    case  "BLANCO":
                        color2.setBackgroundColor(getResources().getColor(R.color.Blanco));
                        valor+=9;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //valor+="0";
            }
        });

        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                col = spin3.getSelectedItem().toString();

                switch (col){
                    case  "NEGRO":
                        color3.setBackgroundColor(getResources().getColor(R.color.Negro));
                        valor*=1;
                        break;
                    case  "CAFE":
                        color3.setBackgroundColor(getResources().getColor(R.color.Cafe));
                        valor*=10;
                        break;
                    case  "ROJO":
                        color3.setBackgroundColor(getResources().getColor(R.color.Rojo));
                        valor*=100;
                        break;
                    case  "NARANJA":
                        color3.setBackgroundColor(getResources().getColor(R.color.Naranja));
                        valor*=1000;
                        break;
                    case  "AMARILLO":
                        color3.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                        valor*=10000;
                        break;
                    case  "VERDE":
                        color3.setBackgroundColor(getResources().getColor(R.color.Verde));
                        valor*=100000;
                        break;
                    case  "AZUL":
                        color3.setBackgroundColor(getResources().getColor(R.color.Azul));
                        valor*=1000000;
                        break;
                    case  "VIOLETA":
                        color3.setBackgroundColor(getResources().getColor(R.color.Violeta));
                        valor*=10000000;
                        break;
                    case  "GRIS":
                        color3.setBackgroundColor(getResources().getColor(R.color.Gris));
                        valor*=100000000;
                        break;
                    case  "BLANCO":
                        color3.setBackgroundColor(getResources().getColor(R.color.Blanco));
                        valor*=1000000000;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //valor+="";
            }
        });

        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                col = spin4.getSelectedItem().toString();

                switch (col){
                    case  "DORADO":
                        color4.setBackgroundColor(getResources().getColor(R.color.Amarillo));
                        tole+="5 %";
                        break;
                    case  "PLATA":
                        color4.setBackgroundColor(getResources().getColor(R.color.Gris));
                        tole+="10 %";
                        break;
                    case  "NADA":
                        color4.setBackgroundColor(getResources().getColor(R.color.Blanco));
                        tole+="20 %";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                tole+="";
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bal;
                bal =Integer.toString(valor);
                tvResultado.setText(bal);
                tvResTol.setText(tole);
                btnCalcular.setVisibility(View.INVISIBLE);
                //tole="";
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResultado.setText("");
                tvResTol.setText("");

                spin1.setSelection(0);
                spin2.setSelection(0);
                spin3.setSelection(0);
                spin4.setSelection(0);

                valor=0;
                tole="";
                btnCalcular.setVisibility(View.VISIBLE);
            }
        });

    }


}

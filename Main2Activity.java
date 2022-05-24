package com.example.matefacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView tvFactor,tvFactor2,tvSigno,tvResultado,tvSco;
    Button btnOpc1,btnOpc2,btnOpc3,btnContinuar,btnRegresar;

    int score,num1,num2,respuesta,resPulsado;
    String sco;
    boolean puls=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvFactor=findViewById(R.id.tvFactor);
        tvFactor2=findViewById(R.id.tvFactor2);
        tvSigno=findViewById(R.id.tvSigno);
        tvResultado=findViewById(R.id.tvResultado);
        tvSco=findViewById(R.id.tvSco);

        btnOpc1=findViewById(R.id.btnOpc1);
        btnOpc2=findViewById(R.id.btnOpc2);
        btnOpc3=findViewById(R.id.btnOpc3);
        btnContinuar=findViewById(R.id.btnContinuar);
        btnRegresar=findViewById(R.id.btnRegresar);



        SharedPreferences miCompartido=getSharedPreferences("datos", Context.MODE_PRIVATE);
        tvSco.setText(miCompartido.getString("elDato",""));

        generarSuma();

        btnOpc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= (String) btnOpc1.getText();
                tvResultado.setText(res);
                resPulsado = Integer.parseInt(res);
                puls=true;
            }
        });

        btnOpc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= (String) btnOpc2.getText();
                tvResultado.setText(res);
                resPulsado = Integer.parseInt(res);
                puls=true;
            }
        });

        btnOpc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res= (String) btnOpc3.getText();
                tvResultado.setText(res);
                resPulsado = Integer.parseInt(res);
                puls=true;
            }
        });

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (puls){
                    if(resPulsado == respuesta){
                        Toast.makeText(Main2Activity.this,"Bien Hecho!!!", Toast.LENGTH_SHORT).show();
                        generarSuma();

                        SharedPreferences preferencias=getSharedPreferences("datos",Context.MODE_PRIVATE);
                        System.out.println("ESTO ES LO QUE SE IMPRIME"+preferencias.getString("elDato",""));
                        score=Integer.parseInt(preferencias.getString("elDato","")) + 1;
                        SharedPreferences.Editor editor=preferencias.edit();
                        editor.putString("elDato",Integer.toString(score));
                        editor.commit();
                        tvSco.setText(Integer.toString(score));
                        resPulsado=0;
                        puls=false;
                    }else{
                        Toast.makeText(Main2Activity.this,"Vuelve a Intentarlo", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Main2Activity.this, IntenteDeNuevo.class));
                    }
                }else{
                    Toast.makeText(Main2Activity.this,"INGRESE UNA RESPUESTA", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });
    }

    public void generarSuma(){
        num1 = (int) (Math.random() * 9) + 1;
        num2 = (int) (Math.random() * 9) + 1;

        int numG1 = (int) (Math.random() * 19) + 1;
        int numG2 = (int) (Math.random() * 19) + 1;

        if(score<=5){
            respuesta = num1 + num2;
            botonAleatorio(respuesta);
            tvFactor.setText(Integer.toString(num1));
            tvFactor2.setText(Integer.toString(num2));
            tvSigno.setText("+");
        }else if(score<=10 && score>5){
            if(num2 > num1){
                int aux=num1;
                num1=num2;
                num2=aux;
            }
            respuesta = num1 - num2;
            botonAleatorio(respuesta);
            tvFactor.setText(Integer.toString(num1));
            tvFactor2.setText(Integer.toString(num2));
            tvSigno.setText("-");
        }else if(score<=15 && score>10){
            respuesta = num1 * num2;
            botonAleatorio(respuesta);
            tvFactor.setText(Integer.toString(num1));
            tvFactor2.setText(Integer.toString(num2));
            tvSigno.setText("x");
        }else if(score<=20 && score>15){
            if(num2 > num1){
                int aux=num1;
                num1=num2;
                num2=aux;
            }
            respuesta = num1 / num2;
            botonAleatorio(respuesta);
            tvFactor.setText(Integer.toString(num1));
            tvFactor2.setText(Integer.toString(num2));
            tvSigno.setText("/");
        }else if(score<=25 && score>20){
            respuesta = numG1 + numG2;
            botonAleatorio(respuesta);
            tvFactor.setText(Integer.toString(numG1));
            tvFactor2.setText(Integer.toString(numG2));
            tvSigno.setText("+");
        }else if(score<=30 && score>25){
            respuesta = numG1 - numG2;
            botonAleatorio(respuesta);
            tvFactor.setText(Integer.toString(numG1));
            tvFactor2.setText(Integer.toString(numG2));
            tvSigno.setText("-");
        }
    }

    public void botonAleatorio(int res){
        int ale = (int) (Math.random() * 3) + 1;
        int val1 = (int) (Math.random() * 20) + 1;
        int val2 = (int) (Math.random() * 20) + 1;

        switch (ale){
            case 1:
                btnOpc1.setText(Integer.toString(res));
                btnOpc2.setText(Integer.toString(val1));
                btnOpc3.setText(Integer.toString(val2));
                break;
            case 2:
                btnOpc1.setText(Integer.toString(val1));
                btnOpc2.setText(Integer.toString(res));
                btnOpc3.setText(Integer.toString(val2));
                break;
            case 3:
                btnOpc1.setText(Integer.toString(val1));
                btnOpc2.setText(Integer.toString(val2));
                btnOpc3.setText(Integer.toString(res));
                break;
        }
    }
}

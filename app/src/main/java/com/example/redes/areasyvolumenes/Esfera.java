package com.example.redes.areasyvolumenes;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Esfera extends AppCompatActivity {
    private EditText cajaRadio;
    private Intent in;
    private Bundle b;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        cajaRadio = (EditText)findViewById(R.id.txtRadio2);
        resources = this.getResources();

        in = new Intent(this,Resultado5.class);
        b = new Bundle();
    }

    public void esfera(View v){
        String operacion, dato, rad, aux="";
        double rad2;
        double pi = 3.1416;

        if(validar()){
            rad = cajaRadio.getText().toString();
            rad2 = Integer.parseInt(rad);

            operacion = resources.getString(R.string.volumenEsfera);
            dato = resources.getString(R.string.radio2)+" " + rad2;

            rad2 = (4*pi*Math.pow(rad2,3))/3;
            aux = aux+rad2+" mts³";

            b.putString("ResultadoEsfera", aux);
            in.putExtras(b);
            Operacion o = new Operacion(operacion,dato,aux);
            o.guardar();
            startActivity(in);
        }
    }

    public boolean validar(){
        if(cajaRadio.getText().toString().isEmpty()){
            cajaRadio.setError(resources.getString(R.string.errorRadio));
            return false;
        }
        if(cajaRadio.getText().toString().equalsIgnoreCase("0")){
            cajaRadio.setError(resources.getString(R.string.errorCero));
            return false;
        }
        return true;
    }

    public void borrar1(View v){
        limpiar();
    }

    public void limpiar(){
        cajaRadio.setText("");
        cajaRadio.requestFocus();
    }
}


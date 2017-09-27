package com.example.redes.areasyvolumenes;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Circulo extends AppCompatActivity {
    private EditText cajaRadio;
    private Intent in;
    private Bundle b;
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        cajaRadio = (EditText)findViewById(R.id.txtRadio);
        resources = this.getResources();

        in = new Intent(this,Resultado2.class);
        b = new Bundle();
    }
    public void circulo(View v){
        String operacion, dato, rad, aux="";
        double rad2;
        double pi = 3.1416;

        if(validar()){
            rad = cajaRadio.getText().toString();
            rad2 = Integer.parseInt(rad);

            operacion = resources.getString(R.string.areaCirculo);
            dato = resources.getString(R.string.radio2)+" "+rad2+"\n"+"Pi: "+pi;

            rad2 = (rad2*rad2)*pi;
            aux = aux+rad2+" mts²";

            b.putString("ResultadoCirculo", aux);
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
        return true;
    }

    public void borrar2(View v){ limpiar();}

    public void limpiar(){
        cajaRadio.setText("");
        cajaRadio.requestFocus();
    }
}

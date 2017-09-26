package com.example.redes.areasyvolumenes;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cono extends AppCompatActivity {
    private EditText cajaRadio;
    private EditText cajaAltura;
    private Intent in;
    private Bundle b;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        cajaRadio = (EditText)findViewById(R.id.txtRadio4);
        cajaAltura = (EditText)findViewById(R.id.txtAltura3);
        resources = this.getResources();

        in = new Intent(this,Resultado7.class);
        b = new Bundle();
    }
    public void cono(View v){
        String operacion, dato, rad,alt, aux="";
        double rad2,alt2,res;
        double pi = 3.1416;

        if(validar()){
            rad = cajaRadio.getText().toString();
            rad2 = Integer.parseInt(rad);
            alt=cajaAltura.getText().toString();
            alt2=Integer.parseInt(alt);

            operacion = resources.getString(R.string.volumenCono);
            dato = resources.getString(R.string.radio2)+" " + rad2 + "\n"+resources.getString(R.string.altura2)+" " + alt2;

            res = (pi*Math.pow(rad2,2)*alt2)/3;
            aux = aux+res+" mts³";

            b.putString("ResultadoCono", aux);
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
        if(cajaAltura.getText().toString().isEmpty()){
            cajaAltura.setError(resources.getString(R.string.errorAltura));
            return false;
        }
        return true;
    }

    public void borrar1(View v){
        limpiar();
    }

    public void limpiar(){
        cajaRadio.setText("");
        cajaAltura.setText("");
        cajaRadio.requestFocus();
    }
}

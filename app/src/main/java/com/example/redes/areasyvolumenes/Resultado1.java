package com.example.redes.areasyvolumenes;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado1 extends AppCompatActivity {
    private TextView enviado;
    private Bundle b;
    private String resultado, aux;
    private Resources resources;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        enviado = (TextView)findViewById(R.id.txtResultadoCua);
        b = getIntent().getExtras();
        resultado = b.getString("ResultadoCuadrado");
        resources = this.getResources();

        aux = resources.getString(R.string.area)+" "+resultado;

        enviado.setText(aux);


      /*  AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(resources.getString(R.string.result));
        builder.setMessage(aux)
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        in = new Intent(Resultado1.this, Cuadrado.class);
                        startActivity(in);
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();*/
    }


}

package com.example.redes.areasyvolumenes;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado1 extends AppCompatActivity {
    private TextView enviado;
    private Bundle b;
    private String resultado, aux;
    private Resources resources;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1);
    }

}

package com.example.redes.areasyvolumenes;

/**
 * Created by ANDRES on 27/09/2017.
 */

public class Operacion1 {
    private String opera;
    private String dato;
    private String dato2;
    private String result;

    public Operacion1(String opera, String dato, String dato2, String result) {
        this.opera = opera;
        this.dato = dato;
        this.dato2 = dato2;
        this.result = result;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void guardar(){
        Datos.guardar1(this);
    }
}

package com.example.redes.areasyvolumenes;

import java.util.ArrayList;

/**
 * Created by Redes on 22/09/2017.
 */

public class Datos {
    private static ArrayList<Operacion> operaciones = new ArrayList<>();

    public static void guardar(Operacion o) { operaciones.add(o); }

    public static ArrayList<Operacion> getOperaciones() {return operaciones;}
}

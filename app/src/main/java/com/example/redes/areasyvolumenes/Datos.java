package com.example.redes.areasyvolumenes;

import java.util.ArrayList;

/**
 * Created by Redes on 22/09/2017.
 */

public class Datos {
    private static ArrayList<Operacion> operaciones = new ArrayList<>();
    private static ArrayList<Operacion1> operaciones1 = new ArrayList<>();

    public static void guardar(Operacion o) { operaciones.add(o); }
    public static void guardar1(Operacion1 op) { operaciones1.add(op); }

    public static ArrayList<Operacion> getOperaciones() {return operaciones;}
    public static ArrayList<Operacion1> getOperaciones1() {return operaciones1;}
}

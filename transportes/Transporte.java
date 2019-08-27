package app.transportes;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IEsMagico;

/**
 * Transporte
 */
public class Transporte implements IEsMagico {
    public String nombre;
    public boolean IEsMagico;

    List<Transporte> transportes = new ArrayList<Transporte>();
    

    public void agregarTransporte() {
        Transporte tren = new Transporte();
        tren.nombre = "Tren Expresso de Hogwarts";
        tren.IEsMagico = true;

        transportes.add(tren);

        Transporte escoba = new Transporte();
        escoba.nombre = "Escoba Voladora";
        escoba.IEsMagico = true;

        transportes.add(escoba);




    }

    @Override
    public boolean esMagico() {
        return false;
    }



}

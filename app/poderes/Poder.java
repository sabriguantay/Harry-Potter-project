package app.poderes;

import java.util.ArrayList;
import java.util.List;

/**
 * Poder
 */
public class Poder {

    boolean esOscuro;
    int nivelDaño;
    int nivelCuracion;
    int nivelEnergia;
    String nombre;

    List<Poder> poderes = new ArrayList<Poder>();

    public Poder(String nombre, boolean esOscuro, int nivelCuracion, int nivelEnergia, int nivelDaño) {
        this.nombre = nombre;
        this.esOscuro = esOscuro;
        this.nivelCuracion = nivelCuracion;
        this.nivelEnergia = nivelEnergia;
        this.nivelDaño = nivelDaño;
        
    }

    public void agregarPoder() {

        Poder parselTongue = new Poder("Parsel", false, 0,0,9);

        poderes.add(parselTongue);

        Poder invisibilidad = new Poder("Invisibilidad", false, 0,0,0);

        poderes.add(invisibilidad);
        
        Poder hechizo = new Poder("Hechizo",false, 0, 0, 0);

        poderes.add(hechizo);
        
        Poder metamorfosis = new Poder("Metamorfosis", false, 0, 0, 0);

        poderes.add(metamorfosis);
        
        

    }

}
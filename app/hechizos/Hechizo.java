package app.hechizos;

import java.util.List;
import app.poderes.Poder;

import java.util.ArrayList;

/**
 * Hechizo
 */
public class Hechizo extends Poder {

    public Hechizo(String nombre, boolean esOscuro, int nivelCuracion, int nivelEnergia, int nivelDaño) {
        super(nombre, esOscuro, nivelCuracion, nivelEnergia, nivelDaño);
    }

    List<Hechizo> hechizos = new ArrayList<Hechizo>();
    
    public  void agregarHechizo() {

        Hechizo defensa = new Hechizo("Hechizo de defensa: Cave inimucum",false, 0,0,0);

        hechizos.add(defensa);

        Hechizo ataque = new Hechizo("Hechizo de Ataque: Sectumsempra", true, 0, 0,0);

        hechizos.add(ataque);
        
        Hechizo curacion = new Hechizo("Hechizo de Curación: Vulnera Sanentur", false, 0,0,0);

        hechizos.add(curacion);
       
        Hechizo ocio = new Hechizo("Wingardium Leviosa", false, 0, 0, 0);

        hechizos.add(ocio);
    }
}
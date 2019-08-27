package app.artefactos;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IEsMagico;
import app.interfaces.IReliquiaMuerte;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico, IReliquiaMuerte {

    public int ampDaño;
    public int ampSalud;
    public boolean esReliquia;
    public String nombre;

    List <Artefacto> artefactos = new ArrayList<Artefacto>();

    public Artefacto(String nombre, int ampDaño, int ampSalud, boolean esReliquia) {
        this.nombre = nombre;
        this.ampDaño = ampDaño;
        this.ampSalud = ampSalud;
        this.esReliquia = esReliquia;
    }

    public  void agregarArtefacto() {
        Artefacto horrocrux = new Artefacto("Horrocrux", 0, 0, true);

        artefactos.add(horrocrux);

        Artefacto capaInvisibilidad = new Artefacto("Capa de Invisibilidad", 0, 0, true);

        artefactos.add(capaInvisibilidad);

        Artefacto piedraResurreccion = new Artefacto("Piedra de Resurreccion", 0, 0, true);

        artefactos.add(piedraResurreccion);

        Artefacto varitaDeSauco = new Artefacto("Varita de Sauco", 0, 0, true);

        artefactos.add(varitaDeSauco);

    }

    @Override
    public boolean esMagico() {
        return false;
    }

}
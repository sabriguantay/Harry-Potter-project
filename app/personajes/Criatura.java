package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IEsMagico;

/**
 * Criatura
 */
public class Criatura extends Personaje implements IEsMagico {

    List <Criatura> criaturas = new ArrayList<Criatura>();

    public Criatura(String nombre, int edad, int salud, boolean magoOscuro, boolean estaVivo, int poderInicial, int energiaMagica ) {
        super(nombre, edad, salud, magoOscuro, estaVivo, poderInicial, energiaMagica);

        Criatura elfo = new Criatura("Elfo", 50, 0, true, true,0,0);
        criaturas.add(elfo);



    }

    @Override
    public boolean esMagico() {
        return true;
    }
}
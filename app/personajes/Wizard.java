package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.hechizos.Hechizo;
import app.interfaces.IEsMagico;
import app.interfaces.IHacerMagia;

/**
 * Wizard
 */
public class Wizard extends Personaje implements IHacerMagia, IEsMagico {

    public Wizard(String nombre, int edad, int salud, boolean magoOscuro, boolean estaVivo, int poderInicial, int energiaMagica) {
        super(nombre, edad, salud, magoOscuro, estaVivo, poderInicial, energiaMagica);
      
    }

    List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public void atacar(Personaje enemigo, Hechizo hechizo){

    }

    @Override
    public boolean esMagico() {
        return false;
    }

    


    }
       

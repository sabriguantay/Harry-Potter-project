package app.personajes;

/**
 * Persona
 * 
 *
 */
public class Persona extends Personaje {
    // List<Persona> c = new ArrayList<Persona>(); crear o no?

    public Persona(String nombre, int edad, int salud, boolean magoOscuro, boolean estaVivo, int poderInicial, int energiaMagica) {
        super(nombre, edad, salud, magoOscuro, estaVivo, poderInicial,energiaMagica);
    }

    public Persona() {
        this("", 0, 0, false, false, 0,0);
    }

    public static void AgregarMuggle() {
        Persona muggle = new Persona("Muggle", 27, 0, false, false, 0, 0);
    }

    public static void AgregarWizard() {
        Persona wizard = new Persona("Wizard", 34, 0, false, false, 0,0);
    }
}
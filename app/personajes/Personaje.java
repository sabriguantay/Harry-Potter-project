package app.personajes;

/**
 * Personaje
 */
public abstract class Personaje {

    public String nombre;
    protected int edad;
    protected int salud;
    protected boolean estaVivo;
    protected boolean magoOscuro;
    protected int poderInicial;
    protected int energiaMagica;

    public Personaje(String nombre, int edad, int salud, boolean magoOscuro, boolean estaVivo, int poderInicial, int energiaMagica) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
        this.magoOscuro = magoOscuro;
        this.estaVivo = estaVivo;
        this.poderInicial = poderInicial;
        this.energiaMagica = energiaMagica;

    }
}

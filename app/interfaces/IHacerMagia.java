package app.interfaces;

import app.hechizos.Hechizo;
import app.personajes.Personaje;

/**
 * IHacerMagia
 * 
 * @param <Personaje>
 */
public interface IHacerMagia {

    void atacar(Personaje enemigo, Hechizo hechizo);
    
}
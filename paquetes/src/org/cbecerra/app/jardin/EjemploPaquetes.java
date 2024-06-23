package org.cbecerra.app.jardin;

import org.cbecerra.app.hogar.*;
import static org.cbecerra.app.hogar.Persona.*
;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Cony");
        p.setApellido("Becerra");
        p.setColorPelo(ColorPelo.CAFE);
        System.out.println(p.getNombre());

        String generoMujer = GENERO_FEMENINO;
        System.out.println(generoMujer);

       /* Perro dog = new Perro();
        dog.nombrePerro = "Zeppelin";
        System.out.println("p.nombre = " + p.nombre + " y " + dog.nombrePerro);*/

        Gato g = new Gato();
        g.nombre = "Fortuna";
        g.raza = "Michi";

    }
}

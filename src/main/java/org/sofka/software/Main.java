package org.sofka.software;

import org.sofka.software.utilities.Cat;
import org.sofka.software.utilities.Dog;

/**
 * [Método principal que contiene un menú referente a las características de un gato y un perro]
 *
 * @version 1.0.0
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @since Esta presente desde la version 1.0.0
 */
public class Main {
    /**
     * [Constructor principal donde se inicializa el programa.]
     *
     * @param args argumentos que recibe por defecto el método principal
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {

        Dog perro = new Dog("Tovi","golden retriever",5,"beis", 40, 40);
        perro.animalDescription();
        perro.bark();
        perro.playCatch();
        perro.eat();
        perro.log("si es necesario");
        perro.attack();
        perro.hunt();


        Cat gato = new Cat("Chegüin", "angora", 2, "pardo", 10, 20);
        gato.animalDescription();
        gato.eat();
        gato.attack();
        gato.hunt();
        gato.log("si deseas y pones atención");
        gato.meow();
        gato.purr();
    }
}
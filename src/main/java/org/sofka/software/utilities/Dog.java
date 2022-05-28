package org.sofka.software.utilities;

import org.sofka.software.utilities.abstracts.Animal;
import org.sofka.software.utilities.interfaces.Idog;

/**
 * [Realiza el modelado de un perro y sus características]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class Dog extends Animal implements Idog {
    /**
     * [Constructor con parametros de la clase Dog.]
     *
     * @param name        elemento de tipo String para almacenar el nombre del perro.
     * @param race        elemento de tipo String que indica la raza del perro.
     * @param age         elemento de tipo int que indica la edad del perro.
     * @param colorPelaje elemento de tipo String que indica el color del pelaje del perro.
     * @param peso        elemento de tipo double que indica la peso del perro.
     * @param altura      elemento de tipo double que indica la altura del perro.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public Dog(String name, String race, int age, String colorPelaje, double peso, double altura) {
        super(name, race, age, colorPelaje, peso, altura);
    }

    /**
     * [Imprime en consola una descripción de características del animal]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void animalDescription() {
        makeLog("{0}{1}es un perro de raza {2}, con {3} años, tiene un hermoso pelaje de color {4},\n" +
                        "una altura de {5} cm y un peso de {6} kg,\n" +
                        "te mira con sus 2 hermoso ojos y salta sobre tí con sos {7} patas,\n" +
                        "y siempre te puede escuchar con sus dos orejas sin importar que tan lejos este\n" +
                        "para venir corriendo a jugar contigo.\n" +
                        "El siempre está listo para:\n{0}",
                new Object[]{"\n---------------------------------\n",
                        getName(),
                        getRace(),
                        getAge(),
                        getColorPelaje(),
                        getAltura(),
                        getPeso(),
                        getPatas(),
                });
    }

    /**
     * [Imprime en consola la acción del perro de ladrar]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void bark() {
        log("ladrarte y mover su cola");
    }

    /**
     * [Imprime en consola la acción del perro de jugar]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void playCatch() {
        log("Estar jugando a atrapar la pelota ");
    }
}

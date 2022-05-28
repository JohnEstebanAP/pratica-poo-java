package org.sofka.software;

import org.sofka.software.utilities.abstracts.Animal;

public class Cat extends Animal implements Icat {
    public Cat(String name, String race, int age, String colorPelaje, double peso, double altura) {
        super(name, race, age, colorPelaje, peso, altura);
    }

    @Override
    public void animalDescription() {
        makeLog("{0}{1}es un gato de raza {2}, con {3} años, tiene un hermoso pelaje de color {4},\n" +
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

    @Override
    public void meow() {
        log("lo puedes escuchar maullar");
    }

    @Override
    public void purr() {
        log("lo puedes sentir cuando ronroneando");
    }
}

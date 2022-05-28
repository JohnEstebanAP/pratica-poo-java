package org.sofka.software;

public class Main {
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
package org.sofka.software.utilities.abstracts;
/**
 * [Clase abstracta que Realiza el modelado de un animal y sus características]
 *
 * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public abstract class Animal extends MyprintAbstract {

    private final String name;

    private final String race;

    private final String colorPelaje;
    private int age;
    private double peso;
    private double altura;
    private int patas = 4;
    /**
     * [Constructor con parametros de la clase Animal.]
     *
     * @param name        elemento de tipo String para almacenar el nombre del animal.
     * @param race        elemento de tipo String que indica la raza del animal.
     * @param age         elemento de tipo int que indica la edad del animal.
     * @param colorPelaje elemento de tipo String que indica el color del pelaje del animal.
     * @param peso        elemento de tipo double que indica la peso del animal.
     * @param altura      elemento de tipo double que indica la altura del animal.
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    protected Animal(String name, String race, int age, String colorPelaje, double peso, double altura) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.colorPelaje = colorPelaje;
        this.peso = peso;
        this.altura = altura;
    }
    /**
     * [Imprime en consola una descripción de características del animal]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public abstract void animalDescription();
    /**
     * [Imprime en consola la acción del animal de atacar]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public void attack() {
        logName(name, "puede atacar a un enemigo");
    }
    /**
     * [Imprime en consola la acción del animal de cazar a su presa]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public void hunt() {
        logName(name, "puede cazar a sus presas");
    }
    /**
     * [Imprime en consola la acción del animal de comer]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.0.0]
     */
    public void eat() {
        logName(name, "puede estar comiendo todo el día");
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPatas() {
        return patas;
    }

}

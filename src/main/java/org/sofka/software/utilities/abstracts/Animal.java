package org.sofka.software.utilities.abstracts;

public abstract class Animal extends MyprintAbstract {

    private final String name;

    private final String race;

    private final String colorPelaje;
    private int age;
    private double peso;
    private double altura;
    private int patas = 4;

    protected Animal(String name, String race, int age, String colorPelaje, double peso, double altura) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.colorPelaje = colorPelaje;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract void animalDescription();

    public void attack() {
        logName(name, "puede atacar a un enemigo");
    }

    public void hunt() {
        logName(name, "puede cazar a sus presas");
    }

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

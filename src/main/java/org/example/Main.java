package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("animal");
        Animal animal =(Animal) abstractFactory.create("bear");


        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create("black");


        System.out.println("A " + animal.getAnimal() + " with " + color.getColor() + " color  , say " + animal.makeSound());
    }
}
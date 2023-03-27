package org.example;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
        else if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        }
        else if ("Bear".equalsIgnoreCase(animalType)) {
            return new Bear();
        }
        return null;
    }

}

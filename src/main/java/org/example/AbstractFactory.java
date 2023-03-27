package org.example;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}
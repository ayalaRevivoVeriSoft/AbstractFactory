package org.example;

public class ColorFactory implements AbstractFactory<Color> {
@Override
        public Color create(String colorType) {
        if ("black".equalsIgnoreCase(colorType)) {
        return new Black();
        }
        else if ("brown".equalsIgnoreCase(colorType)) {
        return new Brown();
        }
        else if ("white".equalsIgnoreCase(colorType)) {
            return new White();
        }
        return null;
        }

        }




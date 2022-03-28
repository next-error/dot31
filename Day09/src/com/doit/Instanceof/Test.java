package com.doit.Instanceof;

public class Test {
    public static void main(String[] args) {
        ann(new Cat());

    }

    public static void ann(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).lookDoor();
        }
        if (animal instanceof Cat) {
            ((Cat) animal).catchMose();
        }
    }

}
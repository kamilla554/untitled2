package com.company;

import java.util.ArrayList;

public class DogKennels {
    ArrayList<Dog> shelter = new ArrayList<Dog>();

    void test(){
        System.out.println("Test ...");
        shelter.add(new Dog("sdg", 5));
    }
}

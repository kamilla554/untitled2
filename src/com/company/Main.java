package com.company;

public class Main {

    public static void main(String[] args) {
	 Dog ara = new Dog("boba", 5);
        System.out.println(ara.toString());
        System.out.println("human age:"+ara.humanAge(6));
        DogKennels ker= new DogKennels();
        ker.test();
        Shape circle= new Shape(5,6);
        System.out.println(circle.toString());
    }
}

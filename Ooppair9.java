/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooppair9;

/**
 *
 * @author XU
 */
public class Ooppair9 {

    abstract class Animal {
        private String name;   
        private int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        public abstract void makeSound();

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    class Dog extends Animal {
        private String breed;

        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        public String getBreed() { return breed; }
        public void setBreed(String breed) { this.breed = breed; }

        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Woof! Woof!");
        }
    }

    class Cat extends Animal {
        private String color;

        public Cat(String name, int age, String color) {
            super(name, age);
            this.color = color;
        }

        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }

        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Meow! Meow!");
        }
    }

    public static void main(String[] args) {
        Ooppair9 outer = new Ooppair9(); 

        Animal dog = outer.new Dog("Buddy", 3, "Golden Retriever");
        Animal cat = outer.new Cat("Whiskers", 2, "White");

        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        ((Dog) dog).setBreed("Snoop Dogg");
        System.out.println(dog.getName() + " is now a " + ((Dog) dog).getBreed());
    }
}
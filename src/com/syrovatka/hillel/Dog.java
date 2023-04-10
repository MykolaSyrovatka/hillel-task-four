package com.syrovatka.hillel;

import java.util.Objects;

public class Dog extends Animal{
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;
    public Dog(String name, Integer age) {
        super(name, age);
    }


    @Override
    public void run(int distance) {
        if (distance<=maxRunDistance){
            System.out.println(super.getName() + " ran " + distance + " meters");
        } else {
            System.out.println(getName() + " can run no more than " + maxRunDistance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance<=maxRunDistance){
            System.out.println(super.getName() + " swam " + distance + " meters");
        } else {
            System.out.println(getName() + " can swim no more than " + maxSwimDistance + " meters");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return maxRunDistance == dog.maxRunDistance && maxSwimDistance == dog.maxSwimDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxRunDistance, maxSwimDistance);
    }

    @Override
    public String toString() {
        return super.toString() + "Dog\nName:\t" + getName() + "\nAge:\t" + getAge();
    }
}

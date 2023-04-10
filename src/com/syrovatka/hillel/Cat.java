package com.syrovatka.hillel;

import java.util.Objects;

public class Cat extends Animal{

    private final int maxRunDistance = 200;

    public Cat(String name, Integer age) {
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
        System.out.println("Sorry, but cats can't swim");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return maxRunDistance == cat.maxRunDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxRunDistance);
    }

    @Override
    public String toString() {
        return super.toString() + "Cat\nName:\t" + getName() + "\nAge:\t" + getAge();
    }
}

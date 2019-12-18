package ru.geekbrains.pattern.homework_Lesson4;

public class Cat {
    private String name;
    private Cat parent1;
    private Cat parent2;

    Cat(String name) {
        this.name = name;
    }

    Cat(String name, Cat parent1) {
        this.name = name;
        this.parent1 = parent1;
        this.parent2=null;
    }
    Cat(Cat parent2) {
        this.name = name;
        this.parent1 = null;
        this.parent2=parent2;
    }
    Cat(String name, Cat parent1, Cat parent2) {
        this.name = name;
        this.parent1 = parent1;
        this.parent2=parent2;
    }

    @Override
    public String toString() {
        if (parent1==null && parent2==null)
            return "The cat's name is " + name + ", no mother, no father ";
        else if (parent1==null)
            return "The cat's name is " + name + ", no mother, father is " + parent2.name;
        else if (parent2 == null)
            return "The cat's name is " + name + ", mother is "+ parent1.name + " no father ";

        else
            return "The cat's name is " + name + ", mother is " + parent1.name + " , father is " + parent2.name;

    }
}




package animalKingdom;

import java.util.*;

public class Main {

    public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester) {
        for (Animal a : animals) {
            if (tester.test(a)) {
                System.out.println(a.getName());
            }
        }
    }

    public static void main(String[] args) {
        Mammal panda = new Mammal("Panda", 1, 1869);
        Mammal zebra = new Mammal("Zebra", 2, 1778);
        Mammal koala = new Mammal("Koala", 3, 1816);
        Mammal sloth = new Mammal("Sloth", 4, 1804);
        Mammal armadillo = new Mammal("Armadillo", 5, 1758);
        Mammal raccoon = new Mammal("Raccoon", 6, 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 7, 2021);

        Bird pigeon = new Bird("Pigeon", 8, 1837);
        Bird peacock = new Bird("Peacock", 9, 1821);
        Bird toucan = new Bird("Toucan", 10, 1758);
        Bird parrot = new Bird("Parrot", 11, 1824);
        Bird swan = new Bird("Swan", 12, 1758);

        Fish salmon = new Fish("Salmon", 13, 1758);
        Fish catfish = new Fish("Catfish", 14, 1817);
        Fish perch = new Fish("Perch", 15, 1758);

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);

        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);

        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        System.out.println();

        System.out.println("*** Animal list ***");
        System.out.println();
        System.out.println(animalList.toString());

        System.out.println();

        animalList.sort((a1, a2) -> a1.getYear() - a2.getYear());
        animalList.forEach(a -> System.out.println(a));

        System.out.println();

        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(a -> System.out.println(a));

        System.out.println();

        System.out.println("Animals that walk");
        System.out.println("------------------");
        printAnimals(animalList, a -> a.move() == "walk");

        System.out.println();

        System.out.println("Animals that fly");
        System.out.println("------------------");
        printAnimals(animalList, a -> a.move() == "fly");

        System.out.println();

        System.out.println("Animals that swim");
        System.out.println("------------------");
        printAnimals(animalList, a -> a.move() == "swim");

        System.out.println();

        System.out.println("Animals that breathe with lungs");
        System.out.println("------------------");
        printAnimals(animalList, a -> a.breath() == "lungs");

        System.out.println();

        System.out.println("Animals that breathe with lungs and were named in 1758");
        System.out.println("------------------");
        printAnimals(animalList, a -> (a.breath() == "lungs") && (a.getYear() == 1758));

        System.out.println();
        System.out.println("Animals that lay eggs and breathe with lungs");
        System.out.println("------------------");
        printAnimals(animalList, a -> (a.reproduce() == "eggs") && (a.breath() == "lungs"));

        System.out.println();

        ArrayList<Animal> animalList2 = new ArrayList<Animal>();

        animalList2.addAll(animalList);

        animalList2.removeIf(a -> a.getYear() != 1758);

        animalList2.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

        animalList2.forEach(a -> System.out.println(a));
    }
}
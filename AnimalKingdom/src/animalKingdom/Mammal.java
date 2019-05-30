package animalKingdom;

public class Mammal extends Animal {
    public Mammal(String name, int Id, int year) {
        super(name, Id, year);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }
}
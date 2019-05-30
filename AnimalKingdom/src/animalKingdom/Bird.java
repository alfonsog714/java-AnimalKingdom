package animalKingdom;

public class Bird extends Animal {
    public Bird(String name, int Id, int year) {
        super(name, Id, year);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
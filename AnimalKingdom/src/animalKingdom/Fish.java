package animalKingdom;

public class Fish extends Animal {
    public Fish(String name, int Id, int year) {
        super(name, Id, year);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
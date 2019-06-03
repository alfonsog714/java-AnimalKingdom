package animalKingdom;

public abstract class Animal {

    String name;
    int Id;
    int year;

    public Animal(String name, int Id, int year) {
        this.name = name;
        this.Id = Id;
        this.year = year;
    }

    // Abstract methods
    public abstract String getName();

    public abstract String move();

    public abstract String breath();

    public abstract int getYear();

    public abstract String reproduce();

    // Regular Methods
    public void eat(String food) {
        System.out.println("The " + this.name + "eats " + food);
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '\'' + ", id=" + Id + '\'' + "year=" + year + "}";
    }

}
package OOP2;

public class Duck extends Herbivore implements Swimable, Flyable, Walkable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public int flySpeed() {
        return 75;
    }

    @Override
    public String speak() {
        return "Издает звук: Кря - Кря";
    }

    @Override
    public int swimSpeed() {
        return 12;
    }

    @Override
    public int runSpeed() {
        return 10;
    }
    
}
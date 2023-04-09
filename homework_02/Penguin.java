package OOP2;
public class Penguin extends Predator implements Swimable, Walkable{
    public Penguin(String name, int speed) {
        super(name);
    }

    @Override
    public String speak() {
        return "КХЪ";
    }

    @Override
    public int runSpeed() {
        return 5;
    }

    @Override
    public int swimSpeed() {
        return 23;
    }
    
}
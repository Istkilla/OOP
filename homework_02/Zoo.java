package OOP2;
import java.util.*;

public class Zoo implements Iterable<Animal> {
    private List <Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();


    public void addAnimal (Animal newAnimal){
        this.animals.add(newAnimal);
    }

    public void noise (){
        for (Speakable speak:noises()) {
            System.out.print(speak.speak());
        }
        System.out.println();
    }

    private List<Speakable> noises (){
        List<Speakable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Speakable) {
                    res.add((Speakable) animal);
            }
        }
        res.add(radio);
        return res;
    }

    private List<Walkable> runners (){
        List<Walkable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Walkable) {
                res.add((Walkable) animal);
            }
        }
        return res;
    }

    public Animal championByRun () {
        List<Walkable> start = runners();
        Walkable champ = start.get(0);
        for (Walkable runner:start) {
            if (champ.runSpeed()< runner.runSpeed()){
                champ = runner;
            }
        }
        return (Animal)champ;
    }

    private List<Flyable> flyers (){
        List<Flyable> res = new ArrayList<>();
        for (Animal animal:animals) {
            if (animal instanceof Flyable) {
                res.add((Flyable) animal);
            }
        }
        return res;
    }

    public Animal championByFly () {
        List<Flyable> start = flyers();
        Flyable champ = start.get(0);
        for (Flyable flyer:start) {
            if (champ.flySpeed()< flyer.flySpeed()){
                champ = flyer;
            }
        }
        return (Animal)champ;
    }

    @Override
    public Iterator<Animal> iterator() {
        return new Iterator<Animal>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                if (counter < animals.size()) return true;
                return false;
            }

            @Override
            public Animal next() {
                return animals.get(counter++);
            }
        };
    }

    public List<Animal> toList (){
        List<Animal> animalList = new ArrayList<>();
        for (Animal item:this) {
            animalList.add(item);
        }
        return animalList;
    }
}
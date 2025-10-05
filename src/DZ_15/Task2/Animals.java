package DZ_15.Task2;

import java.util.ArrayDeque;

public class Animals {
    private ArrayDeque<String> namesAnimals;

    public Animals() {
        namesAnimals = new ArrayDeque<>();
    }


    public void addAnimal(String name) {
        namesAnimals.offerFirst(name);
    }

    public void delete() {
        namesAnimals.pollLast();
    }
    public void seeCollection(){
        System.out.println(namesAnimals);
    }
}

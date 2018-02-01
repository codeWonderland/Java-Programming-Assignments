package me.codewonderland.storygenerator;

public class MyStory {

    //Declaring Variables
    private String speciesList[] = {"skunk", "bear", "cat", "dog", "giraffe", "cow", "whale"};
    private String species = calcRandomInsert(speciesList);
    private String nameList[] = {"John", "Sue", "Lisa", "George", "Lenny", "Brenda"};
    private String name = calcRandomInsert(nameList);
    private String helpfulCreatureList[] = {"honey badger", "narwhal", "stork", "chimp"};
    private String helpfulCreature = calcRandomInsert(helpfulCreatureList);
    private String objectList[] = {"balloon", "yo-yo", "car", "plane", "computer"};
    private String coolObject = calcRandomInsert(objectList);
    private String funTimeList[] = {"ice cream", "pizza", "tacos", "burgers", "sushi"};
    private String funTime = calcRandomInsert(funTimeList);

    public void introduction() {
        System.out.println("Once upon a time there was a very sad " + species + " named " + name
        + ". One day a magic " + helpfulCreature + " came along and saw " + name + " crying, and decided "
        + "to cheer him up. ");
    }

    public void body() {
        System.out.println("The " + helpfulCreature + " made a circus magically appear with "
        + ((int) (Math.random() * 100) + 1) + " clowns and " + ((int) (Math.random() * 100) + 1) + " elephants."
        + " But " + name + " was still sad. Then the magic " + helpfulCreature + " materialized a " + coolObject
        + ", but " + name + " still wept. ");
    }

    public void conclusion() {
        System.out.println("Finally, the " + helpfulCreature + " took " + name + " out for " + funTime
        + ", and that cheered him up. The End.");
    }

    private String calcRandomInsert(String options[]) {

        String choice;

        choice = options[(int) (Math.random() * options.length)];

        return choice;
    }
}
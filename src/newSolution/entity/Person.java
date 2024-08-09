package newSolution.entity;

public class Person {
    private String name;
    public static int count;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }
}

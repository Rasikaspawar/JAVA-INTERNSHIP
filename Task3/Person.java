public class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayRole() {
        System.out.println("Role: Person");
    }
}

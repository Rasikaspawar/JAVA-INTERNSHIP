public class Librarian extends Person {
    public Librarian(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Librarian");
    }
}

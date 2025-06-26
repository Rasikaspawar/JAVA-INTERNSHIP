public class User extends Person {
    public User(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Library User");
    }
}

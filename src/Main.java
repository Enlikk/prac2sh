public class Main {

    public static void main(String[] args) {

        UserManager manager = new UserManager();

        manager.addUser(new User("Enlik", "Armankyzyenlik@mail.com", "Admin"));
        manager.addUser(new User("Nurdastan", "nurdastan19@mail.com", "User"));

        manager.updateUser("Armankyzyenlik@mail.com", "Armankyzy Enlik", "Admin");
        manager.removeUser("Nurdastan@mail.com");

        manager.printUsers();
    }
}

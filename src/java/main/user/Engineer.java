package user;

public class Engineer extends UserDetails {

    private int level;

    public Engineer(String firstname, String lastname, int age, String email) {
        super(firstname, lastname, age, email);
    }

    @Override
    void getFullName() {
        System.out.println(firstname + " " + lastname);
    }

    void getEngineerDetails() {
        String details = "(Engineer level: %d) ";
        System.out.println(String.format(details, level) + firstname + " " + lastname);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

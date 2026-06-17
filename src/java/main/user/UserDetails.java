package user;

abstract class UserDetails {

    protected String firstname;
    protected String lastname;
    protected int age;
    protected String email;

    public UserDetails(String firstname, String lastname, int age, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }

    abstract void getFullName();
}

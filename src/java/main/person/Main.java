package person;



public class Main {
    
    static Person p = new Person("Cloyd Van Secuya");

    public static void main(String[] args) {
        System.out.println("Name of person: " + p.getFullName());
        System.out.println("Government ID: " + p.getGOVID());
    }
}

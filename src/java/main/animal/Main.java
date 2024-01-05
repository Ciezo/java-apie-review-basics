package animal;
public class Main { 

    static Animal animal = new Animal("Base Animal"); 
    static Dog dog = new Dog("Pluto");
    static Cat cat = new Cat("B&W Cat");

    public static void main(String[] args) {
        System.out.println(animal.getName());
        System.out.println(dog.getName());
        System.out.println(cat.getName());

        animal.makeSound(null);
        dog.makeSound("Awww awwwwoooo");
        cat.makeSound("meoww");

    }
}
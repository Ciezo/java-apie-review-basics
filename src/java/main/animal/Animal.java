package animal;
public class Animal implements IAnimal {

    private String name;

    public Animal(String name) {
        this.name = name; 
    }

    @Override
    public void makeSound(String sound) {
        System.out.println("Animal is making sound....");
        System.out.println("Sound is... " + sound);
    }
    

    public String getName() {
        return name; 
    }
    
     
}
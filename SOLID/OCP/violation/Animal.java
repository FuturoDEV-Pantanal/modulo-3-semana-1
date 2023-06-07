package OCP.violation;

public class Animal {

    private String type;
    
    public Animal(String type) {
        this.type = type;
    }
    
    public void makeSound() {

        if (type.equals("dog")) {

            System.out.println("Uau!");

            
        } else if (type.equals("cat")) {

            System.out.println("Miau!");

        } else if (type.equals("cow")) {

            System.out.println("Moo!");

        }
        // Mais condições para outros tipos de animais
    }
}


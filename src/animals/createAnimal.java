package animals;


import java.util.Scanner;

public class createAnimal {
    Scanner myScanner = new Scanner(System.in);

    public static void main(String args[]) {

    }

    private void  getAnimalType(){
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();

        if (animal.equalsIgnoreCase("dog")){
            createDog();
        }
        else if (animal.equalsIgnoreCase("cat")){
            createCat();
        } else {
            System.out.println(animal + "is not an animal we can currently create, please try again");
        }
    }

    private void createCat() {
        System.out.println("What is the cats's name?");
        String name = Scanner.myScanner.nextLine();
        System.out.println("How big is the cat?");
        String size = Scanner.myScanner.nextLine();
        System.out.println("How old is the cat?");
        int age = MyScanner.nextInt();
        System.out.println("Is it an indoor or outdoor cat?");
        String type = Scanner.myScanner.nextLine();
        System.out.println("What colour is the cat");
        String colour = Scanner.myScanner.nextLine();

        myCat.flap(size);
        myCat.behave(type);
        myCat.beHuman(name, age, colour, type);

    }

    private void createDog() {
        System.out.println("What is the dog's name?");
        String name = Scanner.myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = Scanner.myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = MyScanner.nextInt();
        System.out.println("What breed is the dog");
        String breed = Scanner.myScanner.nextLine();

        myDog.bark(size);
        myDog.play(breed);
        mydog.beHuman(name, age, breed);

    }

}

package sunday_roast;

import java.util.ArrayList;
import java.util.Scanner;

public class makeRoast {

    superSecretSundayRoast roast = new superSecretSundayRoast();

    public static void main(String[] args) {
        makeRoast mr = new makeRoast();

        mr.menu();


    }

    private void menu() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1 - Add ingredients ");
        System.out.println("2 - Check ingredients");
        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice) {
            case 1:
                addIngredients();

            case 2:
                addIngredients();

            default:
                System.out.println("Not a valid choice");
        }
    }


    private void addIngredients() {
        roast.addIngredient(new ingredient("chicken", 12));
        roast.addIngredient(new ingredient("potatoes", 200));
        roast.addIngredient(new ingredient("broccoli", 4));
        roast.addIngredient(new ingredient("Cauliflower", 4));
        roast.addIngredient(new ingredient("peas", 700));
        roast.addIngredient(new ingredient("Carrots", 75));
        roast.addIngredient(new ingredient("Cabbages", 4));
        roast.addIngredient(new ingredient("Parsnips", 2));
        roast.addIngredient(new ingredient("Brussel Sprouts", -1));
        roast.addIngredient(new ingredient("Secret Ingredient", 1));
    }


    private void checkIngredients() {
        for (ingredient i : roast.getIngredients("strongpassword123")) {
            System.out.println("Ingredient: " + i.ingredientName + ", Amount: " + i.ingredientQuantity);


            Scanner myScanner = new Scanner(System.in);
            System.out.println("So, you want to view the ingredients eh? password first");
            String password = myScanner.nextLine();
            ArrayList<ingredient> ingredients = roast.getIngredients(password);
            if (ingredients != null) {
                System.out.println("Ingredient: " + i.ingredientName + ", Amount" + i.ingredientName);

            } else {
                System.out.println("Caught you!");
            }


        }


    }
}


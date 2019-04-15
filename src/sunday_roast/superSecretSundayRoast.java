package sunday_roast;
import java.util.ArrayList;
import java.util.Scanner;


public class superSecretSundayRoast {

    private ArrayList<ingredient> ingredients = new ArrayList<ingredient>();
    private ArrayList<String> guestList = new ArrayList<>();

    public superSecretSundayRoast() {
        guestList.add("chicken");
        guestList.add("potatoes");
        guestList.add("broccoli");
        guestList.add("Cauliflower");
        guestList.add("peas");
        guestList.add("Carrots");
        guestList.add("Cabbages");
        guestList.add("Parsnips");
        guestList.add("Brussel Sprouts");
        guestList.add("Secret Ingredient");
    }

    public void addIngredient(ingredient i) {

        if (guestList.contains(i.ingredientName)) {
            this.ingredients.add(i);
        } else {

            System.out.println("EXTERMINATE");

        }

    }

        public ArrayList<ingredient> getIngredients (String password){
            if (password.equals("strongpassword123")) {
                return this.ingredients;
            } else

                return null;
        }


    }





package animals;

public class cat {

    private String name;
    private String size;
    private int age;
    private String colour;
    private String type;

    public cat(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.type = type;
    }

    private String catSize(String flap) {
        String flap = " ";
        if (size.equalsIgnoreCase("small")) {
            flap = "Slips through the catflap with ease";

        } else if (size.equalsIgnoreCase("medium")) {
            flap = "This cat has a bit of trouble";
        } else {
            flap = "Oh dear, your cat is stuck!";
        }

        return flap;
    }

    private String behave(String type) {
        String behaviour = " ";
        if (type.equalsIgnoreCase("Outdoor")) {
            behaviour = ("Let's chase some mice!");
        } else if (type.equalsIgnoreCase("Indoor")) {
            behaviour = ("Time to sleep");

        }

        private String beHuman (String name, int age, String type){
            return "MEOW MEOW, i'm" + name + "and I am a" + age + "year old"  +type+ "who is" +colour+ ", Where do you live?";
        }
    }
}

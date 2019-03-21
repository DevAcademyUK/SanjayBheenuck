package animals;

public class cat {

    private String name;
    private String size;
    private int age;
    private String colour;
    private String type;

    public cat(String name, String size, int age, String colour) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.type = type;
        this.colour = colour;
    }

    private String catSize(String flap) {
        String flapping = " ";
        if (size.equalsIgnoreCase("small")) {
            flapping = "Slips through the catflap with ease";


        } else if (size.equalsIgnoreCase("medium")) {
        flapping = "This cat has a bit of trouble";
        } else {
            flapping = "Oh dear, your cat is stuck!";
        }

        return flapping;
    }

    private String behave(String type) {
        String behaviour = " ";
        if (type.equalsIgnoreCase("Outdoor")) {
            behaviour = ("Let's chase some mice!");
        } else if (type.equalsIgnoreCase("Indoor")) {
            behaviour = ("Time to sleep");

        }
        return behaviour;
    }
        private String beHuman(String name, int age, String type){
            return "MEOW MEOW, i'm" + name + "and I am a" + age + "year old"  +type+ "who is" +colour+ ", Where do you live?";
        }
    }

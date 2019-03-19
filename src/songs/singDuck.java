package songs;

import java.util.Scanner;

public class singDuck {
    public static void main(String[] args){
        singDuck du = new singDuck();
        du.duck();

    }

    private void duck() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Five little ducks went swimming one day");
        int ducks = 5;
        for (int i = ducks; i > 0; i--) {
            System.out.println("over the hills and far away");
            System.out.println("Mother duck said, quack quack quack quack");
            System.out.println("And only" + i + " little ducks came back");

            if (i == 1) {
                System.out.println(i + "little ducks went swimming one day");
                System.out.println("Over the hills and far away.");
                System.out.println("Mother duck said, quack quack quack quack");
                System.out.println("And only" + i +" little duck came back");


            } else {
                 i = 5;
                System.out.print("Five little ducks went swimming one day");
                System.out.println("over the hills and far away");
                System.out.println("Mother duck said, quack quack quack quack");
                System.out.println("And all" + i +" little ducks came back");
                break ;
            }

        }
    }
}
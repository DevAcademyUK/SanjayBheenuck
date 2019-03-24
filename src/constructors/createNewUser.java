package constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class createNewUser {
    protected Scanner myScanner = new Scanner(System.in);
    ArrayList<newUser> users = new ArrayList<newUser>();

    public static void main(String[] args) {
        createNewUser create = new createNewUser();
        create.menu();
    }

    private void menu() {
        System.out.println("Welcome, please select and option below: ");
        System.out.println("1-Create new user");
        System.out.println("2-View current users");
        String input = myScanner.nextLine();
        if (input.equals("1")) {
            createUser();
        } else {
            viewUsers();
        }
    }

    private void viewUsers() {

        if (users.size() > 0) {
            for (newUser user : users) {
                if (user.name.length() > 0) {
                    System.out.println("Username: " + user.username + "\n"
                            + "password" + user.password + "\n"
                            + "Age" + user.age + "\n");
                    menu();
                } else if (user.name.length() == 0 && user.age != 0) {
                    System.out.println("Username: " + user.username + "\n"
                            + "Password: " + user.password + "\n"
                            + "Age: " + user.age);
                    menu();
                } else {
                    System.out.println("Username: " + user.username + "\n" + "Password:" + user.password + "\n");
                    menu();
                }
            }
        }
    }


                private void createUser () {
                    String responce;
                    byte age;
                    System.out.println("Welcome, let's create a new user");
                    System.out.println("What is the username of the new user?");
                    String UN = myScanner.nextLine();

                    System.out.println("What is the user's password?");
                    String PW = myScanner.nextLine();

                    System.out.println("Has the user provided their age? (Y/N)");
                    responce = myScanner.nextLine();
                    if (responce.equalsIgnoreCase("n")) {
                        newUser user = new newUser(UN, PW);
                        users.add(user);
                        menu();
                    } else {
                        System.out.println("What is the user's age?");
                        age = Byte.parseByte(myScanner.nextLine());

                        System.out.println("Has the user provide their name? (y/n");

                        if (responce.equalsIgnoreCase("n")) {

                            newUser user = new newUser(UN, PW, age);
                            users.add(user);
                            menu();

                        } else {

                            System.out.println("What is the user's name");
                            String name = myScanner.nextLine();
                            newUser user = new newUser(UN, PW, age, name);
                            users.add(user);
                            menu();

                        }

                    }
                }
            }



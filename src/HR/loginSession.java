package HR;

import java.util.Scanner;

public class loginSession {

    Scanner myScanner = new Scanner(System.in);

    public void login(){
        System.out.println("....."+"\n \n"+ "......."+"\n \n"+ "......");
        System.out.println("Welcome to the Dean Lewis Megacorporation HR system" +"\n \n");
        System.out.println("....."+"\n \n"+ "......."+"\n \n"+ "......");
        System.out.println("Please select an option from the following: ");
        System.out.println("....."+"\n \n"+ "......."+"\n \n"+ "......");
        System.out.println("1 - Employee login");
        System.out.println("2 - HR login");
        System.out.println("3 - HR Manager login");
        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice){
            case 1:
                employeeSession();
                break;

            case 2:
                hrSession();
                break;

            case 3:
                managerSession();
                break;

             default:
                 System.out.println("No such option");
                 return;
        }
    }

    private void managerSession() {

    }

    private void hrSession() {
    }

    private void employeeSession() {
        hrMain el = new hrMain();
        el.employeeSession();

    }
}

package switches;

import java.util.Scanner;

public class parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){

        parking p = new parking();
        p.getInput();
    }

    private void getInput(){

        System.out.println("What day is it?");
        String day = myScanner.nextLine();
        System.out.println("How long will you be staying");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What position do you hold in the (Student/Staff/Visitor");
        String position = myScanner.nextLine();
        calculateFees(day, duration, position);
    }

    private void calculateFees(String day, int duration, String position ){

        int cost;
        int hourlyRate = 0;
        int multiplier = 0;

      switch (position) {
          case "Staff":
              multiplier = 1;
            break;

          case "Student" :
              multiplier = 1;
              break;


          case "Visitor":
              multiplier = 3;
              break;

              default:
                  System.out.println("Invalid input, please try again");
                  getInput();


      }

      switch (day) {
          case "Monday":
              hourlyRate = 2;
              break;

          case "Tuesday":
                  hourlyRate = 2;
              break;


          case "Wednesday":
              hourlyRate = 3;
              break;

          case "Thursday":
              hourlyRate = 2;
              break;

          case "Friday":
              hourlyRate = 3;
              break;

          case "Saturday":
              hourlyRate =4;
              break;

          case "Sunday":
              hourlyRate = 5;
              break;

              default:
                  System.out.println("Invalid input, pleas try again");
                  getInput();
      }

      cost = (hourlyRate * multiplier) * duration;
        System.out.println("Thanks for parkings at Gateshead college, Please Pay: " +cost);
    }


}

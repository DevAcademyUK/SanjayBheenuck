package librarylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class library {

    Scanner myScanner = new Scanner(System.in);
    List<book> books = new ArrayList<book>();
    List<member> members = new ArrayList<member>();
    loan[] loans = new loan[2];


    public static void main(String[] args) {
        library lib = new library();
        lib.init();
    }

    private void init() {
        books.add(new book(1, "In search off lost time", "Marcel Proust", "1913"));
        books.add(new book(2, "Ulysses", "James Joyce", "1922"));
        books.add(new book(3, "Moby Dick", "Herman Melville", "1851"));
        books.add(new book(4, "Pride and Predjudice", "Jane Austen", "1813"));
        books.add(new book(5, "The Canterbury Tales", "Geoffrey Chaucer", "1387"));
        books.add(new book(6, "Finnegan's Wake", "James Joyce", "1939"));
        books.add(new book(7, "Bartlby the scrivener", "Herman Melville", "1830"));

        members.add(new member(1, "Dean", "Lewis", (byte) 30));
        members.add(new member(2, "Steve", "Beckwith", (byte) 55));
        members.add(new member(3, "Lisa", "Crow", (byte) 39));
        members.add(new member(4, "Vicky", "Cross", (byte) 37));
        members.add(new member(5, "Rachel", "Alsop", (byte) 25));

        loans[0] = new loan(2, 4);
        loans[1] = new loan(5, 2);

        menu();


    }

    private void menu() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to your local library, enjoy it while it lasts.");
        System.out.println("Select an option from the list: ");
        System.out.println("1 - Search for a book");
        System.out.println("2 - Check if a book is available");
        System.out.println("3 -  Search for an author");
        System.out.println("4- Search for a member");
        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice) {
            case 1:
                searchBook();
                break;

            case 2:
                checkBook();
                break;

            case 3:
                searchAuthor();
                break;

            case 4:
                searchMember();
                break;

            default:
                System.out.println("Invalid input, please try again");
                menu();
        }
    }

    private void searchMember() {

        for (member m : members) {

            System.out.println(m.memberForename+" "+m.memberSurname);



            }
        System.out.println("\n");
        Collections.sort(members);
        menu();
        }




            private void searchBook() {
                for (book a : books) {
                    System.out.println(a.bookTitle);
                }

                System.out.println("\n");
                Collections.sort(books);

                for (book b : books) {
                    System.out.println(b.bookTitle);
                }
                menu();
            }

            private void checkBook() {
            }

            private void searchAuthor() {
                Collections.sort(books, book.bookAuthorComparator);
                for (book b : books) {
                    System.out.println(b.bookAuthor);
                }

            }

        }






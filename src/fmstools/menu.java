
package fmstools;

//import fmstools.printIt;
import java.util.Scanner;

public class menu {

    // show menu
    // list files
    // select files
    // show file info depending on file type
    // macth/search word if text file
    // exit program

    public menu() {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("============== Menu ============== \n");
            System.out.print("==    1.) List all Files          == \n");
            System.out.print("==    2.) List all image files.   == \n");
            System.out.print("==    3.) List all PNG files.     == \n");
            System.out.print("==    4.) List all JPG files.     == \n");
            System.out.print("==    5.) List all jfif fiiles    == \n");
            System.out.print("==    6.) List all txt files      == \n");
            System.out.print("==    7.) Exit program            == \n");
            System.out.print("==    Enter Your Menu Choice:     == \n");
            System.out.println("============== Menu ============== \n");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    printIt.o("Listing all files mofo");
                    break;

                case 2:
                    printIt.o("Listing all Image files yess");
                    break;

                case 3:
                    printIt.o("Listing all PNG files nice");
                    break;

                case 4:
                    printIt.o("Listing all JPG files nice");
                    break;

                case 5:
                    printIt.o("Listing all jfif files nice");
                    break;
                case 6:
                    printIt.o("Listing all txt files nice");
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid Menu Option! Please Select Another.");

            }
        } while (choice != 7 /* Exit loop when choice is 6 */);

    }

    public static void main(String[] args) {

        new menu();
    }

}

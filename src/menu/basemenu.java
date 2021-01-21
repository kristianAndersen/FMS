package menu;


import java.util.Scanner;
import inputOutput.*;
import fileInputOutput.listallFiles;

public class basemenu {

  getUserInput getUserInput = new getUserInput();

 
  public void basicMenu() {
    listallFiles laf= new listallFiles();

    // get user name for greeting
    String uname = System.getProperty("user.name");
    Scanner scanner = new Scanner(System.in);

    boolean atrue = false;
    boolean btrue = false;
    boolean ctrue = false;
    boolean dtrue = false;
    boolean etrue = false;

    String choice = "z";
    do {
      System.out.println("+-----------------------------------+");
      System.out.print("\n");
      System.out.println("Welcome " + uname + "");
      System.out.print("\n");
      System.out.println("+-----------------------------------+");
      System.out.print("\n");
      System.out.print("==    A.) List all Files          == \n");
      if (atrue == true) {
        
        laf.listTheFiles();
        System.out.println("Chose a file");
      }
      System.out.println("==    B.) List all PNG files.     ==");
      if(btrue==true){
        System.out.print("You chose B Awesome choise\n");
      }
      System.out.print("==    C.) List all JPG files.     == \n");
      if(ctrue==true){
        System.out.print("You chose C ... Nice nice nice\n");
      }
      System.out.print("==    D.) List all jfif fiiles    == \n");
      if(dtrue==true){
        System.out.print("You chose D why \n");
      }
      System.out.print("==    E.) List all txt files      == \n");
      if(etrue==true){
        System.out.print("You chose E you neard \n");
      }
      System.out.print("==    Q.) Exit program            == \n");
      System.out.print("==    Enter Your Menu Choice:     == \n");

      choice = getUserInput.userInputChars(scanner);
      choice = choice.toLowerCase();

      System.out.println("");

      switch (choice) {
        case "a":
          clearterminal();
          atrue = true;
          btrue = false;
          ctrue = false;
          dtrue = false;
          etrue = false;
          break;
        case "b":
        clearterminal();
          atrue = false;
          btrue = true;
          ctrue = false;
          dtrue = false;
          etrue = false;
          break;
        case "c":
        clearterminal();
          atrue = false;
          btrue = false;
          ctrue = true;
          dtrue = false;
          etrue = false;
          break;
        case "d":
        clearterminal();
          atrue = false;
          btrue = false;
          ctrue = false;
          dtrue = true;
          etrue = false;
          break;
        case "e":
        clearterminal();
          atrue = false;
          btrue = false;
          ctrue = false;
          dtrue = false;
          etrue = true;
          break;
        case "q":
          System.out.println("Exiting Program...");
          System.exit(0);
          break;
        case "z":
          clearterminal();
          System.out.println("That is not an option in the menu");
        break;  

      }
    } while (choice != "q");

  }

  private void clearterminal() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}

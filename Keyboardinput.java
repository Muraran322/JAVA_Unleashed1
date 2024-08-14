
package keyboardinput;
// import the scanner class library
    import java.util.Scanner;

public class Keyboardinput {
     public static void main(String[] args) {
         // Create an object of the scanner class
       Scanner input = new Scanner (System.in);
         // Create two variables to hold Keyboard input
       String name;
       int age;
         // Create a string to prompt user input
       System.out.println("What is your name Sir ?");
         // Prompt for the name
       name = input.nextLine();
         // Create a string to prompt the user input
       System.out.println("Tell us your age Sir !");
         // Prompt for the age
       age = input.nextInt();
         // Display the name and age on the console
         System.out.println("Sir your name is "+name+" aged "+age +" keep up to good work 👍.");
       
    }
    
}

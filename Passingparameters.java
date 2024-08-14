
package passingparameters;

public class Passingparameters {
    //Define the product method expecting two parameters
   public static int product(int x, int y){
       x =x+1;
       y =y+1;
       return x*y;
    }
    //Define the main method
    public static void main (String []args) {
        int i =4;
        int j =3;
        //call the product method to excecute as you pass 4 and 3 to it
        System.out.println(product(i,j));
               
    }
}

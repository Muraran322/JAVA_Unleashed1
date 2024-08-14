
package circle;

public class Circle {

    public static void main(String[] args) {
        //Define the attributes of the class
        double radius = 4.00;
        final double pi =3.142;
        
        //create an object of the computation class
        Computation compute = new Computation();
        
        // use the object to excecute the setter method
        compute.setArea ( pi , radius);
        
        // excecute the getter method to display the results
        System.out.println("The area is "+ compute.getArea());
    }
    
}

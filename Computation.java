
package circle;

public class Computation {
    // Define the attributes of the computation class.
    private double area;
    
    // Define the operation / methods of the computation class
    // Define the mutator / setter method
    public void setArea (double pi , double rad){
        area =pi*rad*rad;
    }
    // Define the accesor / getter method
    public double getArea(){
        return area;
    }
}

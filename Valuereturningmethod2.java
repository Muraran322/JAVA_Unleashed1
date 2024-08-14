
package valuereturningmethod2;

public class Valuereturningmethod2 {
    //Define the method to compute pension
    public static double pension(){
        double basicpay = 40000.00;
        double rate =5.00;
        double pension = (rate/100)*basicpay;
        return pension;
    }
    //Define the main method
    public static void main (String []agrs){
        //Define and initialize nssf and nhif rates
        double nssf =200.00;
        double nhif =400.00;
        
        //Compute total deductions from the salary
        double deductions =nssf+nhif+pension();
        System.out.println(deductions);
    }
}

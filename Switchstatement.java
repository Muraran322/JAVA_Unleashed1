
package switchstatement;

public class Switchstatement {

    public static void main(String[] args) {
        int today =4;
        
        switch (today){
            case 1:{
                System.out.println(" Today is a Sunday ");
                break;
            }
            case 2:{
                System.out.println(" Today is a Monday ");
                break;
                
            }
            case 3:{
                System.out.println(" Today is a Tuesday ");
                break;
            }
            case 4:{
                System.out.println(" Today is a Wednesday ");
                break;
            }
            case 5:{
                System.out.println(" Today is a Thursday ");
                break;
            }
            case 6:{
                System.out.println(" Today is a Friday ");
                break;
            }
            case 7:{
                System.out.println(" Today is a Saturday ");
                break;
            }
            default:{
                System.out.println(" No match found ");             
            }
            System.out.println("Proceed with sequential excecution ");
        }
    }
    
}

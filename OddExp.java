
import java.util.Scanner;

public class OddExp {

	public static void validate(int num) {  
        if(num % 2 == 0) {  
              
            System.out.println("Entered number is even");    
        }  
        else {  
        	throw new ArithmeticException("Entered number is odd");  
        }  
    }  
    //main method  
    
	public static void main(String args[]){  
        
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        
        validate(n);  
            
  }    

}
  
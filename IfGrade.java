import java.util.Scanner;

public class IfGrade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a character: ");
	    char ch = scanner.next().charAt(0); 
		
        if(ch=='A' || ch=='a') {
        	System.out.println("Excellent");
        }
        else if(ch=='B' || ch=='b'){
        	System.out.println("Very Good");
        }
        else if(ch=='C' || ch=='c'){
        	System.out.println("Good");
        }
        else if(ch=='D' || ch=='d'){
        	System.out.println("Fair");
        }
        else if(ch=='F' || ch=='f'){
        	System.out.println("Fail");
        }
        else {
        	System.out.println("Invalid");
        }

	}

}

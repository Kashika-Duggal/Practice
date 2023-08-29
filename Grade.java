import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a character: ");
	    char c = scanner.next().charAt(0); 
        

        switch (c)
        {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Very Good");
                break;
            case 'C':
            case 'c':
                System.out.println("Good");
                break;
            case 'D':
            case 'd':
                System.out.println("Fair");
                break;
            case 'F':
            case 'f':
                System.out.println("Fail");
                break;
            default:
            	System.out.println("Invalid char entered");
        }
	}
	
	
	

}

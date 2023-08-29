import java.util.ArrayList;
import java.util.Scanner;

public class practice {

	
	    public static int sumNumbers(ArrayList<Integer> numbers) {
	        int sum = 0;
	        for (int i = 0; i < numbers.size(); i++) {
	            sum = sum + numbers.get(i);
	        }
	        return sum;
	    }

	 

	    public static void main(String[] args) {

	 

	        ArrayList<Integer> lst = new ArrayList<>();

	 

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of array: ");
	        int size=sc.nextInt();

	        System.out.println("Enter arraylist: ");
	        for (int i = 0; i < size; i++) {
	            lst.add(sc.nextInt());
	        }
	        System.out.println(lst);
	        System.out.println("ArrayList: " + lst);
	        sumNumbers(lst);
	        System.out.println("Sum of arralist: " + sumNumbers(lst));
	    }
}
	

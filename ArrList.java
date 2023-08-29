
import java.util.ArrayList;
public class ArrList {

	
	public static void main(String[] args){

	    // create ArrayList
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int sum =0;
		arrList.add(1);
		arrList.add(2);
		arrList.add(4);
		arrList.add(5);
		
		for (int i : arrList) {
		      sum += i;
		    }
	    System.out.println("ArrayList: " + sum);
	  }

}

















//import java.util.ArrayList;

//public class ArrList {
//
//  public static int sumNumbers(ArrayList<Integer> numbers) {
//      int sum = 0;
//      for (int i = 0; i < numbers.size(); i++) {
//          sum = sum + numbers.get(i);
//      }
//      return sum;
//  }
//
//  public static void main(String[] args) {
//
//      ArrayList<Integer> arr = new ArrayList<>();
//
//      // insert element to the arraylist
//      arr.add(1);
//      arr.add(2);
//      arr.add(3);
//      arr.add(4);
//      arr.add(5);
//
//      System.out.println("ArrayList: " + arr);
//      sumNumbers(arr);
//
//      System.out.println("Sum of arralist: " + sumNumbers(arr));
//  }
//
//
//
//}





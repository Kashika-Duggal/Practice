import java.util.Scanner;

public class RevString {

	
	 public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	    System.out.print("Enter input: ");
	    String str = sc.nextLine(); 
	
		  String revString = "";

		  for (int i = str.length() - 1; i >= 0; --i) {
		   revString += str.charAt(i);
		  }

		  System.out.println(revString);
		 }

}


//public class RevString {  
//
//
//public static void main(String[] args) {  
//
//	
//	
//	Scanner sc = new Scanner(System.in);
//    System.out.print("Enter input: ");
//    String txt = sc.nextLine();
//
//    
//	StringBuffer sb=new StringBuffer(txt);
//    sb.reverse();
//    System.out.println("Reversed string -" + sb);
//
//       
//
//    }  
//
//}
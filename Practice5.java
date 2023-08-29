import java.util.ArrayList;

import java.util.List;


public class Practice5 {

//	public static void main(String[] args) {
//		
//		int a[] = {12,23,34,14,25,46};
//		
//		for(int i : a) {
//			if(i % 2 ==0) {
//				System.out.println("Even nums"+ i);
//			}
//			else {
//				System.out.println("odd" + i);
//			}
//		}
//	}
	
	public static void main(String[] args) {

		 

	    List<Integer> list = new ArrayList<Integer>();

	    list.add(10);
	    list.add(10);

	    System.out.print(list.size());

	    list.remove(10);

	    System.out.print(list.size());
	  }

	 
}

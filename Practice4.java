import java.rmi.server.RemoteStub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.function.Predicate;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
////interface Cab{
////	void book();
////}
////public class Practice4 {
////
////	public static void main(String[] args) {
////		
////		Cab uber = () -> System.out.println("booked");
////		uber.book();
////	}
////
////}
//public class Practice4{
//	public static void main(String[] args) {
//		
//		List<Integer> data = new ArrayList<Integer>();
//		List<Integer> sal = new ArrayList<Integer>();
//		
//		data.add(10);
//		data.add(20);
//		data.add(13);
//		data.add(15);
//		
//		sal = data.stream().filter(d -> d % 2 == 0).collect(Collectors.toList());
//		for(int i : sal) {
//			System.out.println(i);
//		}
//	}
//}


//public class Practice4{
//	public static void main(String[] args) {
//		int a [] = {1,2,3,4,6};
//		for(int i : a) {
//			System.err.println(i);
//		}
//		
//	}
//}



//public class Practice4{
//	public static void main(String[] args) {
//		
//		Predicate<Integer> pr = a -> (a>2);
//		System.out.println(pr.test(10));
//	}
//}



//interface Cab{
//	default void book() {
//		System.out.println("dfjsd");
//	}
//}
//public class Practice4{
//	public static void main(String[] args) {
//		Cab c = new Cab();
//		c.book();
//	}
//}


//public class Practice4{
//	public static void main(String[] args) {
//		
//		List<String> data = new ArrayList<String>();
//		
//		data.add("abc");
//		data.add("bcd");
//		data.add("cde");
//		
//		for(String str : data) {
//			System.out.println(str);
//		}
//	}
//}

//public class Practice4{
//	public static void main(String[] args) {
//		
//		Set<String> data = new HashSet<String>();
//		
//		data.add("ab");
//		data.add("bc");
//		data.add("cd");
//		
//		for(String str : data) {
//			System.out.println(str);
//		}
//	}
//}


//public class Practice4{
//	public static void main(String[] args) {
//		
//		Queue<String> data = new LinkedList<String>();
//		
//		data.add("abd");
//		data.add("bce");
//		data.add("cdf");
//		
//		for(String str : data) {
//			System.out.println(str);
//		}
//	}
//}

//public class Practice4{
//	public static void main(String[] args) {
//		
//		Map<Integer, String> data = new HashMap<Integer, String>();
//		
//		data.put(1, "abc");
//		data.put(2, "bcd");
//		data.put(3, "cde");
//		
//		System.out.println(data);
//	}
//}


enum Level{
	HIGH,LOW, MEDIUM
}
public class Practice4{
	public static void main(String[] args) {
		
		Level data = Level.MEDIUM;
		System.out.println(data);
	}
}
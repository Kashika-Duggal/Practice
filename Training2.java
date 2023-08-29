import java.util.Scanner;
public class Training2 {

	public static void main(String[] args) {
		
//		String str = "Kashika Duggal";
//		if(str.charAt == 'a' && str == 'e' && str == 'i' && str =='o' && str == 'u') {
//			System.out.println("vowel present");
//		}
//		else {
//			System.out.println("Vowel not present");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number ");
//		int a = sc.nextInt();
//		if(a % 2 != 0) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not ");
//		}
		String str ="Kashika";
		 for(int i=0;i <str.length();i++){
	            if((str.charAt(i) == 'a') || 
	                (str.charAt(i) == 'e')  ||
	                (str.charAt(i) == 'i') || 
	                (str.charAt(i) == 'o') ||
	                (str.charAt(i) == 'u')) {
	                System.out.println(" The String contains " + str.charAt(i));
	            }
	        }
	}

}


package Practice3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpCaseStream {
  public static void main(String[] args) {
	  
    List < String > colors = Arrays.asList("red", "green", "white", "orange", "pink");
    
    System.out.println("List of strings: " + colors);
    
    // Convert strings to uppercase using streams
    List < String > uppercaseStrings = colors.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());

    System.out.println("\nUppercase Strings: " + uppercaseStrings);

    
  }
}


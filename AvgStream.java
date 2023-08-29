package Practice3;

import java.util.Arrays;
import java.util.List;

public class AvgStream {
  public static void main(String[] args) {
	// Getting the list view of Array
    List < Integer > nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    System.out.println("List of numbers: " + nums);

    // Calculate the average using streams
    double average = nums.stream()
      .mapToDouble(Integer::doubleValue)
      .average()
      .orElse(0.0);

    System.out.println("Average value of the said numbers: " + average);
  }
}

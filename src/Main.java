import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try {
            // Define a List of integers with duplicates
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(3); //Duplicate

            // Use a Set to remove duplicates
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            // Calculate the sum of the integers
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // Calculate the average of the integers
            double average = (double) sum / numbers.size();


            // Print the sum, average, and the list of integers without duplicates
            System.out.println("Original numbers: " + numbers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("List without duplicates: " + uniqueNumbers);

            //Handle exceptions, such as IndexOutOfBoundsException, IllegalArgumentException, and ArithmeticException.
            //Use try-catch-finally and multi-catch blocks as needed.

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SimpleInput {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine(); // Read input as a string

            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
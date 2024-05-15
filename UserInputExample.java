import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Taking double input
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Clearing the buffer
        scanner.nextLine();

        // Taking string input
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Printing out the inputs
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String: " + stringValue);

        // Closing the scanner
        scanner.close();
    }
}

ADD TWO NUMBERS:
import java.util.Scanner;
public class SimpleJavaProgram {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the first number: ");
 int num1 = scanner.nextInt();
 System.out.print("Enter the second number: ");
 int num2 = scanner.nextInt();
 int sum = num1 + num2;
 System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
 scanner.close();
 }}
Sure, here are basic Java programs for each of the tasks you mentioned:
1. Factorial:
```java
import java.util.Scanner;
public class Factorial {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int n = scanner.nextInt();
 int factorial = 1;
 
 for (int i = 1; i <= n; i++) {
 factorial *= i;
 }
 
 System.out.println("Factorial of " + n + " is: " + factorial);
 }
}
```
2. Fibonacci:
```java
import java.util.Scanner;
public class Fibonacci {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of terms: ");
 int n = scanner.nextInt();
 int a = 0, b = 1;
 
 System.out.print("Fibonacci Series: ");
 for (int i = 0; i < n; i++) {
 System.out.print(a + " ");
 int sum = a + b;
 a = b;
 b = sum;
 }
 }
}
```
3. Matrix Addition:
```java
import java.util.Scanner;
public class MatrixAddition {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of rows: ");
 int rows = scanner.nextInt();
 System.out.print("Enter the number of columns: ");
 int columns = scanner.nextInt();
 
 int[][] matrix1 = new int[rows][columns];
 int[][] matrix2 = new int[rows][columns];
 int[][] sum = new int[rows][columns];
 
 System.out.println("Enter the elements of the first matrix:");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < columns; j++) {
 matrix1[i][j] = scanner.nextInt();
 }
 }
 
 System.out.println("Enter the elements of the second matrix:");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < columns; j++) {
 matrix2[i][j] = scanner.nextInt();
 }
 }
 
 System.out.println("Sum of the matrices:");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < columns; j++) {
 sum[i][j] = matrix1[i][j] + matrix2[i][j];
 System.out.print(sum[i][j] + " ");
 }
 System.out.println();
 }
 }
}
```
4. Matrix Multiplication:
```java
import java.util.Scanner;
public class MatrixMultiplication {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of rows for matrix1: ");
 int rows1 = scanner.nextInt();
 System.out.print("Enter the number of columns for matrix1: ");
 int columns1 = scanner.nextInt();
 System.out.print("Enter the number of rows for matrix2: ");
 int rows2 = scanner.nextInt();
 System.out.print("Enter the number of columns for matrix2: ");
 int columns2 = scanner.nextInt();
 
 if (columns1 != rows2) {
 System.out.println("Matrix multiplication is not possible");
 return;
 }
 
 int[][] matrix1 = new int[rows1][columns1];
 int[][] matrix2 = new int[rows2][columns2];
 int[][] result = new int[rows1][columns2];
 
 System.out.println("Enter the elements of the first matrix:");
 for (int i = 0; i < rows1; i++) {
 for (int j = 0; j < columns1; j++) {
 matrix1[i][j] = scanner.nextInt();
 }
 }
 
 System.out.println("Enter the elements of the second matrix:");
 for (int i = 0; i < rows2; i++) {
 for (int j = 0; j < columns2; j++) {
 matrix2[i][j] = scanner.nextInt();
 }
 }
 
 for (int i = 0; i < rows1; i++) {
 for (int j = 0; j < columns2; j++) {
 for (int k = 0; k < columns1; k++) {
 result[i][j] += matrix1[i][k] * matrix2[k][j];
 }
 }
 }
 
 System.out.println("Result of matrix multiplication:");
 for (int i = 0; i < rows1; i++) {
 for (int j = 0; j < columns2; j++) {
 System.out.print(result[i][j] + " ");
 }
 System.out.println();
 }
 }
}
```
5. Armstrong Number:
```java
import java.util.Scanner;
public class ArmstrongNumber {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int number = scanner.nextInt();
 int originalNumber, remainder, result = 0, n = 0;
 
 originalNumber = number;
 
 // Find the number of digits
 for (originalNumber = number; originalNumber != 0; originalNumber /= 10) {
 ++n;
 }
 
 originalNumber = number;
 
 // Check if the number is armstrong
 while (originalNumber != 0) {
 remainder = originalNumber % 10;
 result += Math.pow(remainder, n);
 originalNumber /= 10;
 }
 
 if (result == number)
 System.out.println(number + " is an Armstrong number.");
 else
 System.out.println(number + " is not an Armstrong number.");
 }
}
```

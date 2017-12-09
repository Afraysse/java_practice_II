/*
A popular way to read stdin (standard input) is
by using the Scanner class and specifying the
Input Stream as System.in.

The Scanner Class is a simple text scanner that can parse primitive types/strings
using regular expressions.
*/

// Example: Scanner Class

// Creates a Scanner object called scanner
Scanner scanner = new Scanner(System.in); // specifying input stream
String myString = scanner.next()
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);

/* Write a function using the Scanner class that reads 3 inputs (all ints) */

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // assign to a var, scan each int 
    int a = scan.nextint();
    int b = scan.nextint();
    int c = scan.nextint();
    scan.close();

    // print each int
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}

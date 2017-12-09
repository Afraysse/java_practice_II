/*
Read an integer, a double and a String from stdin.
Print the values:
1. On the first line, print 'String: ' followed by an unaltered string.
2. On the second line, print 'Double: ' followed by an unaltered double.
3. On the third line, print 'Int: ' followed by an unaltered int.
*/

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    double d = scan.nextDouble();
    // clear the last newline char for that line of integer/double input
    scan.nextLine();
    // now we can scan for strings
    String s = scan.nextLine();
    scan.close()

    // print each one out
    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
}

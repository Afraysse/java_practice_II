/*
Java's System.out.printf function can be used to print formatted output.
*/

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("=============================");
    for(int i=0;i<3;i++) {
      String s1 = scan.next();
      int x = scan.nextInt();
      System.out.printf("%-15s%03d%n", s1, x);
    }
    System.out.println("=============================");
  }
}

/*
Java has 8 primitive data types:
* char
* boolean
* byte
* short
* int
* long
* float
* double

Primitives used to hold integer values include:
1. byte - an 8-bit signed integer
2. short - a 16-bit signed integer
3. int - a 32-bit signed integer
4. long - a 64-bit signed integer

Given an input integer, determine which primitive data
types are capable of properly storing that input.

#####

T - determines the number of test cases - comprised of a
single line  with an integer, n, which can be arbitrarily
large or small.

Determine the dataType capable of storing it.

Sample Output:
-150 can be fitted in:
* short
* int
* long
21333333333333333333333333333 can't be fitted in anywhere.

*/

class Solution {
  public static void main(String[] argh) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for(int i=0; i<t; i++) {
      try {
        long x = sc.nextLong();
        System.out.println(x + " can be fitted in: ");
        if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
          System.out.println("* byte");
        }
        if (x>= Short.MIN_VALUE && x<= Short.MAX_VALUE) {
          System.out.println("* short");
        }
        if (x>= Long.MIN_VALUE && Long.MAX_VALUE) {
          System.out.println("* long");
        }

      } catch (Exception e) {
        System.out.println(sc.next() + " can't be fitted anywhere.")
      }

    }
  }
}

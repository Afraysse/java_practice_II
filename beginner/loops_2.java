/*

Observe the series:
(a + 2^0 * b), (a+2^0 * b + 2^1 * b),...,(...+2^n-1 * b)

Given q queries in the form of a, b and n.

The first line contains an int, q, denoting the num of queries.
Each line of i of the q subsequent lines contains 3 space-seperated ints.

Example:
Have two queries:
1. a = 0, b = 2, and n = 10 to produce series s(sub 0), s(sub 1)...s(sub n-1):

s0 = 0+1*2 = 2
s1 = 0+1*2+2*2 = 6

*/

import java.util.*;
import java.io.*;

class Solution {
  public static void main (String[] argh) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for (int i=0;i<t;i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      int n = scan.nextInt();

      int count = 0;
      int constant = 0;
      int sum = 0;

      while(count < n) {
        if(count == 0) {
          constant == 1;
          sum = a + (constant*b) + sum;
        } else {
          constant = constant * 2;
          sum = (constant * b) + sum;
        }
        System.out.print(sum + " ");
        count += 1;
      } // end while loop
      System.out.println();
    }
    scan.close();
  }
}

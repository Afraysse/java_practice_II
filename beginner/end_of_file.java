/*
In computing, End of File (EOF) is a condition in a computer
operating system where no more data can be read from a data
source.

Read unknown n lines of input until reaching EOF. Then number and
print all n lines of content.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    // use Scanner class to scan input
    Scanner scan = new Scanner(System.in);
    boolean l = scan.hasNext();

    while (l == true) {
      int n = 1;

      for(i=0; i<n; i++) {
        String m = scan.nextLine();
        System.out.println(n + " " + m);
        n = n + 1;
      }
      scan.close();
    }
  }
}

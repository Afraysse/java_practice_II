// Java string sample
String myString = "Hello World!";

/*
The elements of a String are called characters.
The number of characters in a String is called length.
Length can be retrieved by running the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following
operations:
1. The sum of lengths A and B.
2. Determine if A is lexicographically larger than B (does B come before A in the
dictionary?)
3. Capitalize the first letter in A and B and print them on a single line, seperated
by a spce.
*/

import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String A = scan.next();
    String B = scan.next();

    // sum of lengths A and B
    int Sum = A.length() + B.length();
    System.out.println(Sum);

    // determine if A lexicographically larger than B
    int lexLonger = A.compareTo(B);
    if(lexLonger<0) {
      System.out.println("No");
    } else if (lexLonger==0) {
      System.out.prinln("They are equal.");
    } else if (lexLonger>0) {
      System.out.println("Yes");
    }

    // capitalize the first letter and print on a single line
    String s1 = A.substring(0,1).toUpperCase();
    String aCap = s1 + A.substring(1);

    String s2 = B.substring(0,1).toUpperCase();
    String bCap = s2 + B.substring(1);

    System.out.println(aCap + " " + bCap);

  }
}

// OR

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String A = scan.next();
    String B = scan.next();

    System.out.println(A.length()+B.length());
    System.out.println(A.compareTo(B)>0?"Yes":"No");
    System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
  }

}

/*
Given an integer, N, print its first 10 multiples. Each multiple N x i (where
1 <= i <= 10) should be printed out on a new line in the form: N x i = result.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    for(int x=1; x<=10; x++){
    int sum = N*x
    System.out.println(N + " x " + x + " = " + sum);
    
    }
  }
}

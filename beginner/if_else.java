/*
Given an int, n, perform the following:
1. if n%2 != 0, print 'Weird'
2. if n%2 == 0 and in range(2,6), print 'Not weird'
3. if n%2 == 0 and in range(6,21), print 'Weird'
4. if n%2 == 0 and n > 20, print 'Not weird'

Input: a positive int, 1 <= n <=100
*/

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String ans = "";
    if (n%2==1){
      ans = "Weird";
    } else if if (n > 20) || (n >= 2 && n <= 5) {
        ans = "Not Weird";
      } else {
      ans = "Weird"
    }
  }
}

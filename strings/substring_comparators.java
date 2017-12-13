import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int k = scan.nextInt();
    SortedSet<String> sets = new TreeSet<String>();
    for (int i=0; i<=str.length()-k;i++) {
      sets.add(str.substring(i,i+k));
    }
    System.out.println(sets.first());
    System.out.println(sets.last());
  }
}

//
// public class Solution {
//   public static String getSmallestAndLargest(String s, int k) {
//     String smallest = "";
//     String largest = "";
//     ArrayList subList = new ArrayList();
//
//     for (int i = 0; i < k; i++) {
//       for (int j = i+1; j<=k; j++) {
//         String newSub = s.substring(i,j);
//         subList.add(newSub);
//       }
//     }
//
//     for(int a=0; a<subList.length(); a++) {
//       for(int b= a+1; b<=subList.length(); b++) {
//         String comp1 = subList.get(a);
//         String comp2 = subList.get(b);
//         int compAll = a.compareTo(b);
//         if (compAll<0) {
//           largest = a;
//           smallest = b;
//           b=b+1;
//         } else if (compAll==0) {
//           largest = a;
//           b=b+1;
//         } else if (compAll>0) {
//           a=a+2;
//           largest = b;
//           smallest = a;
//         }
//         System.out.println("Largest: " + a);
//         System.out.prinln("Smallest: " + b);
//       }
//     }
//   }
// }

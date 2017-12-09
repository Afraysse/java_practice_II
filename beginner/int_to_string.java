
//Converting data types.
// Integer to String
int i = 42;
String str = Integer.toString(i);

// or
String str = "" + i;


/* You are given an integer, N that you have to convert into a
string.

-100 < N > 100
*/
import java.util.*;
import java.security.*;

public class Solution {
  public static void main(String[] args) {
    DoNotTerminate.forbidExit();

    try {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.close()

      String s = Integer.toString(n);
      if (n == Integer.parseInt(s)) {
        System.out.println("Good job!");
      } else {
        System.out.println("Wrong answer.");
      }
    } catch (DoNotTerminate.ExitTrappedException e) {
      System.out.println("Unsuccessful Termination!");
    }
  }
}
// create a class that prevents user from terminating code w/ exit(0).
class DoNotTerminate {
  public static class ExitTrappedException extends SecurityException {
    private static final long serialVersionUID = 1;
  }
  public static void forbidExit() {
    final SecurityManager securityManager = new SecurityManager() {
      @Override
      public void checkPermission(Permission permission) {
        if (permission.getName().contains("exitVM")) {
          throw new ExitTrappedException();
        }
      }
    };
    System.setSecurityManager(securityManager);
  }
}

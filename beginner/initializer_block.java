/*
Static initialization blocks are executed when the class
is loaded, and you can initialize static variables in those blocks.

What's the difference between initialization within a static block and
individual static initialization?
*/
// A static block example
public class staticTest {
  static String s;
  static int n;
  static double d;

  static {
    s = "I'm so static";
    n = 500;
    d = 4.33300;
  }
}

// Individual static initialization
public class staticTest2 {
  static String s = "I'm so static";
  static int n = 500;
  static double d = 4.33300;

}

/* So why static blocks?

Static initialization blocks allow for more complex initializations (e.g.
using conditionals):
*/

// using conditionals
static double a;
static {
  if (SomeCondition) {
    a = 0;
  } else {
    a = 1;
  }
}

/* Also helpful when more thna just construction is required: when
using a builder to create an instance, exception handling or work other
than creating static fields is necessary.

A static initialization block also runs after the inline static
initializers, so the following is valid:
*/

static double a;
static double e = 1;

static {
  a = e*4; // evaluates to 4
}

// Build an area constructor using static blocks.

class Solution {
    static Scanner scan = new Scanner(System.in);
    static boolean flag = true;
    static B = scan.nextInt();
    static H = scan.nextInt();

    static {
      try {
        if(B<= 0 || H<=0) { // will throw an error if negative input
          flag = false;
          throw new Exception("Breadth and height must be positive.");
        }
      } catch(Exception e) {
        System.out.println(e);
      }
    }
    public static void main(String[] args) {
      if(flag) {
        int area = B*H;
        System.out.println(area);
      }
    } // end of main
  } // end of class





















class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean l = scan.hasNext(); // returns True

    while(l==true) {
      int B = scan.nextInt();
      int H = scan.nextInt();

      if(B>0 && H>0) {
        int area = B*H;
        System.out.println(area)
      } else {
        System.out.println("java.lang.Exception: Breadth and height must be positive.")
      }
    }
  }
}

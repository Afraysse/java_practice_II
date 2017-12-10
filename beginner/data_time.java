/*
The Calendar class is an abstract class that provides methods for
converting between a specific instant in time and a set of calendar fields
such as YEAR, MONTH, DAY_OF_MONTH, HOUR, ect.

Given a date, write a method - getDay, which returns the day on that
date.

e.g. You're given August 14, 2017 - should return MONDAY.

Input will be a single line, space seperated MONTH, DAY, YEAR:
MM DD YYYY format.
*/

import java.time.LocalDate;

public class Solution {
  public static String getDay(String day, String month, String year) {
    if(year>=2000 || year<=3000) {

      // create a new instance of class DateFormatSymbols
      DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
      // Create an array of weekday strings
      String weekdays[] = dfs.getWeekdays();

      // create a new instance of the Calendar class
      Calendar cal = new GregorianCalendar(Locale.US);
      cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));

      System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());
    }

  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next(); // 08
    String day = in.next(); // 05
    String year = in.next(); // 2015

    System.out.println(getDay(day,month,year));
  }
}

// OR

import java.util.Scanner;
import java.util.*;

public class Solution {
  public static String getDay(String day, String month, String year) {
    // create an instance of the Calendar class
    Calendar c = Calendar.getInstance();
    c.set(Integer.valueOf(year), Integer.valueOf(month)-1, Integer.valueOf(day));
    String dayOfWeek = "";

    switch (c.get(Calendar.DAY_OF_WEEK)) {
      case 1:
        dayOfWeek = "Sunday";
        break;
      case 2:
        dayOfWeek = "Monday";
        break;
      case 3:
        dayOfWeek = "Tuesday";
        break;
      case 4:
        dayOfWeek = "Wednesday";
        break;
      case 5:
        dayOfWeek = "Thursday";
        break;
      case 6:
        dayOfWeek = "Friday";
        break;
      case 7:
        dayOfWeek = "Saturday";
    }

    return dayOfWeek.toUpperCase;
  }
}

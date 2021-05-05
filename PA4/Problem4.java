/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 20 October 2016
 * PA 4 - This program prompts for a date (month, day, year) and reports the day
  of the week for that date.
 * Bugs: none
 */

import java.util.*;

public class Problem4 {
  public static void main (String[] args) {
    Scanner console=new Scanner (System.in);
    System.out.println("Enter the month, day and year of a date as integers in order.");
    int month=console.nextInt();
    int day=console.nextInt();
    int year=console.nextInt();
    System.out.println("It's a "+intToDay(day, month, year));
  }

  public static String intToDay (int day, int month, int year) {
    int dayYear=(year-1601)*365+(year-1600)/4-(year-1600)/100+(year-1600)/400;
    //calculates the days from the the first day of 1601 to the first day of the entered year
    int allDays=0;
    if ((year-1600)%4==0 && month<3) {
      //calculates the total days if the date is before leap day in years that can be divided by 4
      if ((year-1600)%100==0 && !((year-1600)%400==0)) {
        //calculates the total days if the date is before leap day for non-leap years that can be divided by 4
        allDays=dayYear+dayMonth(month)+day-1;
      } else {
        //calculates the total days if the date is before leap day for leap years
        allDays=dayYear+dayMonth(month)+day-2;
      }
    } else {
      //calculates the total days for other conditions
      allDays=dayYear+dayMonth(month)+day-1;
    }
    if (allDays%7==0){ //if the total days divded by 7 remains 0 days, returns 'Monday'
      return "Monday";
    } else if (allDays%7==1){ //if the total days divded by 7 remains 1 day, returns 'Tuesday'
      return "Tuesday";
    } else if (allDays%7==2){ //if the total days divded by 7 remains 2 days, returns 'Wednesday'
      return "Wednesday";
    } else if (allDays%7==3){ //if the total days divded by 7 remains 3 days, returns 'Thursday'
      return "Thursday";
    } else if (allDays%7==4){ //if the total days divded by 7 remains 4 days, returns 'Friday'
      return "Friday";
    } else if (allDays%7==5){ //if the total days divded by 7 remains 5 days, returns 'Saturday'
      return "Saturday";
    } else { //the rest would remain 6 days and return 'Sunday'
      return "Sunday";
    }
  }

  public static int dayMonth(int month) {
    //calculates the days from the first day of the entered year to the first day of the entered month
    int days=0; //sets the base value of total as 0
    int day=0; //sets the base value of each amount of days added as 0
    for (int i=1; i<month;i++) {
      if (i==1||i==3||i==5||i==7||i==8||i==10){
        day=31; //31 days would be added to the total
      } else if (i==4||i==6||i==9||i==11) {
        day=30; //30 days would be added to the total
      } else {
        day=28; //28 days would be added to the total
      }
      days+=day; //adds up the total days
    }
    return days;
  }
}

/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 20 October 2016
 * PA 4 - This program prints how many days remain until one of two user’s
 birthday and which birthday is sooner.
 * Bugs: none
 */

import java.util.*;

public class Problem6 {
  public static void main (String[] args) {
    Scanner console= new Scanner (System.in);
    System.out.println("Enter the month and day of the first person's birthday,the second person's birthday and today's date as integers in order. ");
    int month1=console.nextInt();
    int day1=console.nextInt();
    int month2=console.nextInt();
    int day2=console.nextInt();
    int todayMonth=console.nextInt();
    int todayDay=console.nextInt();

    System.out.println(birthday(day1, month1,todayDay, todayMonth)+" days till first person's birthday!");
    System.out.println(birthday(day2, month2,todayDay, todayMonth)+" days till second person's birthday!");

    if (birthday(day1, month1,todayDay, todayMonth)<birthday(day2, month2,todayDay, todayMonth)) {
      System.out.println("The first person's birthday is sooner.");
    } else if (birthday(day1, month1,todayDay, todayMonth)==birthday(day2, month2,todayDay, todayMonth)) {
      System.out.println("The two people's birthdays are equally soon.");
    } else {
      System.out.println("The second person's birthday is sooner.");
    }
  }

  public static int birthday(int day, int month, int todayDay, int todayMonth) {
    int days=0; //sets the base value as 0
    if (month<todayMonth || (month==todayMonth && day<todayDay)) {
      //calculates the days remain if the date is before today's date
      days=365-(dayMonth(todayMonth)+todayDay)+dayMonth(month)+day;
    } else {
      //calculates the days remain if the date is after today's date
      days=dayMonth(month)+day-dayMonth(todayMonth)-todayDay;
    }
    return days;
  }

  public static int dayMonth(int month) {
    //calculates the days from the first day of the entered year to the first day of the entered month
    int day=0; //sets the base value of each amount of days added as 0
    int dayMonth=0; //sets the base value of total as 0
    for (int i=1; i<month;i++) {
      if (i==1||i==3||i==5||i==7||i==8||i==10){
        day=31; //31 days would be added to the total for the corresponding months
      } else if (i==4||i==6||i==9||i==11) {
        day=30; //30 days would be added to the total for the corresponding months
      } else {
        day=28; //28 days would be added to the total for Feburary
      }
      dayMonth+=day; //adds up the total days
    }
    return dayMonth;
  }
}

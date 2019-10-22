package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        String months;
        System.out.println("Days: ");
        days = keyboard.nextInt();
        switch (days){
            case 28: months = "February, most of the time";
            break;
            case 29: months = "February during leap years";
            break;
            case 30: months = "April, June, September, November";
            break;
            case 31: months = "January, March, May, July, August, October, December";
            break;
            default: months = "There are no months with this many days";
        }
        System.out.println(months);
    }
}

package myJavaApp;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: " );
        int year = sc.nextInt();
        if((year % 4 == 0  && year % 100 !=0) || (year % 400 == 0)){
            System.out.println("this is a leap  year");
        }
        else{
            System.out.println("This is not leap year");
        }

    }
}

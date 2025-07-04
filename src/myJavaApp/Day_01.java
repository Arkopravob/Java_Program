package myJavaApp;

import java.util.Scanner;

public class Day_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name  = sc.next();
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hi " + name + " you are " + age + " years old and you love java") ;
    }
}

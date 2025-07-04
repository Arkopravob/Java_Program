package myJavaApp;

import java.util.Scanner;

public class GreatesOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        if(n > m && n > o){
            System.out.println("the larger ");
        }
         else if (m > o && m > n) {
            System.out.println("the second numbre is  larger ");

        }else{
            System.out.println("the third number is larger ");
    }
    }
}

package myJavaApp;

import java.util.Scanner;

public class Day_5 {
    public static void main(String[] args) {
        // even odd tester
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        if(n%2 == 0){
//            System.out.println("its a even number");
//        }
//        else{
//            System.out.println("its odd number");
//        }

        //ternary operator
        String res =( n%2 == 0) ? "its a even number":"its odd number";
        System.out.println(res);


    }
    }


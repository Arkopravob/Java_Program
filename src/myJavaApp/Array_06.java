package myJavaApp;

import java.util.Scanner;

public class Array_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dir 1 for right and 0 for left: ");
        int dir = sc.nextInt();
        System.out.println("enter the rotation ");
        int x = sc.nextInt();
        int a[] = {1,3,4,5,8,9,10};

        int len = a.length;
        int b [] = new int[len];
        if(dir == 1) {
            for (int i = 0; i < len; i++) {
                b[(i + x) % len] = a[i];
            }
        }
        else{
            for(int i = 0 ; i < len ; i++){
                b[(i-x+len)%len] = a[i];
            }

        }
        //previous array
        for(int i:a){
            System.out.print(i + " ");
        }
        //after rotate
        System.out.println();
        for(int i:b){
            System.out.print(i + " ");
        }
    }
}

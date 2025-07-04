package myJavaApp;

public class Methods_01 {
    public static  int squared(int a){
        int sq = a*a;
        return  sq;
    }
    public static void main(String[] args) {
        int sq2 = squared(5);
        System.out.println("the squared of number is : " + sq2);
    }
}

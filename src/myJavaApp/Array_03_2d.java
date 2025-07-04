package myJavaApp;

public class Array_03_2d {
    public static void main(String[] args) {
        //declaring 2d array
        int [][] daywiseTemp = new int [][]{{ 29, 21 }, { 24, 23 },
                { 26, 22 }, { 28, 23 }, { 29, 24 }, { 23, 20 }, { 29, 21 }};
        //display 2d array
        for(int i = 0 ; i < 7 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                if(j == 0){
                    System.out.println("the maximum temperature is: " + daywiseTemp[i][j] + " on this day " + i);
                }
                else{
                    System.out.println("the minimum temperature is " + daywiseTemp[i][j] + " on this day " + i);
                }
            }
        }
    }


}

package myJavaApp;

public class Array_02_forEach {
    public static void main(String[] args) {
        long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
        for(long contactNumber : restaurantContacts){
            System.out.println(contactNumber);
        }
    }
}

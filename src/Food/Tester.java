package Food;
class Customer{
    public String customerId; // instance variable
    public String customerName;
    public long contactNumber;
    public String address;

    public void displayCustomerDetails() {
        System.out.println("Displaying customer details \n***************************");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Address : " + address);
        System.out.println();
    }
}
class Food1{
    public String FoodName;
    public String cusine;
    public int Quantity;
    public String foodtype;
    public double unitPrice;

    public void foodDescription(){
        System.out.println("food name is: " + FoodName);
        System.out.println("food cusine is: " + cusine);
        System.out.println("food type is: " + foodtype);
        System.out.println("food quantity is: " + Quantity);
        System.out.println("unit price is :" + unitPrice);
    }
}
public class Tester {
    public static void main(String[] args) {
        // object creation
        Customer customer = new Customer();
        // Assigning values to the instance variables
        customer.customerId ="c101";
        customer.customerName ="arko";
        customer.contactNumber = 9800989570l;
        customer.address = "kolkata";
        // Displaying the customer details
        customer.displayCustomerDetails();
        Food1 food = new Food1();
        food.FoodName ="Biriyani";
        food.cusine = "Indian";
        food.Quantity = 5;
        food.foodtype = "lunch";
        food.unitPrice = 350.00;
        food.foodDescription();
    }
}

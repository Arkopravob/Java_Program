package ObjectOrientedProgramming;

public class Account {
    private double balance = 4903.00; //state variable
    public double getBalance(int accountId){ //method

        return balance;
    }

    public static void main(String[] args) { // main method
        Account accnt = new Account();
        double value = accnt.getBalance(123456);
        System.out.println("this balance is:" + value);

    }
}

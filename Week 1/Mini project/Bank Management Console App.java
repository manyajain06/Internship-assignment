import java.util.Scanner;

class MyBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int choice = 0;

        System.out.println("Welcome to Bank Account App");

        while (choice != 4) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("Deposited successfully.");
            } 
            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                if (amount > balance) {
                    System.out.println("Not enough balance!");
                }
            else {
                    balance = balance - amount;
                    System.out.println("Withdrawn successfully.");
                }
            } 
        else if (choice == 3) {
                System.out.println("Current Balance: " + balance);
            } 
        else if (choice == 4) {
                System.out.println("Thank you!");
            }
        else {
                System.out.println("Wrong choice!");
            }
        }
        
       
    }
}

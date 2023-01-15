/* Project #1
 * Source code file: Project1.java
 * Programmer: Tristan Miller
 * Due: 03/08/22
 * Description: 
 * Design and implement an ADT named CreditCard that represents a credit card.   
 */
package ADT;

import java.util.Scanner;

public class CreditCard {
    private String customerName;
    private String accountNumber;
    private String dueDate;
    private int rewardPoints;
    private double accountBalance;
    
    static Scanner input = new Scanner(System.in);
    
    public CreditCard() {
        customerName = "Tristan Miller";
        accountNumber = "1234 5678 9876 5432";
        dueDate = "06/26";
        rewardPoints = 50;
        accountBalance = 500;
    }
    
    public String getCustomerName() {
    return customerName;
    }
    public void setCustomerName(String customerName) {
    this.customerName = customerName;
    }
    public String getAccountNumber() {
    return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    }
    public String getDueDate() {
    return dueDate;
    }
    public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
    }
    public int getRewardPoints() {
        return rewardPoints;
    }
    public void setRewardPoints(int rewardPoints) {
    this.rewardPoints = rewardPoints;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public String charge(double amount) {
        if (amount > accountBalance) {
            System.out.println("\nYou have exceeded your credit card limit and no charge can be made");
            accountBalance = 0;
        }
        accountBalance = accountBalance - amount;
        System.out.println("\nA charge of " + amount + " has been made.");
        String charge = "A charge of " + amount + " has been made.";
        return charge;
    }
    public String advance(double amount) {
        if (amount > accountBalance) {
            System.out.println("\nYou have exceeded your credit card limit and no charge can be made");
        }
        accountBalance = accountBalance - amount;
        System.out.println("\nYou have withdrawn $ " + amount);
        String advance = "You have withdrawn $ " + amount;
        return advance;
    }

    public String payment(double amount) {
        accountBalance = accountBalance + amount;
        System.out.println("You now have a credit limit of $ " + accountBalance);
        String payment = "You have a balance of $ " + accountBalance;
        return payment;
    }

    public String interest() {
        accountBalance = (accountBalance * 0.02) + accountBalance;
        System.out.println("An interest of " + accountBalance * 0.02 + " has been added to your balance\n");
        String interest = "\nAn interest of " + accountBalance * 0.02 + " has been added to your balance";
        return interest;
    }
    
    public void statistics() {
        
        System.out.println("\nCard Holder: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + accountBalance);
        System.out.println("Reward Points: " + rewardPoints);
        System.out.println("Interest: " + "2%");
        System.out.println("Due Date: " + dueDate + "\n");

    }

    public void showMenu() {
        int list = 0;
        while (list != 6) {
            System.out.println("\n1: Choose Charge \n2: Advance \n3: Payment \n4: Interest \n5: Statistics \n6: Exit");
            list = input.nextInt();
            switch (list) {
                case 1:
                    float amount;
                    System.out.println("\nEnter the amount: ");
                    amount = input.nextFloat();
                    String charge = charge(amount);
                    break;
                case 2:
                    float withdrawalAmount;
                    System.out.println("\nEnter amount to withdraw: ");
                    withdrawalAmount = input.nextFloat();
                    String advance = advance(withdrawalAmount);
                    break;
                case 3:
                    float paymentAmount;
                    System.out.println("\nEnter payment.");
                    paymentAmount = input.nextFloat();
                    String payment = payment(paymentAmount);
                    break;
                case 4:
                    String interest = interest();
                    break;
                case 5:
                    statistics();
                    break;
                default:
                    System.out.println("\nYou Have Exited");
                    break;
            }
        }
    }
   
}

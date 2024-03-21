package bank;

import java.util.Scanner;
public class c4 {
 public static void main(String[] args) {
	 
    double firstBalance;
    Scanner input = new Scanner(System.in);
    BankAccount acc1 = new BankAccount();
 
    System.out.println("How much do you want to open your account?");
    firstBalance = input.nextDouble();
 
    acc1.setBalance(firstBalance);
    System.out.printf("1:Balance = %.2f\n", acc1.getBalance());
 
    acc1.withdraw(500.50); //Less than firstBalance
    System.out.printf("2:Balance = %.2f\n", acc1.getBalance());
 
    acc1.deposit(1000.00);
    System.out.printf("3:Balance = %.2f\n", acc1.getBalance());
    
 }
}

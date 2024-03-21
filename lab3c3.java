package lab3;

import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        String msg = "";
        float num1 = 0, num2 = 0, pwd = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        msg = input.nextLine();
        
        if (msg.indexOf("v") != -1) {
            System.out.print("Enter a number: ");
            num1 = input.nextFloat();
            pwd = num1 + msg.length();
        } else {
            System.out.print("Enter a number: ");
            num1 = input.nextFloat();
            System.out.print("Enter a number: ");
            num2 = input.nextFloat();
            pwd = num1 + num2;
        }
        System.out.println(pwd + msg);
    }
}

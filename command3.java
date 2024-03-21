package calculator;

import java.util.Scanner;
public class c3 {
 public static void main(String[] args) {

double num1=0, num2=0;
Scanner input = new Scanner(System.in);

 calculator result = new calculator();
 System.out.print("Enter the fist number: ");
 num1 = input.nextDouble();

 System.out.print("Enter the second number: ");
 num2 = input.nextDouble();

 System.out.printf("Difference: %.2f", result.diff(num1,num2));

 if (num2!=0) {
 System.out.printf("\nTimes: %.2f", result.times(num1,num2));
 } else {
 System.out.printf("\nTimes: Not Available!");
 }
 }
}

package lab3;
import java.util.Scanner;
public class c {
 public static void main(String[] args) {
int end, code; 
String msg="", subMsg="";
Scanner input = new Scanner(System.in); 
 System.out.print("Enter your message (more than 6 characters): ");
 msg = input.nextLine();
 
 end = msg.length();
 code = msg.indexOf("A");
 // if your message has 'A' character, you will get a password.
 
 if (code == -1) 
 subMsg = msg.substring(0,end);
 else
 subMsg = msg.substring(2,6);
 
 System.out.println("Your password is " + subMsg + "..."); 
 
 }
}



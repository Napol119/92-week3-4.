package student;
import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
    	   String name = ""; // ต้องใส่ ; หลังจาก ""
           String id; // เปลี่ยน int เป็น String เนื่องจากใน Student มี stdID เป็น String
           Scanner input = new Scanner(System.in);

           Student std1 = new Student(); // แก้จาก new std() เป็น new Student()
           System.out.print("Enter your name: ");
           name = input.nextLine();

           System.out.print("Enter your ID number: "); // ต้องเป็น "" รอบครอบข้อความ
           id = input.nextLine();

           std1.setStdName(name);
           std1.setStdID(id);

           System.out.println("Login: " + std1.getLogin(id)); 
           System.out.println("Password: " + std1.getPassword());
       }
   }

package bicycle;

public class c1 {
	 public static void main(String[] args) {
		 Bicycle bike1, bike2, bike3;
		 String owner1;
		 
		 bike1 = new Bicycle();
		 owner1 = bike1.getOwnerName();
		 System.out.println(owner1 + " owns a bicycle.");
		 bike2 = new Bicycle("John Smith");
		 owner1 = bike2.getOwnerName();
		 System.out.println(owner1 + " owns a bicycle.");
		 
		 bike3 = new Bicycle();
		 bike3.setOwnerName("Adam Smith");
		 owner1 = bike3.getOwnerName();
		 System.out.println(owner1 + " owns a bicycle."); 
		 }
		}



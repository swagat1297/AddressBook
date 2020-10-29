import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MultipleCustomer {
	Scanner sc = new Scanner(System.in;
	ArrayList<String> Customer = new ArrayList<String>();
	
	System.out.println("enter candidate name:");
	Customer.add(sc.nextLine());
	
	String ShowString = Customer.toString();
	
	HashMap<String, String> ShowString = new HashMap<String, String>();
	HashMap<String, Integer> ShowInt = new HashMap<>();
	
	System.out.println("enter First Name:");
	String firstName = sc.next();
	System.out.println("enter Last Name:");
	String lastName = sc.next();
	System.out.println("enter address:");
	String address = sc.next();
	System.out.println("enter city:");
	String city = sc.next();
	System.out.println("enter state:");
	String state = sc.next();
	System.out.println("enter Zip:");
	int zip = sc.nextInt();
	System.out.println("enter phoneNo:");
	int PhoneNo = sc.nextInt();
	ShowString.put("FirstName", firstName);
	ShowString.put("LastName", lastName);
	ShowString.put("Address", address);
	ShowString.put("City", city);
	ShowString.put("State", state);
	ShowInt.put("Zip", zip);
	ShowInt.put("PhoneNumber", PhoneNo);
	ShowString.put("Email", "G@daf");
	
	System.out.println(ShowString);
	System.out.println(ShowInt);
	sc.close();

}

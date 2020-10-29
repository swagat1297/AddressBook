import java.util.*;

public class AddressBook {

	public void AddressbookDetail() {
		Scanner sc = new Scanner(System.in);
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
		
	public static void UpdateDetail() {
		Scanner update = new Scanner(System.in);
		HashMap<String, String> ShowString = new HashMap<String, String>();
		HashMap<String, Integer> ShowInt = new HashMap<>();
		System.out.println("Select option to replace\n 1.First name\n 2.Lastname\n"
				+ "3.Address\n 4.city\n 5.state\n 6.Zip\n 7.PhoneNo");
		int UpdateOption = update.nextInt();
		
		switch(UpdateOption) {
				case 1:System.out.println("enter firstname:");
					   String firstName1 = update.next();
					   ShowString.replace( "FirstName", firstName1);
					   break;
				case 2:System.out.println("enter Last Name:");
				       String lastName1 = update.next();
				       ShowString.replace( "LastName", lastName1);
				       break;
				case 3:System.out.println("enter Last Name:");
			           String address1 = update.next();
			           ShowString.replace( "Address", address1);
			           break;
				case 4:System.out.println("enter Last Name:");
		               String city1 = update.next();
		               ShowString.replace( "City", city1);
		               break;
				case 5:System.out.println("enter Last Name:");
		               String State1 = update.next();
		               ShowString.replace( "State", State1);
		               break;
				case 6:System.out.println("enter Last Name:");
		               int zip1 = update.nextInt();
		               ShowInt.replace( "Zip", zip1);
		               break;
				case 7:System.out.println("enter Last Name:");
		               int PhoneNo1 = update.nextInt();
		               ShowInt.replace( "PhoneNumber", PhoneNo1);
		               break;
		         
		         default:
		        	 	 System.out.println("wrong input");
		}
		update.close();
		
		
	}
	public static void DeleteDetails() {
		Scanner Remove = new Scanner(System.in);
		HashMap<String, String> ShowString = new HashMap<String, String>();
		HashMap<String, Integer> ShowInt = new HashMap<>();
		System.out.println("Select option to remove\n 1.First name\n 2.Lastname\n"
				+ "3.Address\n 4.city\n 5.state\n 6.Zip\n 7.PhoneNo");
		int RemoveOption = Remove.nextInt();
		
		switch(RemoveOption) {
				case 1:ShowString.remove( "FirstName");
					   break;
				case 2:ShowString.remove( "LastName");
				       break;
				case 3:ShowString.remove( "Address");
			           break;
				case 4:ShowString.remove( "City");
		               break;
				case 5:ShowString.remove( "State");
		               break;
				case 6:ShowInt.remove( "Zip");
		               break;
				case 7:ShowInt.remove( "PhoneNumber");
		               break;
		         
		         default:
		        	 	 System.out.println("wrong input");
		}
		Remove.close();
		
		
	}
	public static void MultipleCustomer() {
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
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("choose your option: \n 1.Update details \n 2.delete details \n 3.Add multiple details 4.exit");
			int Option = scan.nextInt();
			switch(Option) {
			
					case 1:
						   UpdateDetail();
						   break;
					case 2:
						   DeleteDetails();
						   break;
					case 3:
						   MultipleCustomer();
						   break;
					case 4:
						   System.exit(0);
					default:
						
						   System.out.println("invalid input!");
			}
		}
		
	

	}

}

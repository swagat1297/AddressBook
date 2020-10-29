import java.util.*;
public class Update {
	Map<String, String> ShowString = new HashMap<String, String>();
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

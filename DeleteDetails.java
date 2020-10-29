import java.util.*
public class DeleteDetails {

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

import java.util.Scanner;

public class TestClass {

	public static void main(String args[])
	  {
		String n;
		String email;
		String phoneno;
		String address;
		String type; 
		int choice;
	 
		String houseno;
		String haddress;
		String city;
		String streetno; 
		String zipcode;
	     Scanner in = new Scanner(System.in);
	     
	     System.out.println("Enter 1 for houseOwner and 2 for HouseBuyer : ");
	     System.out.println(" 1. HouseOwner \n 2. HouseBuyer");
	     choice = in.nextInt();
	     in.nextLine();

	     if(choice == 1)
	     {
	    	 UserFactory users = new UserFactory();
	 	     UserAdd u = new UserAdd(users);
	 	     
	 	     User user = u.create("", "", "", "", "ho");
	 	     System.out.println(user);
	 	     
	 	     System.out.println("Enter your house no: ");
		     houseno = in.nextLine();
		     System.out.println("Enter your house address: ");
		     haddress = in.nextLine();
		     System.out.println("Enter city name: ");
		     city = in.nextLine();
		     System.out.println("Enter street no: ");
		     streetno = in.nextLine();
		     System.out.println("Enter zip code: ");
		     zipcode = in.nextLine();
		     
	 	     House h = new House(houseno,haddress,city, streetno,zipcode);
	    	 System.out.println(h);
	     }
	     else if(choice == 2)
	     {
	  	   
		 UserFactory users = new UserFactory();
		 UserAdd u = new UserAdd(users);
		     
	     System.out.println("Enter your name: ");
	     n = in.nextLine();
	     System.out.println("Enter your email: ");
	     email = in.nextLine();
	     System.out.println("Enter your phoneno: ");
	     phoneno = in.nextLine();
	     System.out.println("Enter your address: ");
	     address = in.nextLine();
	     	     
	     User user = u.create(n, email, phoneno, address, "hb");
	     System.out.println(user);
	     
	     String yesno;
	     System.out.println("Do you want to buy the house? y/n");	
	     yesno = in.nextLine();
	     if(yesno.equals("y"))
	     {
	    	 AddHouse h = new AddHouse();
	    	 Iterator houseIterator = h.createIterator();
		     System.out.println("Which House do you want to buy???");
		     printHouse(houseIterator);
		     String hno;
		     System.out.println("PLease Enter the house no");	     
	    	 hno = in.nextLine();
	    	 
		     housestate hs = new housestate(hno) ;
		     
	    	 
	     }
	     else if(yesno.equals("n"))
	     {
		     System.out.println("You don't buy house !!!");	     
	     }
	     }
	     else
	     {
		     System.out.println("Invalid choice !!!");	     
	     }
	  }
	private static void printHouse(Iterator iterator) {
		int i= 1;
		
		while (iterator.hasNext()) {
			String Item = (String)iterator.next();
			System.out.println(i +" "+Item);
			i++;
			

		}
	}

}

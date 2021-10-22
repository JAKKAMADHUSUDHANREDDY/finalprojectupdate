
public class UserFactory {

	public User createUser(String name, String email, String phoneno, String address, String type) {
		User u = null;

		if (type.equals("ho")) {
			u = new HouseOwner();
		} 
		else if (type.equals("hb")) {
			u = new HouseBuyer(name, email, phoneno,  address);
		}
		return u;
}

}

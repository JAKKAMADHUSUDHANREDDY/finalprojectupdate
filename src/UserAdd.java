
public class UserAdd {

	UserFactory factory;
	 
	public UserAdd(UserFactory factory) { 
		this.factory = factory;
	}
 
	public User create(String name, String email, String phoneno, String address, String type) {
		User u;
 
		u = factory.createUser(name, email, phoneno,  address, type);
		return u;
	}

}

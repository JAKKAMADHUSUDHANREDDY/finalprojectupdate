import java.util.ArrayList;
import java.util.List;

public class User {
	String name;
	String email;
	String phoneno;
	String address;
	String type; 
	
	List<String> users = new ArrayList<String>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- User Details ----\n");
		display.append(name + "\n");
		display.append(email + "\n");
		display.append(phoneno  + "\n");
		display.append(address  + "\n");
		for (String u : users) {
			display.append(u + "\n");
		}
		return display.toString();
	}
}

import java.util.List;

public class House {
	String houseno;
	String address;
	String city;
	String streetno; 
	String zipcode;
	private List<House> houses;

	
	public House(String houseno, String address, String city, String streetno, String zipcode) {
		this.houseno = houseno;
		this.address = address;
		this.city = city;
		this.streetno = streetno;
		this.zipcode = zipcode;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void add(House h) {
		houses.add(h);
	   }

	   public void remove(House h) {
		   houses.remove(h);
	   }

	   public List<House> getSubordinates(){
	     return houses;
	   }

	
	   public String toString(){
	      return ("House :[ Houseno : "+ houseno 
	      +", city : "+ city + ", streetno :"
	      + streetno+", Zipcode :"+ zipcode +" ]");
	   }   
	
}

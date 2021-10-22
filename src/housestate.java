import java.util.Scanner;

public class housestate {

	private state Buy;
	private state sold;
	private state review;

	private state s;
	
	public housestate(String name) {
	 Buy = new buy(name);
	 sold = new sale(name);
	 s = Buy;
	 s.startstate();
	 s = sold;
	 s.startstate();
	 review = new review(name);
	 s = review;
	 s.endstate();
	 String r;
     Scanner in = new Scanner(System.in);

	 System.out.println("kindly review the house... ");
	 r = in.nextLine();
	 review = new review(r);
	 s.startstate();
	}

	
	public state getS() {
		return s;
	}


	public void setS(state s) {
		this.s = s;
	}


	public state getBuy() {
		return Buy;
	}

	public void setBuy(state buy) {
		Buy = buy;
	}

	public state getSold() {
		return sold;
	}

	public void setSold(state sold) {
		this.sold = sold;
	}

	public state getReview() {
		return review;
	}

	public void setReview(state review) {
		this.review = review;
	}
	
	

}

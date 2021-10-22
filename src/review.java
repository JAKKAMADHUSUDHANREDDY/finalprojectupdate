
public class review implements state{
    String name;
    
	public review(String name) {
	this.name = name; 
	}

	@Override
	public void startstate() {
		System.out.println("you review the "+ name);
	}

	@Override
	public void endstate() {
		// TODO Auto-generated method stub
		System.out.println("you  did not review  any house");
		
	}

}

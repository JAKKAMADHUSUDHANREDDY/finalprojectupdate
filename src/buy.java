
public class buy implements state{
    String name;
    
	public buy(String name) {
	this.name = name; 
	}

	@Override
	public void startstate() {
		System.out.println("you want to buy "+ name);
		
	}

	@Override
	public void endstate() {
		// TODO Auto-generated method stub
		System.out.println("you  do not want to buy any house");
		
	}

}

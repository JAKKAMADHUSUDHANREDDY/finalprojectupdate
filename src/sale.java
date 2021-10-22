
public class sale implements state{
    String name;
    
	public sale(String name) {
	this.name = name; 
	}

	@Override
	public void startstate() {
		System.out.println("This house  "+ name+" is sold");
		
	}

	@Override
	public void endstate() {
		System.out.println("House is not sold");
	
	}

}

public class AddHouse implements HouseInterface{
	static final int MAX = 10;
	int numberOfHouses = 0;
	String[] houseno;
	public AddHouse()
	{
		houseno = new String[MAX];
		addItem("Hno1","Church Lane","london", "4","5687");	
		addItem("Hno2","South Street","london", "2","5697");	
		addItem("Hno3","North Street","london", "3","5567");	
		addItem("Hno4","North Road","london", "5","5097");	
		addItem("Hno5","Stanley Road","london", "7","5007");	
		addItem("Hno6","York Road","london", "9","5611");	
	}

  
	public void addItem(String housenum, String address, String city, String streetno, String zipcode) 
	{
		if (numberOfHouses >= MAX) {
			System.err.println("Sorry, you cannot add more houses...");
		} else {
			houseno[numberOfHouses] = housenum;
			numberOfHouses = numberOfHouses + 1;
		}
	}
 
	public String[] getHouses() {
		return houseno;
	}
  

	public String toString() {
		return "Houses";
	}


	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new HouseIterator(houseno);
	}

}

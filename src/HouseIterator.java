
public class HouseIterator implements Iterator {

	String[] house;
	int position = 0;
	public HouseIterator(String[] house) {

	this.house = house;
	}

	@Override
	public boolean hasNext() {
		if (position >= house.length || house[position] == null) {
			return false;
		} else {
			return true;
		}	}

	@Override
	public Object next() {
		String ser = house[position];
		position = position + 1;
		return ser;
	}

}

package fc;

public class Laboratory extends Corporation{
	
	public Laboratory(String name,String address,String phone,int account) {
		super(name,address,phone,account);
	}
	
	public Item devNewItem(String name,int price) {
		return new Item(name,price);
	}

}
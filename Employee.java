package fc;

import java.util.List;

public class Employee extends Person{
	
	public Employee(String name,int age,String sex,int account) {
		super(name,age,sex,account);
	}
	
	public int payItem(Client client,Store store) {
		List<Item> cart = client.getCart();
		int totalAccount = 0;
		
		
		for(Item _cart : cart) {
			totalAccount += _cart.getPrice();
			System.out.println("read item ("+_cart.getPrice()+" yen)");
		}
		
		store.deposit(totalAccount);
		client.deposit(-totalAccount);
		System.out.println("total:"+totalAccount+" yen.");
		
		return totalAccount;
	}
	

}

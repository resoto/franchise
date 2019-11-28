package fc;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person{
	
	List<Item> cart; 
	
	public Client(String name,int age,String sex,int account) {
		super(name,age,sex,account);
		this.cart = new ArrayList<>();
	}
	
	public int selectItem(Item item) {
		if(item == null) return -1;
		this.cart.add(item);
		System.out.println("add to cart");
		return this.cart.size();
	}
	
	public List<Item> getCart(){
		return this.cart;
	}
	

}

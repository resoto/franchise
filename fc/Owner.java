package fc;

import java.util.ArrayList;
import java.util.List;

public class Owner extends Person{
	
	
	private List<Store> storeList;
	
	public Owner (String name,int age,String sex,int account) {
		super(name,age,sex,account);
		this.storeList = new ArrayList<>();
	}
	
	public Store openStore(String name,String address,String phone,int account) {
		this.deposit(-account);
		System.out.println("start a new store.");
		Store newStore = new Store(name,address,phone,account);
		this.storeList.add(newStore);
		return newStore;
	}
	
	public void closeStore(Store store) {
		for(int i=0;i<this.storeList.size();i++) {
			if(this.storeList.get(i)==store) {
				this.storeList.remove(i);
				System.out.println("close a store.");
				return;
			}
		}
		System.out.println("store not found.");
	}

}

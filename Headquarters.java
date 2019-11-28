package fc;

import java.util.ArrayList;
import java.util.List;

public class Headquarters extends Corporation{
	
	private List<Owner> ownerList;
	
	public Headquarters(String name,String address,String phone,int account) {
		super(name,address,phone,account);
		this.ownerList = new ArrayList<>();
		System.out.println("start a new fc company.");
	}
	
	public Owner contract(String name,int age,String sex,int account) {
		Owner newOwner = new Owner(name,age,sex,account);
		this.ownerList.add(newOwner);
		System.out.println("contract a new owner.");
		return newOwner;
	}
	
	public void fire(Owner owner) {
		for(int i=0;i<this.ownerList.size();i++) {
			if(this.ownerList.get(i)==owner) {
				this.ownerList.remove(i);
				return;
			}
		}
	}

}

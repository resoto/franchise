package fc;

import java.util.ArrayList;
import java.util.List;

public class Store extends Corporation{
	
	private List<Item> stock;
	private List<Employee> employeeList;
	
	public Store(String name,String address,String phone,int account) {
		super(name,address,phone,account);
		this.stock = new ArrayList<>();
		this.employeeList = new ArrayList<>();
	}
	
	public Employee employ(String name,int age,String sex,int account) {
		System.out.println("hire a new employ.");
		Employee newEmployee = new Employee(name,age,sex,account);
		this.employeeList.add(newEmployee);
		return newEmployee;
	}
	
	public Client advertise(String name,int age,String sex,int account) {
		return new Client(name,age,sex,account);
	}
	
	public Item getStock() {
		if(stock.size()!=0) {
			Item item = this.stock.get(0);
			this.stock.remove(0);
			return item;
		}
		
		System.out.println("out of stock");
		for(int i=0;i<3;i++) {
			this.setStock(new Item("rice", 300));
		}
		return null;
		
	}
	
	public void setStock(Item item) {
		if(this.withdraw()>item.getPrice()) {
			this.deposit((int)(-item.getPrice()*0.8));
			System.out.println("stock a item ("+(int)(item.getPrice()*0.8)+" yen)");
			this.stock.add(item);
			return;
		}
		System.out.println("Insufficient funds");
	}
	


}

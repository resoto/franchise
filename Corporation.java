package fc;

public class Corporation {
		
	private String name;
	private String address;
	private String phone;
	private int account;
	
	public Corporation(String name,String address,String phone,int account){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.account = account;
	}
	
	public int withdraw() {
		return this.account;
	}
	
	public void deposit(int account) {
		this.account += account;
	}

}

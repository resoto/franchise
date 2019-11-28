package fc;

public class Person {
	
	private String name;
	private int age;
	private String sex;
	private int account;
	
	public Person(String name,int age,String sex,int account) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.account = account;	
	}
	
	public int withdraw() {
		return this.account;
	}
	
	public void deposit(int account) {
		this.account += account;
	}

}

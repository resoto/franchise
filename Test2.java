package fc;

public class Test2 {

	public static void main(String[] args) {
		
		//本社作成
		Headquarters headquarters = new Headquarters("デイリー","能美市","0120",100000);
		
		//研究所作成
		Laboratory laboratory = new Laboratory("石川研究所","金沢","0130",5000);
		
		//オーナーとの契約
		Owner owner = headquarters.contract("山本",35,"男",50000);
		
		//店舗オープン
		Store store = owner.openStore("金沢店","金沢市","7667428",3000);
		
		//従業員を雇う
		Employee employee = store.employ("斎藤",18,"女",500);
		
		//商品開発
		Item item1 = laboratory.devNewItem("ラーメン", 200);
		Item item2 = laboratory.devNewItem("ジュース", 150);
		Item item3 = laboratory.devNewItem("ワイン", 1500);
		Item item4 = laboratory.devNewItem("ギフト券", 3000);
		
		//仕入れをする
		store.setStock(item1);
		store.setStock(item2);
		store.setStock(item3);
		store.setStock(item4);
		
		//客を作成
		Client client = store.advertise("高木", 20, "女", 2500);
		
		//カートに商品を追加
		client.selectItem(item1);
		client.selectItem(item3);
		
		//会計前の残高
		System.out.println("store:"+store.withdraw()+" yen");
		System.out.println("client:"+client.withdraw()+" yen");
		
		//会計をする
		employee.payItem(client, store);
		
		//会計後の残高
		System.out.println("store:"+store.withdraw()+" yen");
		System.out.println("client:"+client.withdraw()+" yen");
		

	}

}

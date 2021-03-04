package fc;

public class Test1 {

	public static void main(String[] args) {
		
		//本社作成
		Headquarters headquarters = new Headquarters("daily","nomi","0120",100000);
		
		//オーナーとの契約
		Owner owner = headquarters.contract("yamamoto",35,"man",50000);
		
		//店舗オープン
		Store store = owner.openStore("kanazawa","kanazawa","7667428",3000);
		
		//従業員を雇う
		Employee employee = store.employ("saitou",18,"men",500);
		
		//仕入れをする
		store.setStock(new Item("rice", 300));
		store.setStock(new Item("rice", 300));
		store.setStock(new Item("rice", 300));
		
		//客を作成
		Client client = store.advertise("高木", 20, "女", 2500);
		
		//カートに商品を追加
		client.selectItem(store.getStock());
		client.selectItem(store.getStock());
		client.selectItem(store.getStock());
		client.selectItem(store.getStock());
		
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

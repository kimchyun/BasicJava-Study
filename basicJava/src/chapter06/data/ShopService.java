package chapter06.data;

public class ShopService {
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopservice;
	}
}

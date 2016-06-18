import provider.PlusProvider;
import service.Service;
import services.Services;

public class Client {
	public static void main(String[] args) {
		Services.registerProvider("plus", new PlusProvider());
		Service plusService = Services.newInstance("plus");
		System.out.println(plusService.calculation(1, 2));
	}
}

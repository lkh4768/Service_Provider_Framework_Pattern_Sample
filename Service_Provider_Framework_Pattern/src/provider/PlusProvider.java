package provider;

import service.PlusService;
import service.Service;

public class PlusProvider implements Provider {

	@Override
	public Service newService() {
		// TODO Auto-generated method stub
		return new PlusService();
	}
}

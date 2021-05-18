package accountOperations.adapters;

import accountOperations.business.abstracts.GoogleService;
import accountOperations.business.concretes.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void registerToSystem() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register();
		
	}

}

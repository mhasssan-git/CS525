package customers;

public class CustomerDAO implements ICustomerDAO{
	public CustomerDAO(ILogger logger) {
		this.logger = logger;
	}

	private ILogger logger ;
	
	public void save(Customer customer) {
		// simple sleep
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CustomerDAO: saving customer "+customer.getName());
		logger.log("Customer is saved in the DB: "+ customer.getName() );
	}

}

package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements ICustomerService {

	@Override
	
	public void Save(Customer customer) {
		System.out.println("Veritaban�na kay�t edildi: " + customer.getFirstName() + " " + customer.getLastName());
	}

}

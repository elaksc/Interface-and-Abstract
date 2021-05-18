  
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starbucks");
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer("Elanur", "Kaþcýoðlu", 2000 , "12345678912"));																								

		System.out.println("=============================================");

		System.out.println("Nero");
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.Save(new Customer( "Elanur", "Kaþcýoðlu", 2000, "12345678912"));
	}
	}


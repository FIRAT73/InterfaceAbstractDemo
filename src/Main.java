import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); //Burda istenilen servis kullanılabilir.
		customerManager.Save(new Customer(1,"Fırat", "Seven", LocalDate.of(1998,12,20),"45875954050"));
		

	}

}




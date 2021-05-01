package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Abdullah", "�ET�N");
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers ) ;
		customerManager.add(customer);

	}

}

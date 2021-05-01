package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//loosly(gev�ek) - tightly(kat�) - coupled (ba�l�)
	
	public void add(Customer customer) {
		System.out.println("M��teri Eklendi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri Silindi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}

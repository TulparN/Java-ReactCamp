package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " Kay�t Ba�ar�l� !!!");
	}
	
	public void addMultiple(Customer[] customer) {
		for (Customer customer2 : customer) {
			add(customer2);
		}
	}
}
//polymorphism - �ok bi�imlilik

		// SOLID - O = Open Closed Principle -- sisteme yeni �zellik eklendi�inde hi�
		// bir kodu de�i�tiremezsin sadece sisteme �zellik eklersin
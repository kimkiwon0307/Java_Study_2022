package mainPoint.ch01;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(100);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김두한");
		customerKim.setCustomerId(102);
		customerKim.setBonusPoint(10000);
		System.out.println(customerKim.showCustomerInfo());
		
	}

}

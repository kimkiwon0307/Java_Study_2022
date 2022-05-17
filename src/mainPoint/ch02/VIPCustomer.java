package mainPoint.ch02;

public class VIPCustomer extends Customer{
	
	public VIPCustomer() {
		
		customerGarde = "VIP";
		bonusRatio = 0.05;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}

}


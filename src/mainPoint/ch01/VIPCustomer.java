package mainPoint.ch01;

public class VIPCustomer extends Customer {
	
	private int agentId;
	double saleRatio;
	
	public VIPCustomer() {
//		customerGrade = "VIP";  상위 클래스에 선언된 private 멤버 변수는  하위 클래스에서 접근 할 수없다.
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAentId() {
		return agentId;
	}
	
	//오버라이딩
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

}


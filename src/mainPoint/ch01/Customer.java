package mainPoint.ch01;

public class Customer {
	
	protected int customerId;
	protected String customerName;
	//private String customerGrade; private는 상속받은 하위 클래스에서 접근 불가능
	protected String customerGrade; //protected는 외부클래스에 접근 못하고 하위클래스는 접근 가능
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price;
	}
	
	public String showCustomerInfo() {
		
		return customerName + "님의 등급은 " + customerGrade +" 이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
	

}

package introduction.ch04;

public class overloadingTest {

	public static void main(String[] args) {
		
		//기본생성자
		overloading sLee = new overloading();
		
		//오버로딩 생성자1
		overloading sLee2 = new overloading(12345,"soonsin",3);
		
		//오버로딩 생성자2
		overloading sLee3 = new overloading(12345,"soonsin");
		
		System.out.println(sLee.showInfo());
		System.out.println(sLee2.showInfo());
		System.out.println(sLee3.showInfo());
	}
}



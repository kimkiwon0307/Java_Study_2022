package introduction.ch02;

public class FunctionTest {
	
	
	// 더하기 함수
	public static int addNum(int num1, int num2) {
		
		int result = num1 + num2;
		
		return result;
	}
	
	// 인사 함수
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 1 ~ 100까지 합구하기
	public static int calcSum() {
		
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			sum +=1;
		}
		
		return sum;
	}
	
	
	public static void main (String[] args) {
		
		int n1=10;
		int n2=20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		int num = calcSum();
		System.out.println(num);
	
	}
}

package basic.ch06;

public class WhileTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while( num <= 10) {
			
			sum +=num;
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);
	
		/* 무한 반복
		 * while(true) {
		 * 
		 * }
		 */	
	
	}
}



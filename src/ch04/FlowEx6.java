package ch04;

public class FlowEx6 {

	public static void main(String[] args) {
			
		int score = (int)(Math.random() * 10) + 1;
		
		switch(score * 100) {
				
		case 100 :
			System.out.println("점수 100점");
		case 200 :
			System.out.println("점수 200점");
			break;
		default :
			System.out.println("다음기회");
		}
	}
}


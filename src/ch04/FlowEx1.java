package ch04;

public class FlowEx1 {

	public static void main(String[] args) {
		
		int visitCount = 5;
		if (visitCount < 1) {
			System.out.println("처음 오셨군요. 방문에 주셔서 감사합니다.");
		}else {
			System.out.println("다시 방문해 주셔서 감사합니다.");
		}
			System.out.println("방문 횟수는 " + visitCount +"입니다.");
	}
}



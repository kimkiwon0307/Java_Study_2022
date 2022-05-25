package basic.ch06;

public class SwitchCaseTest2 {
	
	public static void main(String [] args) {
	
	String medal = "GOLD";
	
	switch(medal) { 
		
	case "GOLD":
		System.out.println("골드");
		break;
	case "SILVER":
		System.out.println("실버");
		break;
	default:
			System.out.println("노메달");
			break;
		}
	}
}


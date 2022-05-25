package introduction.ch05;

public class StudentTests {

	public static void main(String[] args) {
		
		Student sLee = new Student(100, "lee");
		sLee.setKoreaSubject("국어", 100);
		sLee.setMathSubject("수학", 100);
		
		sLee.showStudentSocre();
	}

}

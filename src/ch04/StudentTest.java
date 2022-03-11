package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		// 인스턴스 생성
		Student studentLee = new Student();
		
		studentLee.studentID = 123;
		studentLee.setStudentName("lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		
	}
	
}

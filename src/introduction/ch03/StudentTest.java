package introduction.ch03;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student01 = new Student();
		
		student01.studentName = "이순신";
		student01.address = "서울";
		
		Student student02 = new Student();
		
		student02.studentName = "홍길동";
		student02.address = "인천";
		
		
		student01.showStudentInfo();
		System.out.println(student01.getStudentName());
		
		student02.showStudentInfo();
		System.out.println(student02.getStudentName());
	}
}



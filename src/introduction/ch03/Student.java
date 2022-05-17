package introduction.ch03;

public class Student{
	
	// 속성 : 멤버변수
	int studentId;
	String studentName;
	String address;
	
	// 기능 : 멤버함수(메서드)
	public void showStudentInfo() {
		System.out.println(studentId + "," + studentName + "," + address);
	}
	
	public String getStudentName() {
		
		return studentName;
	}
}


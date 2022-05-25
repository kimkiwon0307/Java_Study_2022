package introduction.ch04;

public class Student {
	
	//멤버변수
	public int studentNumber;
	public String studentName;
	public int garde;

	// 생성자 
	public Student(int studentNumber, String studentName, int garde) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.garde = garde;
	}
	
	// 정보 메서드
	public String showInfo() {
		return studentName + studentNumber + garde;
	}
}


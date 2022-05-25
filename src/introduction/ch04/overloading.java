package introduction.ch04;

public class overloading {
	

	//멤버변수
	public int studentNumber;
	public String studentName;
	public int garde;

	// 기본 생성자
	public overloading() {};
	
	// 오버로딩한 생성자1 
	public overloading(int studentNumber, String studentName, int garde) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.garde = garde;
	}
	
	// 오버로딩한 생성자2 
		public overloading(int studentNumber, String studentName) {
			this.studentNumber = studentNumber;
			this.studentName = studentName;
		}
	
	// 정보 메서드
	public String showInfo() {
		return studentName + studentNumber + garde;
	}

}

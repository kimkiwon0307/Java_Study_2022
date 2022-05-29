package ch05;

public class ArrayEx11 {
	
	//for문을 통한 배열 복사
	public static void main(String[] args){
		
		int[] number = {1,2,3,4,5};
		int[] newNumber = new int[10];
		
		for(int i=0; i<number.length; i++) {
			newNumber[i] = number[i];
		}
		for(int i=0; i<newNumber.length; i++) {
			System.out.println(newNumber[i]);
		}
	}
}


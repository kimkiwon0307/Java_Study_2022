package mainPoint.ch03;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
}

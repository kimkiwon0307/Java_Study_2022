package mainPoint.ch04;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void turnOff() {
		System.out.println("시동을 끈다");
	}
	
	final public void run() {
		drive();
		stop();
		turnOff();
	}
}


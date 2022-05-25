package objectOriented;

public class TVTest {

	public static void main(String[] args) {
		
		TV tv; // 클래스의 객체를 참조하기 위한 참조변수를 선언한다. 
		tv = new TV(); //TV인스턴스를 생성한 후, 생성된 TV인스턴스의 주소를 tv에 저장한다.

		tv.channel = 7;
		tv.channelDown();
		System.out.println("tv1의 채널은"+ tv.channel);
		
		TV tv2 = new TV();
		
		tv2.channel = 8;
		tv.channelDown();
		System.out.println("tv2의 채널은" + tv2.channel);
	}
}



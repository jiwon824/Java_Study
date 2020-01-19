import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class MyClass {
	public static void main(String args[]) {
		
		String id = "JAVA APT 507";
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);//1층에서 위 층으로 올라간다는 의미
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();

		//Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
	}
}
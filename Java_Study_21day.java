class Car{
	private int num;
	private double gas;

	public Car(){ //여기가 생성자
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}

	void show(){
		System.out.println("차령번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

public class Sample{
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.show();
		
	}
}
class Car{
	private int num;
	private double gas;

	public Car(){ //인수가 없을 때 불리는 생성자
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public Car(int n, double g){ //인수가 2개인 생성자
		this(); //생성자 시작에 인수 없는 생성자 호출
		//this()를 사용하면 다른 생성자를 호출할 수 있다. this()는 반드시 생성자 안에서 가장 먼저 호출한다.
		num = n;
		gas = g;
		System.out.println("차량번호가 "+ num + "이며, 연료 양이 " + gas + "인 자동차가 만들어졌습니다.");
	}

	void show(){
		System.out.println("차량번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

public class Sample{
	public static void main(String[] args) {
		Car car1 = new Car(); //인수X
		car1.show();

		Car car2 = new Car(1234, 20.5); //인수 2개
		car2.show();
		
	}
}
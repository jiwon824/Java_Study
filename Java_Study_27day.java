class Car{
	private int num;
	private double gas;

	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}

	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("차량번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다");
	}
	void show(){
		System.out.println("차량번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

public class Sample{
	public static void main(String[] args) {
		Car car1; //car1을 선언
		System.out.println("car1을 선언했습니다.");
		car1 = new Car(); //객체 1개를 생성해서 변수 car1에 대입
		car1.setCar(1234, 20.5);
		
		Car car2;
		System.out.println("car2를 선언했습니다.");
		car2 = car1; //car1을 car2에 대입
		System.out.println("car1을 car2에 대입했습니다.");
		
		System.out.println("car1이 가리키는");
		car1.show();

		System.out.println("car2가 가리키는");
		car2.show();
		
	}
}
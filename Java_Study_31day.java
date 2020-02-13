//자동차 클래스
class Car{
	protected int num;
	protected double gas;//접근 제한자 protected는 자식에서 사용가능

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

//레이싱 카 클래스(상속)
class RacingCar extends Car{
	private int course;

	public RacingCar(){
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}

	public void setCourse(int c){
		course =c;
		System.out.println("코스 번호를" + course + "로 했습니다.");
	}
	public void show(){//sub class 메소드 이름도 super class와 같게
		System.out.println("레이싱 카의 차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
		System.out.println("코스 번호는" + course + "입니다.");
	}
}

public class Sample{
	public static void main(String[] args) {
		RacingCar rccar1;
		rccar1 = new RacingCar();

		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
		rccar1.show();
	}
}
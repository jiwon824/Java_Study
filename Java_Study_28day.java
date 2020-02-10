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
		Car[] cars;
		cars= new Car[3];//배열
		
		for (int i = 0; i<cars.length; i++){
			cars[i] = new Car();
		}
		
		cars[0].setCar(1234, 20.5);
		cars[1].setCar(2345, 30.5);
		cars[2].setCar(3456, 40.5);
		
		for (int i=0; i<cars.length; i++){
			cars[i].show();
		}
	}
}
class Car{
	public static int sum = 0; //Ŭ���� ����
	private int num;
	private double gas;
	
	public Car(){
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	public void setCar(int n, double g){
		num = n; gas = g;
		System.out.println("���� ��ȣ�� "+ num + "����, ���� ���� " + gas + "�� �ٲپ����ϴ�.");
	}

	public static void showSum(){
		System.out.println("�ڵ����� ��� "+ sum + "�� �ֽ��ϴ�.");
	}
	public void show(){
		System.out.println("���� ��ȣ�� "+ num + "�Դϴ�.");
		System.out.println("���� ���� "+ gas + "�Դϴ�.");
	}
}

public class Sample{
	public static void main(String[] args) {
		Car.showSum();
		Car car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car.showSum();

		Car car2 = new Car();
		car2.setCar(4567, 30.5);
		
		Car.showSum();
		
	}
}
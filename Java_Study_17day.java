class Car{
	int num;
	double gas;
}

public class HelloWorldApp{
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();

		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("���� ��ȣ��" + car1.num + "�Դϴ�.");
		System.out.println("���� ����" + car1.gas + "�Դϴ�.");
	}
}
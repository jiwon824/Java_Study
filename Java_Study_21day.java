class Car{
	private int num;
	private double gas;

	public Car(){ //���Ⱑ ������
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}

	void show(){
		System.out.println("���ɹ�ȣ��" + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}

public class Sample{
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.show();
		
	}
}
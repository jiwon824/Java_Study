class Car{
	private int num;
	private double gas;

	public Car(){ //�μ��� ���� �� �Ҹ��� ������
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	public Car(int n, double g){ //�μ��� 2���� ������
		num = n;
		gas = g;
		System.out.println("������ȣ�� "+ num + "�̸�, ���� ���� " + gas + "�� �ڵ����� ����������ϴ�.");
	}

	void show(){
		System.out.println("������ȣ��" + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}

public class Sample{
	public static void main(String[] args) {
		Car car1 = new Car(); //�μ�X
		car1.show();

		Car car2 = new Car(1234, 20.5); //�μ� 2��
		car2.show();
		
	}
}
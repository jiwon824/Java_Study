class Car{
	int num;
	double gas;

	int getNum(){
		System.out.println("���� ��ȣ�� �����߽��ϴ�.");
		return num;
	}
	
	double getGas(){
		System.out.println("���� ���� �����߽��ϴ�.");
		return gas;
	}
	
	void setNumGas(int n, double g){
		num = n;
		gas = g;
		System.out.println("���ɹ�ȣ��" + num + "����, ���� ����" + gas + "�� �ٲپ����ϴ�");
	}
	void show(){
		System.out.println("���ɹ�ȣ��" + num + "�Դϴ�.");
		System.out.println("���� ����" + gas + "�Դϴ�.");
	}
}

public class Sample6{
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNumGas(1234, 20.5);
		car1.show();
		
	}
}
public class Sample1 {
	public static void main(String[] args) {
		int[] test1;
		test1 = new int[3];
		System.out.println("test1�� �����߽��ϴ�.");
		System.out.println("�迭�� �����߽��ϴ�.");

		test1 [0] = 80;
		test1 [1] = 60;
		test1 [2] = 22;

		int[] test2;
		System.out.println("test2�� �����߽��ϴ�.");

		test2 = test1;
		System.out.println("test2�� test1�� �����߽��ϴ�.");

		for (int i = 0; i<3; i++) {
			System.out.println("test1�� ����Ű��"+ (i+1) + "��° ����� ������" + test1 [i] + "�Դϴ�.");
		}
		
		for (int i = 0; i<3; i++) {
			System.out.println("test2�� ����Ű��"+ (i+1) + "��° ����� ������" + test2 [i] + "�Դϴ�.");
		}
		
		test1 [2] = 100;
		System.out.println("test1�� ����Ű�� �� ��° ����� ������ �����մϴ�.");
		

		for (int i = 0; i<3; i++) {
			System.out.println("test1�� ����Ű��"+ (i+1) + "��° ����� ������" + test1 [i] + "�Դϴ�.");
		}

		for (int i = 0; i<3; i++) { //test1�� ��Ҹ� �ٲٸ� test2�� ��ҵ� �ٲ��.
			System.out.println("test2�� ����Ű��"+ (i+1) + "��° ����� ������" + test2 [i] + "�Դϴ�.");
		}

	}
}
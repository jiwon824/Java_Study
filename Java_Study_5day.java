public class MyClass {

	public static void main(String args[]) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;

		System.out.println(b);

		//int c = 1.1; int�� double�� �������� �� �� ������ ��.
		double d = 1.1;

		int e = (int) 1.1;
 //1.1�� ������ int�� �ٲٸ� 0.1�� �ս��� �Ͼ.
		System.out.println(e);

		//1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());

	}

}
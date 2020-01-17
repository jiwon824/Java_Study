public class MyClass {

	public static void main(String args[]) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;

		System.out.println(b);

		//int c = 1.1; int에 double을 담으려고 할 때 에러가 남.
		double d = 1.1;

		int e = (int) 1.1;
 //1.1을 강제로 int로 바꾸면 0.1이 손실이 일어남.
		System.out.println(e);

		//1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());

	}

}
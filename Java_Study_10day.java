import java.io.*;

public class MyClass {
	public static void main(String args[]) throws IOException {
		System.out.println("������ �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
				System.out.println("1�� �ԷµǾ����ϴ�.");

			case 2:
				System.out.println("2�� �ԷµǾ����ϴ�.");
			default:
				System.out.println("1 Ȥ�� 2�� �Է��Ͻʽÿ�.");
				break;
	}
}
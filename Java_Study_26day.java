import java.io.*;

public class Sample{
	public static void main(String[] args) throws IOException {
		
		System.out.println("�����ڸ� �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str = br.readLine();

		String stru = str.toUpperCase(); //�빮�� ��ȯ
		String str1 = str.toLowerCase(); //�ҹ��� ��ȯ

		System.out.println("�빮�ڷ� ��ȯ�ϸ� " + stru + "�Դϴ�.");
		System.out.println("�ҹ��ڷ� ��ȯ�ϸ� " + str1 + "�Դϴ�.");

		
	}
}
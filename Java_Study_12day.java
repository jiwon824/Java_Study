import java.io.*;

public class Sample1 {
	public static void main(String[] args) throws IOException {
		System.out.println("�� ���� *�� ����Ͻðڽ��ϱ�?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);

		for(int i =1; i <= num; i++){
			System.out.println("*");
		}
	}
}
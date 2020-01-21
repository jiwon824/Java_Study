import java.io.*;

public class MyClass {
	public static void main(String args[]) throws IOException {
		System.out.println("please enter an integer.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1)
			System.out.println("1 entered");

		System.out.println("Exit the progrem");
	}
}
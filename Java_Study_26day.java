import java.io.*;

public class Sample{
	public static void main(String[] args) throws IOException {
		
		System.out.println("영문자를 입력하십시오.");
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str = br.readLine();

		String stru = str.toUpperCase(); //대문자 변환
		String str1 = str.toLowerCase(); //소문자 변환

		System.out.println("대문자로 변환하면 " + stru + "입니다.");
		System.out.println("소문자로 변환하면 " + str1 + "입니다.");

		
	}
}
package Ten;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = scanner.nextLine();
		int n = s.length();
		char[] st = s.toCharArray();
		for(int i=n-1;i>=0;i--) {
			System.out.print(st[i]);
		}
	}

}

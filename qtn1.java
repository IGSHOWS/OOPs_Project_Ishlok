package foundation_coding_GL;

import java.util.Scanner;

public class qtn1 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = sc.next().trim();
		sc.nextLine();
		if (is_palindrome(input)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static boolean is_palindrome(String str) {
		if (str.length() == 0 || str.length() == 1)
			return true;
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return (is_palindrome(str.substring(1, str.length() - 1)));
		} else {
			return false;
		}

	}

}

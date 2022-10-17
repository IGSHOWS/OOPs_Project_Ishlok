package foundation_coding_GL;

import java.util.Scanner;

public class qtn_4_power_x {
	static double temp;

	public static double power(double x, long n) {
		if (n == 1)
			return x;
		else if (n == 0)
			return 1;
		if (n < 0)
			return (power(1 / x, -n));

		temp = power(x, n / 2);

		if (n % 2 == 0)
			return temp * temp;
		else
			return temp * temp * x;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x = sc.nextInt();
		System.out.println("Enter the value of n : ");
		int num = sc.nextInt();

//		qtn_4_power_x obj = new qtn_4_power_x();
		System.out.println("Result is : " + x + " to the power of " + num + " is : " + power(x, num));
	}

}

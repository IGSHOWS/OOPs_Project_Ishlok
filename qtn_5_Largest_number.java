package foundation_coding_GL;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class qtn_5_Largest_number {

	public String is_Largest(int nums[]) {
		if (nums.length == 0)
			return null;

		String sa[] = new String[nums.length];
		for (int i = 0; i < sa.length; i++) {
			sa[i] = Integer.toString(nums[i]);
		}

		Arrays.sort(sa, new Comparator<String>() {
			public int compare(String a, String b) {
				String o1 = a + b;
				String o2 = b + a;
				return o2.compareTo(o1);
			}
		});

		if (sa[0].equals("0"))
			return "0";

		StringBuilder sb = new StringBuilder();
		for (String s : sa)
			sb.append(s);

		return sb.toString();

	}

	public static void main(String[] args) {
		qtn_5_Largest_number obj = new qtn_5_Largest_number();
		int num[] = { 3, 30, 34, 5, 9 };

		System.out.println(obj.is_Largest(num));

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of elements you want to store:");
//		int num = sc.nextInt();
//		int[] array = new int[10];
//		System.out.println("Enter the elemets of an array : ");
//		for(int i=0;i<num;i++)
//		{
//			array[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<num;i++)
//		{
//			System.out.println(is_Largest());
//		}

	}

}

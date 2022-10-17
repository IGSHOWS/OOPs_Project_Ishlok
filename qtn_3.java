package foundation_coding_GL;

public class qtn_3 {
	public static boolean indices(int nums[], int target) {
		int n = nums.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] == target)
					return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		qtn_3 obj = new qtn_3();
		int arr[] = { 1, 2, 3, 6, 8 };
		System.out.println(qtn_3.indices(arr, 31));

	}

}

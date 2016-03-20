public static long Permutation(int n, int r) {
		long sum = 1;
		for (int i = 0; i < r; i++) {
			sum *= n;
			n--;
		}
		return sum;
	}

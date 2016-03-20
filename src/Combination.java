public static double Combination(int n, int r) {
		long sum = Permutation(n, r);
		long divider= Integer.parseInt(getFactorial(r).toString());
		return sum/divider;
	}

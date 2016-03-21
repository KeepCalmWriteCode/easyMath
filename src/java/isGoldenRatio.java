	public static boolean isGoldenRatio(int division, int divider){
		double res = (double) division/divider;
		if(res == GoldenRatio  || res == GoldenRatio - 0.001 || res == GoldenRatio + 0.001)
			return true;
		return false;
	}

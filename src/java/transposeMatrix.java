	public static int[][] transposeMatrix(int[][] n) {
		int[][] transposed = new int[n[0].length][n.length];
		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[0].length; j++) {
				transposed[j][i] = n[i][j];
			}
		}
		return transposed;
	}

	public static String[][] transposeMatrix(String[][] n) {
		String[][] transposed = new String[n[0].length][n.length];
		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[0].length; j++) {
				transposed[j][i] = n[i][j];
			}
		}
		return transposed;
	}

	public static double[][] transposeMatrix(double[][] n) {
		double[][] transposed = new double[n[0].length][n.length];
		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[0].length; j++) {
				transposed[j][i] = n[i][j];
			}
		}
		return transposed;
	}

	public static float[][] transposeMatrix(float[][] n) {
		float[][] transposed = new float[n[0].length][n.length];
		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[0].length; j++) {
				transposed[j][i] = n[i][j];
			}
		}
		return transposed;
	}

	public static char[][] transposeMatrix(char[][] n) {
		char[][] transposed = new char[n[0].length][n.length];
		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[0].length; j++) {
				transposed[j][i] = n[i][j];
			}
		}
		return transposed;
	}

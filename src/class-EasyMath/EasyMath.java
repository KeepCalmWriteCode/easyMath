package math;

import java.math.BigInteger;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class EasyMath {
	private final static double GoldenRatio = 1.61803399;

	public static double power(int base, int power) {
		return Math.pow(base, power);
	}

	public static double squareRoot(int n) {
		return Math.sqrt(n);
	}

	public static double absoluteValue(int n) {
		return Math.abs(n);
	}

	public static double absoluteValue(long n) {
		return Math.abs(n);
	}

	public static double absoluteValue(double n) {
		return Math.abs(n);
	}

	public static double absoluteValue(float n) {
		return Math.abs(n);
	}

	public static boolean isGoldenRatio(int division, int divider) {
		double res = (double) division / divider;
		if (res == GoldenRatio || res == GoldenRatio - 0.001
				|| res == GoldenRatio + 0.001)
			return true;
		return false;
	}
	public static double Logarithm(int base, int n){
		return Math.log(n) / Math.log(base);
	}
	public static long Permutation(int n, int r) {
		long sum = 1;
		for (int i = 0; i < r; i++) {
			sum *= n;
			n--;
		}
		return sum;
	}
	public static double Combination(int n, int r) {
		long sum = Permutation(n, r);
		long divider= Integer.parseInt(getFactorial(r).toString());
		return sum/divider;
	}
	public static BigInteger getFactorial(int f) {
		if(f>Integer.MAX_VALUE){
			throw new RuntimeErrorException(null, "Input is bigger than Max Value of Integer");
		}
	    BigInteger factorial = BigInteger.valueOf(1);
	    for (int i = 1; i <= f; i++)
	        factorial = factorial.multiply(BigInteger.valueOf(i));
	    return factorial;
	}

	public static boolean isPrime(int p) {
		if (p == 2)
			return true;
		if (p % 2 == 0)
			return false;
		for (int i = 3; i * i <= p; i = i + 2)
			if (p % i == 0)
				return false;
		return true;
	}

	public static int digitsOfNFactorial(int n) {

		return (n == 0 || n == 1) ? 1 : (int) Math.floor(((n + 0.5)
				* Math.log(n) - n + 0.5 * Math.log(2 * Math.PI))
				/ Math.log(10)) + 1;

	}

	public static int getNumbersOfDigit(int n) {
		return (n == 0 || n == 1) ? 1 : (int) (Math.floor(Math.log10(n))) + 1;
	}


	public static int[][] transposeMatrix(int[][] n) {
		int[][] transposed = new int[n[0].length][n.length];
		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[0].length; j++) {
				transposed[j][i] = n[i][j];
			}
		}
		return transposed;
	}
	public static int [][] createRandomSquareMatrix(int n){
		int [][] matrix = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (((GoldenRatio+Math.PI+Math.E) * Math.random()) + 5);
			}

		}
		return matrix;
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

	public static void AllPermutationOfString(String str) {
		AllPermutationOfString("", str);
	}

	private static void AllPermutationOfString(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				AllPermutationOfString(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
		}
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

	public static void print2DMatrix(int[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}
	public static void print2DMatrix(boolean[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}

	public static void print2DMatrix(String[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}

	public static void print2DMatrix(char[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}

	public static void print2DMatrix(float[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}

	public static void print2DMatrix(double[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}
	public static boolean isSkewSymmetricMatrix(int[][] matrix) {
		   for (int i = 0; i < matrix.length; ++i)
		        for (int j = i + 1; j < matrix.length; ++j)
		             if (matrix[i][j] != -matrix[j][i])
		        return false;
		        
		        return true;
		}

	public static int[][] multiply2DMatrix(int[][] firstMatrix,
			int[][] secondMatrix) {
		int[][] result = new int[firstMatrix.length][secondMatrix[0].length];
		if (firstMatrix[0].length == secondMatrix.length) {
			for (int i = 0; i < firstMatrix.length; i++) {
				for (int j = 0; j < secondMatrix[0].length; j++) {
					for (int k = 0; k < firstMatrix[0].length; k++) {
						result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
					}
				}
			}
		} else {
			throw new RuntimeErrorException(null, "Column number of first matrix" + "("
					+ firstMatrix[0].length + ")  is not equal to row number"
					+ "(" + secondMatrix.length + ") of second matrix");
		}
		return result;
	}

	// Special thanks to Dr. Nicholas Duchon for algorithm.
	public static double determinant2DMatrix(double[][] matrix)
			throws Exception {
		int n = matrix.length - 1;
		int m = matrix[0].length;
		if (n + 1 == m) {
			if (n < 0)
				return 0;
			double Matrix[][][] = new double[n + 1][][];

			Matrix[n] = matrix; //

			for (int i = 0; i < n; i++)
				Matrix[i] = new double[i + 1][i + 1];
			return Helper(Matrix, n);
		} else {
			Error e = new Error("Matematik");
			throw new RuntimeErrorException(e,"Given matrix is not square!");
		}

	}

	private static double Helper(double[][][] M, int m) {
		if (m == 0)
			return M[0][0][0];
		int e = 1;

		for (int i = 0; i < m; i++)
			for (int j = 0; j < m; j++)
				M[m - 1][i][j] = M[m][i][j];
		double sum = M[m][m][m] * Helper(M, m - 1);

		for (int i = m - 1; i >= 0; i--) {
			for (int j = 0; j < m; j++)
				M[m - 1][i][j] = M[m][i + 1][j];
			e = -e;
			sum += e * M[m][i][m] * Helper(M, m - 1);
		}
		return sum;
	}

    public static ArrayList<Long> PrimeFactors(int number) {
        long i;
        ArrayList<Long> listOfPrimeFactors = new ArrayList<Long>();
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                listOfPrimeFactors.add(i);
              i--;
            }
        }

        return listOfPrimeFactors;
    }
    package math;

import java.math.BigInteger;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class EasyMath {
	private final static double GoldenRatio = 1.61803399;

	public static double power(int base, int power) {
		return Math.pow(base, power);
	}

	public static double squareRoot(int n) {
		return Math.sqrt(n);
	}

	public static double absoluteValue(int n) {
		return Math.abs(n);
	}

	public static double absoluteValue(long n) {
		return Math.abs(n);
	}

	public static double absoluteValue(double n) {
		return Math.abs(n);
	}

	public static double absoluteValue(float n) {
		return Math.abs(n);
	}

	public static boolean isGoldenRatio(int division, int divider) {
		double res = (double) division / divider;
		if (res == GoldenRatio || res == GoldenRatio - 0.001
				|| res == GoldenRatio + 0.001)
			return true;
		return false;
	}
	public static double Logarithm(int base, int n){
		return Math.log(n) / Math.log(base);
	}
	public static long Permutation(int n, int r) {
		long sum = 1;
		for (int i = 0; i < r; i++) {
			sum *= n;
			n--;
		}
		return sum;
	}
	public static double Combination(int n, int r) {
		long sum = Permutation(n, r);
		long divider= Integer.parseInt(getFactorial(r).toString());
		return sum/divider;
	}
	public static BigInteger getFactorial(int f) {
		if(f>Integer.MAX_VALUE){
			throw new RuntimeErrorException(null, "Input is bigger than Max Value of Integer");
		}
	    BigInteger factorial = BigInteger.valueOf(1);
	    for (int i = 1; i <= f; i++)
	        factorial = factorial.multiply(BigInteger.valueOf(i));
	    return factorial;
	}

	public static boolean isPrime(int p) {
		if (p == 2)
			return true;
		if (p % 2 == 0)
			return false;
		for (int i = 3; i * i <= p; i = i + 2)
			if (p % i == 0)
				return false;
		return true;
	}

	public static int digitsOfNFactorial(int n) {

		return (n == 0 || n == 1) ? 1 : (int) Math.floor(((n + 0.5)
				* Math.log(n) - n + 0.5 * Math.log(2 * Math.PI))
				/ Math.log(10)) + 1;

	}

	public static int getNumbersOfDigit(int n) {
		return (n == 0 || n == 1) ? 1 : (int) (Math.floor(Math.log10(n))) + 1;
	}


	public static int[][] transposeMatrix(int[][] n) {
		int[][] transposed = new int[n[0].length][n.length];
		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n[0].length; j++) {
				transposed[j][i] = n[i][j];
			}
		}
		return transposed;
	}
	public static int [][] createRandomSquareMatrix(int n){
		int [][] matrix = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (((GoldenRatio+Math.PI+Math.E) * Math.random()) + 5);
			}

		}
		return matrix;
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

	public static void AllPermutationOfString(String str) {
		AllPermutationOfString("", str);
	}

	private static void AllPermutationOfString(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				AllPermutationOfString(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
		}
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

	public static void print2DMatrix(int[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}
	public static void print2DMatrix(boolean[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}

	public static void print2DMatrix(String[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}

	public static void print2DMatrix(char[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}

	public static void print2DMatrix(float[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}

	public static void print2DMatrix(double[][] n) {

		for (int i = 0; i < n.length; i++) {
			System.out.print("{");
			for (int j = 0; j < n[0].length; j++) {
				System.out.print(n[i][j]);
				if (j != n[0].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
		}

	}
	public static boolean isSkewSymmetricMatrix(int[][] matrix) {
		   for (int i = 0; i < matrix.length; ++i)
		        for (int j = i + 1; j < matrix.length; ++j)
		             if (matrix[i][j] != -matrix[j][i])
		        return false;
		        
		        return true;
		}

	public static int[][] multiply2DMatrix(int[][] firstMatrix,
			int[][] secondMatrix) {
		int[][] result = new int[firstMatrix.length][secondMatrix[0].length];
		if (firstMatrix[0].length == secondMatrix.length) {
			for (int i = 0; i < firstMatrix.length; i++) {
				for (int j = 0; j < secondMatrix[0].length; j++) {
					for (int k = 0; k < firstMatrix[0].length; k++) {
						result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
					}
				}
			}
		} else {
			throw new RuntimeErrorException(null, "Column number of first matrix" + "("
					+ firstMatrix[0].length + ")  is not equal to row number"
					+ "(" + secondMatrix.length + ") of second matrix");
		}
		return result;
	}

	// Special thanks to Dr. Nicholas Duchon for algorithm.
	public static double determinant2DMatrix(double[][] matrix)
			throws Exception {
		int n = matrix.length - 1;
		int m = matrix[0].length;
		if (n + 1 == m) {
			if (n < 0)
				return 0;
			double Matrix[][][] = new double[n + 1][][];

			Matrix[n] = matrix; //

			for (int i = 0; i < n; i++)
				Matrix[i] = new double[i + 1][i + 1];
			return Helper(Matrix, n);
		} else {
			Error e = new Error("Matematik");
			throw new RuntimeErrorException(e,"Given matrix is not square!");
		}

	}

	private static double Helper(double[][][] M, int m) {
		if (m == 0)
			return M[0][0][0];
		int e = 1;

		for (int i = 0; i < m; i++)
			for (int j = 0; j < m; j++)
				M[m - 1][i][j] = M[m][i][j];
		double sum = M[m][m][m] * Helper(M, m - 1);

		for (int i = m - 1; i >= 0; i--) {
			for (int j = 0; j < m; j++)
				M[m - 1][i][j] = M[m][i + 1][j];
			e = -e;
			sum += e * M[m][i][m] * Helper(M, m - 1);
		}
		return sum;
	}

    public static ArrayList<Long> PrimeFactors(int number) {
        long i;
        ArrayList<Long> listOfPrimeFactors = new ArrayList<Long>();
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                listOfPrimeFactors.add(i);
              i--;
            }
        }

        return listOfPrimeFactors;
    }
 
private static int o,c;
static int SubsetSum(int[] a, int s) {

    if(s==0)
        c++;

    for(int i=o;i<a.length;)
        SubsetSum(a,s-a[(o=++i)-1]);

    return c;
}

}


}

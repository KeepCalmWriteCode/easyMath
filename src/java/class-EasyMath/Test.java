public class Test extends EasyMath {
	public static void main(String...args){
	double[][] x = {{1,2,3},{3,2,1},{2,1,3}};
	int[][] A = {{1,0,3},{3,9,1},{9,1,3}};
	int[][] B = {{1,2,1},{9,2,1},{2,2,3}};
	 double N = 0;
	try {
		N = EasyMath.determinant2DMatrix(x);
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	print(absoluteValue(19));
	System.out.println(N);
	double a = EasyMath.Combination(5, 2);
	System.out.println(a);
	 double b = EasyMath.Permutation(5, 2);//P(5.2) =20
     System.out.println(b);
     x = EasyMath.transposeMatrix(x);
     EasyMath.print2DMatrix(x);
     EasyMath.print2DMatrix(EasyMath.multiply2DMatrix(A, B));
     System.out.println(EasyMath.digitsOfNFactorial(100));
     System.out.println(EasyMath.findPower(50, 100));
     System.out.println(EasyMath.absoluteValue(-1));
     EasyMath.print(9);
	}

}

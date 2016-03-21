public static int digitsOfNFactorial(int n){
		
	 return (n==0 || n==1)? 1: (int) Math.floor( ((n+0.5)*Math.log(n) - n + 0.5*Math.log(2*Math.PI))/Math.log(10) ) + 1;
			
	}

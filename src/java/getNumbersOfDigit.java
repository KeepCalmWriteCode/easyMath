	public static int getNumbersOfDigit(int n){
		return (n==0 || n==1)? 1: (int) (Math.floor( Math.log10(n)))+ 1;
	}

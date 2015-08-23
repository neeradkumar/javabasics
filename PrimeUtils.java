class PrimeUtils {
	void printPrimeNumbersUpto(int n){
		int i;
		for(i=2;i<=n;i++){
			if(isPrimeOrNot(i)) System.out.println(i);
		}
	}
	boolean isPrimeOrNot(int a){
		if(a==1) return false;
		if(a>2){
			int i;
			for(i=2; i<=a/2;i++){
				if(a%i == 0) return false;
			}
		}
		return true;
	}
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
    }
}
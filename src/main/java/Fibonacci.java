package src.main.java;

class Fibonacci {
	public int i,j=0,k=0;
	public String hasil = "";
	
	public Fibonacci() {}
	
	public String fibonacciCounter(int input){
		for (i=1;i<=input;i++) {
			if (i%2==0) {
					if (k==0) k=i;
					else k=k+j;
					hasil = hasil + String.valueOf(k) + " ";
			} else {
					if (j==0) j=i;
					else j=k+j;
					hasil = hasil + String.valueOf(j) + " ";
			}
		}

		return hasil;
	}
	
}

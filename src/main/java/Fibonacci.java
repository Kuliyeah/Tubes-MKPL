package src.main.java;

public class Fibonacci {
	public int i,j=0,k=0;
	
	public Fibonacci() {}
	
	public void fibonacciCounter(int input){
		for (i=1;i<=input;i++) {
			if (i%2==0) {
					if (k==0) k=i;
					else k=k+j;
					System.out.print(k+" ");
			} else {
					if (j==0) j=i;
					else j=k+j;
					System.out.print(j+" ");
			}
		}
	}
	
}

package src.main.java;

public class Counting {

	public int i,j;
	public int arr[][] = new int[4][];
	arr[0] = new int[3];
	arr[1] = new int[4];
	arr[2] = new int[5];
	arr[3] = new int[6];
	
	public Counter() {}
		
	public void tigaBilanganKelipatanMulaiDariTiga(){
		for (i=1;i<=3;i++) {
			arr[0][i-1] = i*3;
		}
	}

	public void empatBilanganGanjilDariSatu(){
		for (i=1;i<=4;i++) {
			arr[1][i-1] = i*2-1;
		}
	}
		
	public void limaBilanganFaktorialDariSatu(){
		int f=1;
		for (i=1;i<=5;i++) {
				f*=i;
				arr[2][i-1] = f;
		}
	}

	public void enamBilanganAlsliMulaiDariSatu(){
		for (i=1;i<=6;i++) {
				arr[3][i-1] = i;
		}
	}

	public void printData(){
		for (int[] arr1:arr) {
			for (int x:arr1) {
					System.out.print(x+" ");
			}
			System.out.println("");
		}
	}
}

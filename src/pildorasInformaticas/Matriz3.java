package pildorasInformaticas;

public class Matriz3 {

	public static void main(String[] args) {
		
		int [][]matriz= {{1,2,3},{4,5,6},{7,8,9}};
		for(int c1=0;c1<3;c1++) {
			for(int c2=0;c2<3;c2++) {
				System.out.print(" "+matriz[c1][c2]);
			}
			System.out.println(" ");
		}

	}

}

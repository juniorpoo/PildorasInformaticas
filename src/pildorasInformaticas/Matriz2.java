package pildorasInformaticas;

public class Matriz2 {

	public static void main(String[] args) {

		int [][]matriz =new int [3][3];
		matriz[0][0]=10;
		matriz[0][1]=10;
		matriz[0][2]=10;
		matriz[1][0]=10;
		matriz[1][1]=10;
		matriz[1][2]=10;
		matriz[2][0]=10;
		matriz[2][1]=10;
		matriz[2][2]=10;
		
		int fil=3;
		int col=3;
		int c1,c2;
		for(c1=0;c1<fil;c1++) {
			for(c2=0;c2<col;c2++) {
				System.out.print(" "+matriz[c1][c2]);
			}
			System.out.println(" ");
		}
		
	}

}

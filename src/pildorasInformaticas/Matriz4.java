package pildorasInformaticas;

public class Matriz4 {

	public static void main(String[] args) {
		
		int fil=4;
		int col=5;
		char [][]alfabeto=new char[fil][col];
		char letra ='A';
		
		//cargar la matriz 
		
		for(int c1=0;c1<fil;c1++) {
			for(int c2=0;c2<col;c2++) {
				alfabeto[c1][c2]=letra;
				letra++;
			}
		}
		//MOSTRAR ELEMENTOS DE LA MATRIZ
		for(int c1=0;c1<fil;c1++) {
			for(int c2=0;c2<col;c2++) {
				System.out.print(" "+alfabeto[c1][c2]);
			}
			System.out.println(" ");
		}

	}

}

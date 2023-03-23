package pildorasInformaticas;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
	
		//crear una matriz de dos dimensiones de numeros enteros e imprimar en pantalla la suma de sus elementos
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escriba 9 numeros enteros, por favor ");
		int fil=3,col=3;
	
		int [][]arreglo=new int [fil][col];
		
		int valor=0;
		for(int c1=0;c1<fil;c1++) {
			for(int c2=0;c2<col;c2++) {
				arreglo[c1][c2]=entrada.nextInt();
				valor+=arreglo[c1][c2];

			}
		
		}
		System.out.println("La suma total es "+valor);

	}

}

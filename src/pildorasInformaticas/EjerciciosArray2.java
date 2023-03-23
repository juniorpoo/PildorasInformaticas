package pildorasInformaticas;
import java.util.Scanner;
public class EjerciciosArray2 {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		int []numero=new int[8];
		int c;
		
		System.out.println("Ingrese 8 numeros");
		
		for(c=0;c<8;c++) {
			numero[c]=entrada.nextInt();
		}
		
		System.out.println(" Array original "); 
		
		for(c=0;c<8;c++) {
			System.out.printf(" | "+c);
		}
		
		System.out.println(" | ");
		
		for(c=0;c<25;c++) {
			System.out.printf(" - ");
		}
		
		System.out.println(" - ");
		
		for(c=0;c<8;c++) {
			System.out.printf(" | "+numero[c]); 
		}
		
		System.out.println(" | ");
		
		//Rotar de posicion
		int aux=numero[7];
		for(c=7;c>0;c--) {
			numero[c]=numero[c-1];
		}
		
		numero[0]=aux;
		
		//array recorrido
		System.out.println(" Array recorrido");
		for(c=0;c<8;c++) {
			System.out.printf(" | "+ c);
		}
		
		System.out.println(" | ");
		
		for(c=0;c<25;c++) {
			System.out.print(" - ");
		}
		
		System.out.println(" - ");
		
		for(c=0;c<8;c++) {
			System.out.printf(" | "+numero[c]);
		}
		
		System.out.println(" | ");

	}

}

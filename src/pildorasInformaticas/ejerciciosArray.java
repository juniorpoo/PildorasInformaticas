package pildorasInformaticas;

import java.util.Scanner;

public class ejerciciosArray {

	public static void main(String[] args) {
	
		//Invertir el array
		Scanner entrada=new Scanner(System.in);
		int[]arreglo =new int[8];
		
		for(int i=0;i<8;i++) {
			arreglo[i]=entrada.nextInt();
			
		}
		
		System.out.println("Invertido");
		
		for(int i=7;i>=0;i--) {
			System.out.println(arreglo[i]);
		}

	}

}

package pildorasInformaticas;

public class Uso_Arrays {

	public static void main(String[] args) {
	
		/*int []array=new int [5];
		array[0]=15;
		array[1]=32;
		array[2]=13;
		array[3]=17;
		array[4]=19;*/
		
		int []array= {15,32,13,17,19,3,2,45,65,46,77,54,32,24,56,43,56,43234,54,4,34,34,35,5};
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Valor del indice "+i+" ="+array[i]);
		}
	}

}

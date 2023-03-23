package pildorasInformaticas;

public class Uso_Vehiculo {

	public static void main(String[] args) {
	
		Coche coche1= new Coche();
		
		coche1.setColor("Rojo");
		
		Furgoneta furgoneta1=new Furgoneta(7,580);
		
		furgoneta1.setColor("Azul");
		
		furgoneta1.setConfiguraAsientos("si");
		
		furgoneta1.setConfiguraClimatizador("si");
		
		System.out.println(coche1.getDatos_generales()+" "+ coche1.getColor());
		
		System.out.println(furgoneta1.getDatos_generales()+" "+ furgoneta1.getDimeDatosFurgoneta());
		
	}

}

package poo;

public class Pruebas {

	public static void main(String[] args) {
		
	/*	Empleados trabajador1= new Empleados("Paco");
		
		Empleados trabajador2= new Empleados("Ana");
		
		Empleados trabajador3= new Empleados("Antonio");
		
		Empleados trabajador4= new Empleados("Maria");
		
		Empleados trabajador5= new Empleados("Yefri");
		
		trabajador1.setCambiaSeccion("Recursos Humanos");
		
		System.out.println(trabajador1.getDevuelveDatos());
		
		System.out.println(trabajador2.getDevuelveDatos());
		
		System.out.println(trabajador3.getDevuelveDatos());
		
		System.out.println(trabajador4.getDevuelveDatos());
		
		System.out.println(trabajador5.getDevuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());*/
		

	}

}

class Empleados{
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administracion";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public static String dameIdSiguiente() {
		
		return "EL IdSiguiente es: "+IdSiguiente;
	}
	
	public void setCambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	public String getDevuelveDatos() {
		return "El nombre es: "+nombre+" y la seccion es "+seccion+ " y el Id= "+Id;
	}
}

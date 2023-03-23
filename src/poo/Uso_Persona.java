package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
	
		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Yefri Feliz",50000, 2025, 07, 15);
		lasPersonas[1]=new Alumno("Yefri Feliz", "Informatica");
		
		for(Persona p: lasPersonas) {
			System.out.println(p.getNombre()+", "+p.getDescripcion());
		}
		
	    

	}

}

abstract class Persona{
	
	public Persona(String nom) {
		
		nombre=nom;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public abstract String getDescripcion();
	
	private String nombre;
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
	}
	
	public String getDescripcion() {
		
		return "Este empleado tiene un Id= "+Id+" con un sueldo="+ sueldo;
	}
	
	public double getDameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento =sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
	}
	
	public String getDescripcion() {
		return "Este alumno esta estudiando la carrera de "+carrera;
	}
	
	private String carrera;
}


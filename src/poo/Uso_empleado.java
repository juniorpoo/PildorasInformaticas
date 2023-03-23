package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefe_RRHH.setEstableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0]=new Empleado("Yefri ", 40000, 2023, 04,02);
		misEmpleados[1]=new Empleado("Maquendi", 80000, 2020, 04,07);
		misEmpleados[2]=new Empleado("Manuel ", 10000, 2021, 04,01);
		misEmpleados[3]=new Empleado("Antonio Fernandez", 47500, 2009, 11, 9);
		misEmpleados[4]=jefe_RRHH; //POLIMORFISMO EN ACCION. PRINCIPIO DE SUSTITUCION
		misEmpleados[5]=new Jefatura("Maria", 95000, 1999, 5, 26);
		
		Jefatura jefa_Finanzas=(Jefatura)misEmpleados[5];
		jefa_Finanzas.setEstableceIncentivo(55000);
		
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre:" +e.dameNombre()
					+" Sueldo: "+e.getDameSueldo()
					+ " Fecha de alta: "+e.dameFechaContrato());
			
		}
		
		
	}

}

class Empleado implements Comparable{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 200, 01, 01);
	}
	
	public String dameNombre() {
		return nombre +" Id: "+Id;
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
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.Id<otroEmpleado.Id) {
			
			return -1;
		}
		
		if(this.Id>otroEmpleado.Id) {
			
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
}

class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}
	
	public void setEstableceIncentivo(double b) {
		
		incentivo=b;
	}
	
	public double getDameSueldo() {
		double sueldoJefe= super.getDameSueldo();
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
}


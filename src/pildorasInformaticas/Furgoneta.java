package pildorasInformaticas;

public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		
		super(); //LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
	}
	
	public String getDimeDatosFurgoneta() {
		
		return "La capacidad de carga es: "+ capacidad_carga+ " y las plazas son: "+plazas_extra;
	}

}

package pildorasInformaticas;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero,climatizador;
	
	
	
	public Coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;
		
	}

       public String getDatos_generales() {
		return "La plataforma del vehiculo tiene "+ruedas+" ruedas "+
       ". Mide "+largo/1000+" metros con un ancho de "+ancho+" cm "+" y un peso de "+peso_plataforma+" kg";
				
	}

	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return "El color del coche es "+color;
	}
	
	public void setConfiguraAsientos(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String getAsientos() {
		if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
		}
		else {
			return "El coche tiene asientos de serie";
		}
		
	}
	
	public void setConfiguraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}
		else {
			this.climatizador=false;
		}
	}
	
	public String getClimatizador() {
		if(climatizador==true) {
			return "El coche incorpora climatizador";
		}
		else{
			return "El coche lleva aire acondicionado";
		}
	}
	
	public String dime_peso_coche() {//SETTER AND GETTER
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		
		return "El peso del coche es "+peso_total;
	}
	
	public int getPrecio() {
		int precio_final=10000; 
		
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		
		if(climatizador==true) {
			precio_final+=1500;
		}
		
		return precio_final;
	}
	

}

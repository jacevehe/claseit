package opp;

public class Auto {

	String marca; 
	String modelo; 
	float velocidad; 
	float velocidadMax;
	boolean encendido; 
	
	 Auto(String marca, String modelo, float velocidadMax) {
		this.marca = marca; 
		this.modelo = modelo;
		this.velocidadMax=velocidadMax;
	}
	
	void encender() {
		if(encendido==false) {
		encendido = true;
		System.out.println("Encendiendo auto..");
		}else {
			System.out.println("Ya el auto esta encendido");
		}
	}
	
	void apagar() {
		if(encendido) {
		encendido = false;
		velocidad = 0;
		System.out.println("Apagando auto..");
		}else {
			System.out.println("Ya el auto esta apagado");
		}
	}
	
	void acelerar() {
		if(encendido==true) {
			if(velocidad < velocidadMax) {
				velocidad++;
			}else {
				System.out.println("No es posible acelerar más. Velocidad Maxima");
			}
				
			}else {
				System.out.println("Debe encender primero el auto");
		}
	}
	
	void frenar() {
		if(encendido) {
			if(velocidad >0) {
				velocidad--;
			}else {
				System.out.println("Velocidad es 0");
			}
		}else {
			System.out.println("Debe encender primero el auto");
		}
	}
	
	float obtenerVelocidad() {
		return velocidad;
	}
	
	void detalleAuto() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Encendido: "+this.encendido);
		System.out.println("Velocidad: "+this.velocidad);
	}
}


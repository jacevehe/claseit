package ar.interfaces.practice.protalento.bootcamp;

public class Avion extends Artefacto implements Aterrizable{
	
	
	double velmax; 
	String fabricante; 
	int modelo;
	int cant_asientos; 
	int cant_tripulacion; 
	int ocupacionMaxima;
	String aerolinea;
	
	
	public Avion(String nombre, String estado, double velmax, String fabricante, int modelo, int cant_asientos, int cant_tripulacion) {
		super(nombre, estado);
		this.velmax = velmax;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cant_asientos = cant_asientos;
		this.cant_tripulacion = cant_tripulacion;
	}
	
	public double getVelmax() {
		return velmax;
	}
	public void setVelmax(double velmax) {
		this.velmax = velmax;
	}
	public String getFaricante() {
		return fabricante;
	}
	public void setFaricante(String faricante) {
		this.fabricante = faricante;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getCant_asientos() {
		return cant_asientos;
	}
	public void setCant_asientos(int cant_asientos) {
		this.cant_asientos = cant_asientos;
	}
	public int getCant_tripulacion() {
		return cant_tripulacion;
	}
	public void setCant_tripulacion(int cant_tripulacion) {
		this.cant_tripulacion = cant_tripulacion;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	@Override
	public String toString() {
		
		return "Mostrando datos del avión:"+"\n"+"Descripción: "+nombre
				+"\n"+"Modelo: "+modelo
				+"\n"+"Fabricante: "+fabricante
				+"\n"+"Cantidad de Asientos: "+cant_asientos
				+"\n"+"Cantidad de tripulantes Cabina: "+cant_tripulacion
				+"\n"+"Ocupacion: "+ocupacionMaxima
				+"\n"+"Estado: "+estado;	
	}
	
	public void aterrizar() {
		if(permiso==true&&estado=="Despegado")
			System.out.println("Permiso para aterrizaje: Concedido");
		else
			System.out.println("Permiso para aterrizaje: Denegado");
	}
	
	public void despegar() {
		int mensaje=validarTripulacion();
		
		if(estado=="Despegado")
			System.out.println("El avión ya ha despegado");
		if(estado=="Aterrizado"&&mensaje==1) {
			System.out.println("Permiso para despegue: Concedido");
			estado="Despegado";
		}
		if(estado=="Aterrizado"&&mensaje==0) 
			System.out.println("Por favor validar tripulación: ");
		
	}
	
	public int validarTripulacion() {
		int res;
		if(ocupacionMaxima<=this.cant_asientos) {
			res=1;
		}else {
			res=0;
		}
		return res;
	}

}

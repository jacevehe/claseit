package ar.interfaces.practice.protalento.bootcamp;

public class Helicoptero extends Artefacto implements Aterrizable{
	
	 String codigo; 
	 String marca; 
	 int cant_pasajeros; 
	 int cant_pilotos;
	 String propietario;
	 
	public Helicoptero(String nombre, String estado, String codigo, String marca, int cant_pasajeros, int cant_pilotos, String propietario) {
		super(nombre,estado);
		this.codigo = codigo;
		this.marca = marca;
		this.cant_pasajeros = cant_pasajeros;
		this.cant_pilotos = cant_pilotos;
		this.propietario = propietario;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCant_pasajeros() {
		return cant_pasajeros;
	}
	public void setCant_pasajeros(int cant_pasajeros) {
		this.cant_pasajeros = cant_pasajeros;
	}
	public int getCant_pilotos() {
		return cant_pilotos;
	}
	public void setCant_pilotos(int cant_pilotos) {
		this.cant_pilotos = cant_pilotos;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	@Override
	public String toString() {		
		return "Mostrando datos del helicoptero:"+"\n"+"Descripción: "+nombre+" Codigo: "+codigo
				+"\n"+"Marca: "+marca
				+"\n"+"Cantidad de Pasajeros: "+cant_pasajeros
				+"\n"+"Cantidad de tripulantes Cabina: "+cant_pilotos
				+"\n"+"Propietario: "+propietario
				+"\n"+"Estado: "+estado;	
	}
	 
	public void aterrizar() {
		
		if(estado=="Despegado"&&permiso==true)
			System.out.println("Permiso de aterrizaje: Concedido");
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
		if((cant_pilotos+cant_pasajeros)<=8) {
			res=1;
		}else {
			res=0;
		}
		return res;
	}

}

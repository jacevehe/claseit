package ar.interfaces.practice.protalento.bootcamp;

import java.util.Date;

public class Ovni extends Artefacto implements Aterrizable{
	
	
	String descripcion;
	Date fecha_avistamiento;
	int cantidad_vista;
	
	
	public Ovni(String nombre, String estado, String descripcion, Date fecha_avistamiento, int cantidad_vista) {
		super(nombre, estado);
		this.descripcion = descripcion;
		this.fecha_avistamiento = fecha_avistamiento;
		this.cantidad_vista = cantidad_vista;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Date getFecha_avistamiento() {
		return fecha_avistamiento;
	}


	public void setFecha_avistamiento(Date fecha_avistamiento) {
		this.fecha_avistamiento = fecha_avistamiento;
	}


	public int getCantidad_vista() {
		return cantidad_vista;
	}


	public void setCantidad_vista(int cantidad_vista) {
		this.cantidad_vista = cantidad_vista;
	}


	@Override
	public String toString() {
		
		return "Mostrando datos del OVNI:"+"\n"+"Descripción: "+"\n"+descripcion
				+"\n"+"Fecha: "+fecha_avistamiento
				+"\n"+"Cantidad de OVNIS: "+cantidad_vista
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
		if(mensaje==0)
			System.out.println("No esta permitido despegue");
	}
	
	public int validarTripulacion() {
		int res=0;
		System.out.println("No es posible establecer su tripulación");
		return res;
	}

}

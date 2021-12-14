package opp;

public class Articulo {

	public String titulo; 
	public float precio; 
	private String urlimagen; 
	private boolean favorito; 
	private boolean enviogratis;
	private boolean tieneCuotas; 
	private boolean descuento;
	private int cantidad;
	
	
	Articulo(String titulo, float precio, String urlimagen, boolean favorito, int cantidad, boolean tieneCuotas, boolean descuento){
		if(precio>20000){
			this.enviogratis = true;
		}
		this.favorito=favorito;
		this.titulo=titulo;
		this.urlimagen=urlimagen;
		this.cantidad=cantidad;
		this.precio=precio;
	}
	
	public void agragarfavorito() {
		this.favorito=!this.favorito;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getUrlimagen() {
		return urlimagen;
	}

	public void setUrlimagen(String urlimagen) {
		this.urlimagen = urlimagen;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

	public boolean isEnviogratis() {
		return enviogratis;
	}

	public void setEnviogratis(boolean enviogratis) {
		this.enviogratis = enviogratis;
	}

	public boolean isTieneCuotas() {
		return tieneCuotas;
	}

	public void setTieneCuotas(boolean tieneCuotas) {
		this.tieneCuotas = tieneCuotas;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}

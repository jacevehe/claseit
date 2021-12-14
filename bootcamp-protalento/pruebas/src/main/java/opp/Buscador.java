package opp;

public class Buscador {

	
	private String clavebusqueda; 
	private Articulo[] resultados; 
	
	public Buscador(){
		System.out.println("Creando buscador...");
	}
	
	
	public void buscar() {
		System.out.println("Buscando la palabra clave:"+this.clavebusqueda);
		DataBase db=new DataBase();
		resultados=db.consultar(clavebusqueda);
	}
	
	void definirclaveBusqueda(String clave) {
		this.clavebusqueda = clave;
	}
	
	
	
	public String getClavebusqueda() {
		return clavebusqueda;
	}


	public void setClavebusqueda(String clavebusqueda) {
		this.clavebusqueda = clavebusqueda;
	}


	public Articulo[] getResultados() {
		return resultados;
	}


	public void setResultados(Articulo[] resultados) {
		this.resultados = resultados;
	}


	public void detalleArticulo() {
		if(this.resultados.length>0) {
			for(Articulo resultado: this.resultados) {
				System.out.println("Detalle Articulo: ");
				System.out.println("Titulo: "+resultado.titulo);
				System.out.println("Precio: "+resultado.precio);
			}
			
		}else {
			System.out.println("Sin resultados...");
		}
	}
}
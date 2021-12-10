package ar.com.educationit.domain;

public class Categoria {

	private Long id; 
	private String descripcion;
	private String codigo;
	
	//constructor 
	public Categoria(String descripcion, String codigo) {
		this.descripcion = descripcion;
		this.codigo = codigo;
	}

	public Categoria(Long id, String descripcion, String codigo) {
		
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}

	//get y set
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + "]";
	} 
		
	
	//metodos
	
	
	
}

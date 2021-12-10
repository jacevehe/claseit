package ar.com.educationit.domain;

public class Marca {
	
	private Long id; 
	private String marca; 
	private String codigo; 
	private Long habilitada;
	
	public Marca(String marca, String codigo, Long habilitada) {
		this.marca = marca;
		this.codigo = codigo;
		this.habilitada = habilitada;
	}

	public Marca(Long id, String marca, String codigo, Long habilitada) {
		this.id = id;
		this.marca = marca;
		this.codigo = codigo;
		this.habilitada = habilitada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getHabilitada() {
		return habilitada;
	}

	public void setHabilitada(Long habilitada) {
		this.habilitada = habilitada;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Marca [id=" + id + ", marca=" + marca + ", codigo=" + codigo + ", habilitada=" + habilitada + "]";
	} 
	
	

}

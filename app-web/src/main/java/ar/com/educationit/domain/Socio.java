package ar.com.educationit.domain;

public class Socio {
	
	private Long id; 
	private String nombre; 
	private String apellido; 
	private String email; 
	private String direccion; 
	private Long paisesId;
	
	public Socio(String nombre, String apellido, String email, String direccion, Long paisesId) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}
	
	public Socio(Long id, String nombre, String apellido, String email, String direccion, Long paisesId) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getPaisesId() {
		return paisesId;
	}

	public void setPaisesId(Long paisesId) {
		this.paisesId = paisesId;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", direccion="
				+ direccion + ", paisesId=" + paisesId + "]";
	} 
	
	
	

}

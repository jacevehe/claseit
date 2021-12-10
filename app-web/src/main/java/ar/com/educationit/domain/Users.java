package ar.com.educationit.domain;

public class Users {
	
	private Long id; 
	private String username; 
	private String password; 
	private Socio socio;
	
	public Users(Long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Long getId() {
		return id;
	}
	
	

}

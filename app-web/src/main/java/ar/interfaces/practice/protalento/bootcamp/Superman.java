package ar.interfaces.practice.protalento.bootcamp;

public class Superman extends Artefacto{
	
	
	protected String color_traje;
	protected String nickname;
	
	public Superman(String nombre, String estado, String color_traje, String nickname) {
		super(nombre, estado);
		this.color_traje = color_traje;
		this.nickname = nickname;
	}

	public String getColor_traje() {
		return color_traje;
	}

	public void setColor_traje(String color_traje) {
		this.color_traje = color_traje;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "Superman [color_traje=" + color_traje + ", nickname=" + nickname + "]";
	} 

	public void aterrizar() {
		System.out.println("Permiso denegado para Superman");
	}

}

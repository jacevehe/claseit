package clase9;

public class Contratado extends Empleado {
	
	private Integer periodo;

	public Contratado(String nombre, String apellido, String colorPelo, Integer id, Integer periodo) {
		super(nombre, apellido, colorPelo, id);
		// TODO Auto-generated constructor stub
		this.periodo=periodo;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	@Override
	public void detalle() {
		super.detalle();
		System.out.println("Perido: "+this.periodo);
	}
	
	
}

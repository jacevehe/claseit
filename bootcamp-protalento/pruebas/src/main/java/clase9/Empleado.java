package clase9;

public class Empleado extends Persona{

	private Integer id;

	public Empleado(String nombre,String apellido, String colorPelo, Integer id) {
		super(nombre, apellido, colorPelo);
		// TODO Auto-generated constructor stub
		
		this.id=id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	} 
	
	@Override
	public void detalle() {
		super.detalle();
		System.out.println("Periodo: "+this.getId());
	}
	
	
	
}

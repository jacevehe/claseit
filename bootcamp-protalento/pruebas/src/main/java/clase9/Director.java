package clase9;

public class Director extends Persona {
	
	private Integer empCargo;

	public Director(String nombre, String apellido, String colorPelo, Integer empCargo) {
		super(nombre, apellido, colorPelo);
		// TODO Auto-generated constructor stub
		this.empCargo=empCargo;
	}

	public Integer getEmpCargo() {
		return empCargo;
	}

	public void setEmpCargo(Integer empCargo) {
		this.empCargo = empCargo;
	}

	@Override
	public void detalle() {
		super.detalle();
		System.out.println("Empleados a cargo: "+this.getEmpCargo());
	}
	

}

package clase9;

public class CineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona("persona1", "apellido1", "negro");
		Empleado empleado = new Empleado("empleado1", "apellidoempleado1", "rojo", 1);
		Efectivo efectivo = new Efectivo("nombre efectivo1", "apellidoefectivo1", "rubio", 1); 
		Contratado contratado = new Contratado("nombre contratado1", "apellido contratado", "negro",1,6);
		Director director = new Director("nombre director", "apellido director", "azul",3);


		Persona[] personas = new Persona[5];
		personas[0]=persona; 
		personas[1]=empleado; 
		personas[2]=efectivo; 
		personas[3]=contratado;
		personas[4]=director; 
		
		
		for(Persona aux: personas) {
			aux.detalle();
			if(aux instanceof Director) {
				Director d=(Director)aux;
				System.out.println("Director: "+d.getEmpCargo()+" va en silla VIP");
			}
		}
	}

}

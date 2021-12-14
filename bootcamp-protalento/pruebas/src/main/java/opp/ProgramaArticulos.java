package opp;

public class ProgramaArticulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buscador buscador = new Buscador();
		
		buscador.definirclaveBusqueda("Iron Man");
		buscador.buscar();
		buscador.detalleArticulo();

	}

}

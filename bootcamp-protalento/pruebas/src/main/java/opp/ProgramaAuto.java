package opp;

public class ProgramaAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto miclio= new Auto("clio", "mio", 180);
		miclio.detalleAuto();
		
		miclio.encender();
		miclio.detalleAuto();
		
		miclio.acelerar();
		miclio.detalleAuto();
		
		miclio.apagar();
		miclio.detalleAuto();
		
		
	}

}

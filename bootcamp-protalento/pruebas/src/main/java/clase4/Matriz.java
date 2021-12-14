package clase4;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int cantFilas= 2; 
			int cantCols=2;
			
			String[][] nombreyedad = new String[cantFilas][cantCols];
			
			//Cargamos 
			
			for(int fila=0; fila<cantFilas; fila++) {
				for(int col=0; col<cantCols; col++) {
					nombreyedad[fila][col]=fila+","+col;
				}
			}
			
			for(int fila=0; fila<cantFilas; fila++) {
				for(int col=0; col<cantCols; col++) {
					System.out.println(nombreyedad[fila][col]);				}
			}
	}

}

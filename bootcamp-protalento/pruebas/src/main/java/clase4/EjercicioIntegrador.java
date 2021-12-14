package clase4;

import java.util.Scanner;

public class EjercicioIntegrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float [] datos = new float[10]; 
		float maximo;
		float minimo; 
		byte pMaximo; 
		byte pMinimo;
		float sumaTotal=0;
		Scanner teclado = new Scanner(System.in); 
		
		for(int i=0; i<datos.length; i++) {
			System.out.println("Ingresa valor No."+(i+1));
			datos[i]=teclado.nextInt();
		}
		
		teclado.close();
	}

}

package clase4;

import java.util.Scanner;

public class EjercicioDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Ingrese cantidad de filas");
		int filas = teclado.nextInt(); 
		
		System.out.println("Ingrese cantidad de filas");
		int cols = teclado.nextInt();
		
		if(filas==cols) {
			Integer[][] matriz = new Integer[filas][cols]; 
		
		
		System.out.println("Ingrese valores de la matriz");
		
		for(int f=0; f<filas; f++) {
			for(int c=0; c<cols; c++) {
				System.out.println("Ingresa valor en la posicion"+f+","+c);
				int aux = teclado.nextInt();
				matriz[f][c]=aux;
			}
		}
		
		teclado.close();
		
	}
		
	}
	
	

}

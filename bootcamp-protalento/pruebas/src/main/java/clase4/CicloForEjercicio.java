package clase4;

import java.util.Scanner;

public class CicloForEjercicio {

	public static void main (String[] args) {
		int cant; 
		int[] vector; 
		int cantPares=0; 
		int cantImpares=0; 
		int sumaPares=0;
		int sumaImpares=0;
		double promedio=0; 
	
		Scanner teclado = new Scanner(System.in);
		do {
		System.out.println("Ingrese cantidad de registros:");
		cant = teclado.nextInt();
		}while(cant<=0);
		
		vector = new int[cant];
		for(int i=0; i<cant; i++) {
			System.out.println("Ingrese un dato No.: "+(i+1));
			int dato = teclado.nextInt();
			vector[i]=dato;
		}
		
		teclado.close();
		
		//procesamiento
		for(int dato:vector) {
			if(dato%2==0) {
				cantPares++;
				sumaPares+=dato;
			}else {
				cantImpares++;
				sumaImpares+=dato;
			}
		}
		
		promedio = (sumaPares+sumaImpares)/(cantPares+cantImpares);
		System.out.println("La cantidad de registros es: "+cant);
		System.out.println("La cantidad de pares es: "+cantPares);
		System.out.println("La cantidad de impares es: "+cantImpares);
		System.out.println("La suma de pares es: "+sumaPares);
		System.out.println("La suma de impares es: "+sumaImpares);
		System.out.println("El promedio es: "+promedio);
		
	}
	
}

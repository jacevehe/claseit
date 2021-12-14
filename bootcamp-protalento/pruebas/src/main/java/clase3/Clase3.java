package clase3;

import java.util.Scanner;

public class Clase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su opcion:"
				+"1 - alta"
				+"2 - baja"
				+"3 - modif");
	
		
	int opcion = teclado.nextInt();
	/*
	if(opcion==1){
		System.out.println("Alta");
	}else if(opcion==2){
		System.out.println("Baja");
	}else if(opcion==3){
		System.out.println("Modif");
	}
	teclado.close();*/

	
	
	switch(opcion) {
	case 1: 
		System.out.println("Alta en case");
		System.out.println("Ingrese nombre");
		String nombre = teclado.next();
		System.out.println("Su nombre es: "+nombre);
		break;
	case 2: 
		System.out.println("Baja en case");
		break;
	case 3: 
		System.out.println("Modif en case");
		break;
	}
	teclado.close();

}

	}


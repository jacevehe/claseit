package clase2;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usuario="";
		String password="";
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese su usuario:");
		usuario=teclado.next();
		System.out.println("Ingrese su password:");
		password=teclado.next();
		
		if(usuario.equals("admin") && password.equals("sap123*")) {
			System.out.println("Acceso concedido");
		}else {
			System.err.println("Acceso denegado");
		}
		
		teclado.close();
	}
}

package clase4;

import java.util.Arrays;

public class Cuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] archivo = new String[] {
				"1000;Juan Lopez;1500;CA",
				"2000;Martin Castro;-2500;CA",
				"3000;Andrea Lucas;-2500;CC",
				"4000;Sebastian Mercado;2500;CC",
				"5000;Laura Leon;2500;CC"};
		
		
		// Obtener las cuentas con saldo negativo 
		// Obtener las cuentas con saldo > 1000 con apyn
		
		Object[][] saldosNegativos = new Object[archivo.length][4]; 
		Object[][] saldosMayor1000 = new Object[archivo.length][4];
		
		//SEPARAR ; 
		for(int i=0; i<archivo.length; i++) {
			String registro = archivo[i];
			String[] cuenta = registro.split(";");
			Integer numcuenta = Integer.parseInt(cuenta[0]);
			String apyn=cuenta[1];
			Double saldo = Double.parseDouble(cuenta[2]);
			String tipo = cuenta[3];
			
			System.out.println("Registro:"+Arrays.toString(cuenta));
			System.out.println("Cuenta No."+numcuenta);
			System.out.println("Titular."+apyn);
			System.out.println("Saldo:."+saldo);
			System.out.println("Tipo:"+tipo);
			System.out.println("-----------------");
			
			if(saldo<0) {
				saldosNegativos[i][0]=saldo; 
				saldosNegativos[i][1]=apyn;
				saldosNegativos[i][2]=numcuenta; 
				saldosNegativos[i][3]=tipo;
			}
			
			if(saldo>1000) {
				saldosMayor1000[i][0]=saldo; 
				saldosMayor1000[i][1]=apyn;
				saldosMayor1000[i][2]=numcuenta; 
				saldosMayor1000[i][3]=tipo;
			}	
		}
		
		for(int f=0; f<saldosNegativos.length; f++) {
			for(int c=0; c<saldosNegativos[f].length; c++) {
				if(saldosNegativos[f][c]!=null) {
				System.out.println(saldosNegativos[f][c]);
				}
			}
			System.out.println("-------------------");
		}
		
		for(int f=0; f<saldosMayor1000.length; f++) {
			for(int c=0; c<saldosMayor1000[f].length; c++) {
				if(saldosMayor1000[f][c]!=null) {
				System.out.println(saldosMayor1000[f][c]);
				}
			}
			System.out.println("-------------------");
		}
	}	                          
}

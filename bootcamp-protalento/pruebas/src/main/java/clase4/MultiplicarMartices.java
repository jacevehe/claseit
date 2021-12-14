package clase4;


import java.util.Scanner;

public class MultiplicarMartices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[][] matriz1= new Object[2][2]; 
		Object[][] matriz2= new Object[3][2];
		
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Inserte numeros enteros en la matriz 1");
		System.out.println("----------------------------------");
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz1[i].length; j++) {
				System.out.println("Inserte elemento matriz 1, posicion:"+i+","+j);
				matriz1[i][j]=teclado.nextInt();
			}
		}
		
		
		
		System.out.println("Inserte numeros enteros en la matriz 2");
		System.out.println("----------------------------------");
		for(int k=0; k<matriz2.length; k++) {
			for(int l=0; l<matriz2[k].length; l++) {
				System.out.println("Inserte elemento matriz 2, posicion:"+k+","+l);
				matriz2[k][l]=teclado.nextInt();
			}
		}
		
		
		System.out.println("-----");
		for(int a =0; a<matriz1.length; a++){
			int x=1;
					for(int b=0; b<matriz1[a].length; b++){
						if(b!=matriz1[a].length-1) {
						System.out.println(matriz1[a][b]+" | "+matriz1[a][x]);
						System.out.println("-----");
						x++;
					}
				}
			}
		
		System.out.println("-----");
		for(int a =0; a<matriz2.length; a++){
			int x=1;
					for(int b=0; b<matriz2[a].length; b++){
						if(b!=matriz2[a].length-1) {
						System.out.println(matriz2[a][b]+" | "+matriz2[a][x]);
						System.out.println("-----");
						x++;
					}
				}
			}

		teclado.close();

	}

}


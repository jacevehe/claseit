package clase4;

public class Vector {

	public static void main(String[] args) {
		
		int [] edades = new int[3];
		edades[0]=5;
		edades[1]=10;
		edades[2]=3;
		int tamanio=edades.length;
		int edad=edades[tamanio-1];
		
		System.out.println(edad);

	}

}

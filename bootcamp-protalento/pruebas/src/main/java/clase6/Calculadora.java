package clase6;

public class Calculadora {

	public double sumar(int a, int b) {
		return a+b; 
	}
	
	public double restar(int a, int b) {
		return a-b;
	}
	
	public double multiplicar(int a, int b) {
		return a*b; 
	}
	
	public double dividir(int a, int b) {
		if(b!=0) {
			return a/b;
		}else {
			System.out.println("No se puede dividir por 0");
			return 0;
		}
			
	}
}

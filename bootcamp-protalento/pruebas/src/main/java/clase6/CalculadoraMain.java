package clase6;

public class CalculadoraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 34; 
		int b = 23;
		double resultado; 
		Calculadora calculadora = new Calculadora();
		
		resultado=calculadora.sumar(a,b);
		System.out.println("El resultado de la suma es:"+resultado);
	}

}

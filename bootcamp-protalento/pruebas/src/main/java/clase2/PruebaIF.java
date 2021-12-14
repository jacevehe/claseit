package clase2;

public class PruebaIF {

	public static void main(String[] args) {
		//determinar dado 3 numeros, cual es el mayor 
		double num1, num2, num3; 
		num1=4.5;
		num2=3.2;
		num3=3;
		//a>b y a>c
		//b>a y b>c
		//c>a y c>b
		
		if(((num1>num2) && (num1>num3))||((num1==num2) && (num1>num3))){
			System.out.println("El número mayor es: "+num1);
	    }
		if(((num2>num1) && (num2>num3))||((num1==num3) && (num2>num3))){
			System.out.println("El número mayor es: "+num2);
		}
		if(((num3>num1) && (num3>num2))||((num2==num3) && (num3>num1))){
			System.out.println("El número mayor es: "+num3);
		}
		if((num1==num2)&&(num3==num1)) {
			System.out.println("Los números son iguales: "+num3+", "+num2+", "+num1);
		}
		}
	
}

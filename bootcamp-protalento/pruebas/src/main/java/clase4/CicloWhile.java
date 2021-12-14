package clase4;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short[] edades = new short[] {10,5,25}; 
		int i = 0; 
		
		while(i<edades.length) {
			System.out.println("pos: "+i+",val:"+edades[i]);
			i++;
		}
		
		int j = edades.length-1;
		while(j>=0) {
			System.out.println("pos: "+j+",val:"+edades[j]);
			j--;
		}
		
		
		System.out.println("---------------------------------");
		

	}

}

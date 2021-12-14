package clase4;

public class DoWhile {

	public static void main(String[] args) {
		byte [] edades = new byte[] {25,78,15,20,12};
		int i=0;
		
		do {
			System.out.println("pos:"+i+" val: "+edades[i]);
			i++;
		}while(i<edades.length);
		
	}
}

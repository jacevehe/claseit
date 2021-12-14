package clase4;

public class CicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] alturas_ = new float[2];
		float[] alturas = new float[]{1,2};
		alturas_[0]=1;
		alturas_[1]=2;
		
		float aux=alturas[0];
		
		for(int i=0; i<alturas_.length;i++) {
			aux = alturas[i];
			System.out.println("pos:"+", val: "+aux);
		}
		
		System.out.println("---------foreach----------");
		
	}
		
}


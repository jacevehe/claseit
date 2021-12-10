package ar.interfaces.practice.protalento.bootcamp;

import java.util.Date;

public class MainArtefactos {

	public static void main(String[] args) {
		
		Avion a1 = new Avion("Bogein 737","Aterrizado",800,"Tesla",2019,300,6);
		Avion a2 = new Avion("Airbus 200","Despegado",500,"American Corp.",2010,200,4);
		Helicoptero h1 = new Helicoptero("AgustaWestland Ke Koala", "Despegado","AW119","Sikorsky Aircraft",4,2,"Alejandra Azxarate");
		Helicoptero h2 = new Helicoptero("Eurocopter", "Despegado","H175","Aviation Industry Corporation",6,2,"Maluma");
		Ovni o1=new Ovni("OVNI 1","Despegado","Forma de platillo, luces en la parte superior que parpadean",new Date(), 1);
		
		
		a1.permiso=true;
		a2.permiso=true;
		h1.permiso=false;
		h2.permiso=true;
		o1.permiso=false;
		
		
		
		
		Artefacto[] artefactos={a1,o1,h1,a2,h2};
		
		System.out.println("La torre de control informa que debemos verificar: "+artefactos.length+" artefactos voladores detectados, se procederá a verificar su estado:");
		
		int index=1;
		System.out.println("---------------------------------------------------------");
		System.out.println("LISTA DE ARTEFACTOS VOLADORES OBSERVADOS");
		System.out.println("---------------------------------------------------------");
		
		for(Artefacto artef: artefactos) {
			System.out.println(index+"  |  "+artef.nombre);
			System.out.println("---------------------------------------------------------");
			index++;
		}
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("---------------------------------------------------------");
		System.out.println("VALIDACION DE ARTEFACTOS VOLADORES");
		System.out.println("---------------------------------------------------------");
		for(int i=0; i<artefactos.length; i++) {
			if(artefactos[i] instanceof Avion){
					Avion av=(Avion)artefactos[i];
					av.aterrizar();
					System.out.println("-------------------------------------------------");
					System.out.println(av.nombre+"");
					System.out.println("-------------------------------------------------");
			}else if (artefactos[i] instanceof Helicoptero){
					Helicoptero he=(Helicoptero)artefactos[i];
					he.aterrizar();
					System.out.println("-------------------------------------------------");
					System.out.println(he.nombre);
					System.out.println("-------------------------------------------------");
			}else if(artefactos[i] instanceof Ovni) {
				Ovni ov=(Ovni)artefactos[i];
				ov.aterrizar();
				System.out.println("-------------------------------------------------");
				System.out.println(ov.nombre+"");
				System.out.println("-------------------------------------------------");
			}else if(artefactos[i] instanceof Superman) {
				Superman sup=(Superman)artefactos[i];
				sup.aterrizar();
				System.out.println("-------------------------------------------------");
				System.out.println(sup.nombre+"");
				System.out.println("-------------------------------------------------");
			}
			
			}
			
			
		
		
	}

}

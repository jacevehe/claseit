package opp;

public class DataBase {

	//Simular bd con un metodo
	Articulo[] consultar(String clave){
		Articulo res = new Articulo("Iron Man v1",35940,"https://",true,10,true, true);
		Articulo res1 = new Articulo("Figura Marvel Iron Man v2",30940,"https://",false,10,true, true);
		
		Articulo[] resultados = {res, res1};
		return resultados;
		
		}
}

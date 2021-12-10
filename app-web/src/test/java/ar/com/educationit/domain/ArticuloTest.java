package ar.com.educationit.domain;

import java.util.Date;

public class ArticuloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Articulo miarticulo = new Articulo ("titulo1",new Date(),"0001",2500d,5,1l,1l);
		miarticulo.toString();
	}

}

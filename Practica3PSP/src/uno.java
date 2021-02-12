

public class uno {

	public static void main(String[] args) {

		String cadena="1";
		
		System.out.println(leerCadena(cadena));
	}
	
	
	
	static String leerCadena(String cadena) {
		
		//LEER UNA CADENA Y DECIR SI ES PALINDROMA Y SI ESTA VACIA
		
		boolean vacio=false;
		boolean palindromo=false;
		String resultado="";
		
		String invertida = new StringBuilder(cadena).reverse().toString();
		

		
		//esta vacio?
		if (cadena.isEmpty() || cadena==null) {
			vacio=true;
		}
		
		if(invertida.equals(cadena)) {
			palindromo=true;
		}
		
		resultado="palindromo = "+palindromo+"  -  vacio = "+vacio;
		
		return resultado;
		
	}

}

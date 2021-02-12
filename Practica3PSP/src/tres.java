import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class tres {

	public static void main(String[] args) {
		// LEE UNA PALABRA EN UN ARCHIVO DE TEXTO Y IMPRIME EN OTRO ARCHIVO DE TEXTO SI ES PALINDROMA O SI ESTA VACIO
		// SE USA UNA LLAMADA AL EJERCICIO 1

		String resultado=null;
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    String cadena="";
	    
	    
	    
	    //leer el fichero
		try {
			 // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File (new java.io.File("").getAbsolutePath()+"\\borrar.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero borrar.txt
	         
	         while((cadena=br.readLine())!=null) { 
	        	 uno ejercicioUno = new uno();
	     		 resultado=ejercicioUno.leerCadena(cadena);
	         }
	         if (resultado==null) {
	        	 resultado="La cadena esta vacia";
	         }
	         
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		//guardar el resultado en otro fichero
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
        	
        	
        	FileWriter myWriter = new FileWriter(new java.io.File("").getAbsolutePath()+"\\borrar2.txt");
            myWriter.write(resultado);
            myWriter.close();
            System.out.println("El resultado ha sido impreso");

        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
	}

}

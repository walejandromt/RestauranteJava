import java.io.File;
import java.io.FileWriter;
public class Cliente{
	private Persona persona;
	public static String coClientes = "";

 public Cliente(){

  }

public static void coClientes(Persona persona){
	coClientes = coClientes + "------------------ \n" +
			"Nombre:   " + persona.getNombre() + "\n" +
		 	" Edad: "   + persona.getEdad() + "--------------------\n";

}


}


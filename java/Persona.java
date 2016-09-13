public class Persona{
	private String nombre;
	private int edad;


public Persona(){

}

public Persona(String nombre, int edad){
 this.nombre = nombre;
 this.edad = edad;
}

public String getNombre(){

return nombre;
}
public void setNombre(String nombre){
 this.nombre = nombre;
}
public int getEdad(){
return edad;
}


public void setEdad(int edad){
this.edad = edad;
}





// traer los datos de adulto y niños en la variables statica que concatena la informacion para guardarla en un txt
// public static datosClientes(){
 // }

}
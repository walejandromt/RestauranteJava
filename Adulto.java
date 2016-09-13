public class Adulto extends Persona{

 private String profesion;
 private String[] pasaTiempo;

 public Adulto(String nombre, int edad, String profesion, String[] pasaTiempo){
		super(nombre, edad);
		this.profesion = profesion;
		this.pasaTiempo = pasaTiempo;

	
	}

public Adulto(){

	}


public void setProfesion(String profesion){
  this.profesion = profesion;
}

public void setPasaTiempo(String[] pasaTiempo){
  this.pasaTiempo = pasaTiempo;
}

}
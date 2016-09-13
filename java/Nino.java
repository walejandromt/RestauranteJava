public class Nino extends Persona{
 private String superHeroe;
 private String[] caricaturas;

public Nino(){
	
}

public Nino(String nombre, int edad, String superHeroe, String[] caricaturas){
	super(nombre, edad);
	this.superHeroe = superHeroe;
	this.caricaturas = caricaturas;
}

public void setSuperHeroe(String superHeroe){
 this.superHeroe = superHeroe;
}

public void setCaricaturas(String[] caricaturas){
 this.caricaturas = caricaturas;
}

}
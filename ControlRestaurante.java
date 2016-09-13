import java.util.Scanner;


//name class orden
public class ControlRestaurante{
	private static int orden;
	private static String especificacion;
	private static int tipo=0;
	private static Scanner sc;
	private static Nino nino;
	private static Adulto adulto;
	private static Cliente cliente;
	private static CharEncodingDemo demon;
	private static String precioYName = "";
	private static String[] pasaTiempo;
	private static String[] caricaturas;
	private static String superHeroe;
	private static String profesion;
	
	

 public ControlRestaurante(){
		
		this.tipo = tipo;
		System.out.println("1.- Adulto.");
		System.out.println("2.- Nino");
		sc = new Scanner(System.in);
		tipo = sc.nextInt();
		cliente = new Cliente();
		demon = new CharEncodingDemo();
		print();

	}

public static void ini(){
			int bol = 0;
		System.out.println("Desea Seguir ordenando?");
		System.out.println("1.-SI");
		System.out.println("2.-NO");
		bol = sc.nextInt();

		if(bol == 1){

		System.out.println("1.- Adulto.");
		System.out.println("2.- Nino");
		tipo = sc.nextInt();
		print();
		 
		}else if(bol == 2){
		  System.out.println("Gracias por su compra buen provecho. aqui tiene su ticket");
			System.out.println("Ticket------------------");
			System.out.println(precioYName);
			System.out.println("SI ESTA COMIENDO");

			if(tipo == 1){
	   System.out.println("RECIBE POSTRE DE CORTESIA");
	}else if(tipo == 2){
	 System.out.println("EL NIÑO ESTA JUGANDO");
	}
			
			
		}
		
		


	}


 public ControlRestaurante(int orden, String especificacion){
		this.orden = orden;
		this.especificacion = especificacion;
		
	}

 private static void printMenuAdulto(){
		adulto = new Adulto();
 		int y=1;

		System.out.println("Cual es su nombre?");
		 adulto.setNombre(sc.nextLine());
		adulto.setNombre(sc.nextLine());
		System.out.println("Cual es su edad?");
 		 adulto.setEdad(sc.nextInt());
		
		System.out.println("Cual es su profesion?");
		 adulto.setProfesion(sc.nextLine());
		profesion = sc.nextLine();
		 adulto.setProfesion(profesion);
		System.out.println("Cuantos pasaTiempo?");
		 y = sc.nextInt();
		 pasaTiempo = new String[y];
			
			pasaTiempo[0]= sc.nextLine();
		
		 for(int x=0; x<=pasaTiempo.length-1; x++){
		     System.out.println("Cual es su pasaTiempo?");
			pasaTiempo[x] = x + ".- " + sc.nextLine() + "\n";
			
			}
		
			
		   adulto.setPasaTiempo(pasaTiempo);
		cliente.coClientes(adulto);
		
//................ MENU...............................
		System.out.println("-----------¿QUE VAS A ORDENAR?------------");
		System.out.println("------1.-ARROZ");
		System.out.println("------2.-POLLO");
		System.out.println("------3.-MILANEZA");
		orden = sc.nextInt();
		printEspeficicacion();
	
	}

 private static void printMenuNino(){

		nino = new Nino();
		int car=1;
		

		System.out.println("Cual es su nombre?");
		  nino.setNombre(sc.nextLine());
		  nino.setNombre(sc.nextLine());
		System.out.println("Cual es su edad?");
		  nino.setEdad(sc.nextInt());

		System.out.println("Cual es tu Super Heroe?");
		  nino.setSuperHeroe(sc.nextLine());
			superHeroe = sc.nextLine();
		  nino.setSuperHeroe(superHeroe);

		System.out.println("Cuantas caricaturas?");
		 car = sc.nextInt();
		 caricaturas = new String[car];
			
			caricaturas[0]= sc.nextLine();
			
		 for(int x=0; x<=caricaturas.length-1; x++){
		     System.out.println("Cual es su caricaturas?");
			
			caricaturas[x] = x + ".- " + sc.nextLine() + "\n";
			}

		  nino.setCaricaturas(caricaturas);
		  //Cuantos pasaTiempos

		cliente.coClientes(nino);

//................ MENU...............................
		System.out.println("-----------¿QUE VAS A ORDENAR?------------");
		System.out.println("------1.-HAMBURGUESA");
		System.out.println("------2.-PAPAS");
		System.out.println("------3.-PIZZA");
		orden = sc.nextInt();
		printEspeficicacion();
		cliente.coClientes(nino);
	
	}


public static void print(){
	if(tipo == 1){
	  printMenuAdulto();
	}else if(tipo == 2){
	  printMenuNino();
	}else{
		System.out.println("Favor de selecionar si eres Adulto o niño");
	}


}



public static void printEspeficicacion(){
	if(tipo == 1){

		switch(orden){
		  case 1:
		       System.out.println("¿Color del arroz?");
			especificacion = sc.nextLine();
			especificacion = sc.nextLine();
			precioYName = precioYName + "\n" + 
				"ARROZ -------------- $40";
			
		  break;
		  case 2:
		       System.out.println("¿Que pieza?");
			especificacion = sc.nextLine();
			especificacion = sc.nextLine();
			precioYName = precioYName + "\n" + 
				"POLLO -------------- $50";
		  break;
		  case 3:
		       System.out.println("¿Que termino?");
			especificacion = sc.nextLine();
			especificacion = sc.nextLine();
			precioYName = precioYName + "\n" + 
				"MILANEZA -------------- $70";
		  break;
		  default:
		       System.out.println("Favor de especificar");
			especificacion = sc.nextLine();
			especificacion = sc.nextLine();
		  break;
			}
		
	  
	}else if(tipo == 2){
	  	switch(orden){
		  case 1:
		       System.out.println("¿Que tipo?");
			especificacion = sc.nextLine();
			especificacion = sc.nextLine();
			precioYName = precioYName + "\n" + 
				"HAMBURGUESA -------------- $55";
		  break;
		  case 2:
		       System.out.println("¿Que forma?");
			especificacion = sc.nextLine();
			especificacion = sc.nextLine();
			precioYName = precioYName + "\n" + 
				"PAPAS -------------- $25";
		  break;
		  case 3:
		       System.out.println("¿Cual combinacion?");
			especificacion = sc.nextLine();
			especificacion = sc.nextLine();
			precioYName = precioYName + "\n" + 
				"PIZZA -------------- $15";
		  break;
		  default:
		       System.out.println("Favor de especificar");
			//this.printEspeficicacion();
		  break;
			}
	}else{
		System.out.println("Favor de selecionar si eres Adulto o niño");
	}


	if(tipo == 1){
	   String profe = "Su profesion es: " + profesion;
		
		String pasaT = "\n";
		for(int r = 0; r <= pasaTiempo.length-1; r++){
			pasaT =  pasaT + pasaTiempo[r];
			}
	   	String pasaTq = "Su pasa tiempo es: \n"+ pasaT;
	  demon.create(cliente.coClientes, profe, pasaTq);
	}else if(tipo == 2){

		String superH = "Su SuperHeroe es: " + superHeroe;
		String caricas= "\n";
		
		for(int u = 0; u <= caricaturas.length-1; u++){
			caricas = caricas + caricaturas[u];
			}
		String carica ="Las caricaturas son: " + "\n" + caricas;

	 demon.create(cliente.coClientes, superH, carica);	
	}

	System.out.println("Su orden esta servida");
		ini();
	
	 //System.out.println("Personas-------------\n " + cliente.coClientes);


	
	   
		//enviar pasaTiempo y profesion
		//caricaturas y superheroe
	
		
		
}






}
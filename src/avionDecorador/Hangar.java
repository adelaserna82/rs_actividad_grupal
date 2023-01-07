package avionDecorador;

import adaptadorEmail.AdaptadorEmail;
import adaptadorEmail.AdaptadorMailAMailTerceros;

public class Hangar {
	
	private AdaptadorEmail email;
	
	public Hangar() {
		
		email = new AdaptadorMailAMailTerceros();
	}
	
    public void crearAviones() {
    	
        String emailCliente1 = "cliente1@reutilizacion.com";
        String emailCliente2 = "cliente2@reutilizacion.com";
        String emailCliente3 = "cliente3@reutilizacion.com";
        


        // SE CREA UN AVION A380
        Avion a380 = new A380();
        
        // Se decora el avion A380
        a380 = new Ducha(a380);
        a380 = new Bar(a380);
        a380 = new AsientosPrimera(a380);
        a380 = new AsientosBusiness(a380);
        
        String resultadoAvion = a380.crearAvion();
        // Se muestra el resultado final del avion A380
        System.out.println("Avión creado: " + resultadoAvion + ". \n");
        
        // TODO:
        email.send(emailCliente1, "Avion A380 finalizado",
        						  "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: " 
        						  + resultadoAvion);  
        
        // SE CREA UN AVION A350
        Avion a350 = new A350();
        
        // Se decora el avion A350
        a350 = new Ducha(a350);
        a350 = new Bar(a350);
        a350 = new AsientosBusiness(a350);
                
        // Se muestra el resultado final del avion A380
        System.out.println("Avión creado: " + a350.crearAvion() + ". \n");
        
        // TODO:
        email.send(emailCliente2, "Avion A350 finalizado",
        						  "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: " 
        						  + resultadoAvion); 
        
        // SE CREA UN AVION A330
        Avion a330 = new A330();
        
        // Se decora el avion A330
        a330 = new AsientosPrimera(a330);
        a330 = new Bar(a330);
        a330 = new AsientosBusiness(a330);
                
        // Se muestra el resultado final del avion A380
        System.out.println("Avión creado: " + a330.crearAvion() + ". \n");
        
        // TODO:
        email.send(emailCliente3, "Avion A330 finalizado",
        						  "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: " 
        						  + resultadoAvion); 
    }
}
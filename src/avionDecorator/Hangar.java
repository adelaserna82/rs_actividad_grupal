package avionDecorator;

public class Hangar {

    public static void main(String[] args) throws Exception {
        Avion a380 = new Ducha(new Bar(new AsientosPrimera(new Ducha(new AsientosBusiness(new Bar(new A380()))))));
        Avion a350 = new Ducha(new Bar(new AsientosPrimera(new AsientosBusiness(new AsientosPrimera(new AsientosBusiness(new A350()))))));
        Avion a330 = new Ducha(new Bar(new AsientosBusiness(new AsientosPrimera(new AsientosBusiness(new A350())))));


        System.out.println("************Montando Avi�n************");
        System.out.println("Nuetro avi�n contiene: " + a380.crearAvion());
        
        System.out.println("");
        
        System.out.println("************Montando Avi�n************");
        System.out.println("Nuetro avi�n contiene: " + a350.crearAvion());
        
        System.out.println("");
        
        System.out.println("************Montando Avi�n************");
        System.out.println("Nuetro avi�n contiene: " + a330.crearAvion());
    }
}

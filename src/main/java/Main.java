/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/


public class Main {
    public static void main(String arg[ ] ){  
        //BufferedReader lector = new BufferedReader( new InputStreamReader( System.in ) );
        //System.out.println("i es cero.");
          //int i = Integer.parseInt(lector.readLine());
          Terminal Ter = new Terminal(); 
          
          Bus BB = new Bus("Quilpue");
          Ter.agregarBus("Quilpue", BB);
          Pasajero Puppy = new Pasajero("Claudio","88569854-5");
          BB.agregarPasajero(Puppy);
          System.out.println(((Bus)(Ter.andenes.get("Quilpue"))).getDestino());
          //System.out.println(Ter);
          System.out.println("HolaMundo");
          
          
          
          
                      /*
          switch(i) {
          case 0 -> System.out.println("i es cero.");
          case 1 -> System.out.println("i es uno.");
          case 2 -> System.out.println("i es dos.");
          case 3 -> System.out.println("i es tres.");
          default -> System.out.println("i es mayor a tres.");
          */
          
          }

    }


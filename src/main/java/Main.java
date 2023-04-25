



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String arg[ ] ) throws IOException{  
          BufferedReader lector = new BufferedReader( new InputStreamReader( System.in ) );
          System.out.println("i es cero.");
          //int i = Integer.parseInt(lector.readLine());
          
          Terminal Ter = new Terminal(); 
          
          // metodo de la clase Terminal que leeria los datos de Personasa y los almacenaría  
          Ter.leerPasajeros();
          
          System.out.println("pasajeros leidos");
          
          Bus BB = new Bus("Quilpue");
          Ter.agregarBus("Quilpue", BB);
          Pasajero Puppy = new Pasajero("Claudio","88569854-5","aMayor");
          BB.agregarPasajero(Puppy,5);
          //System.out.println();
          Ter.obtenerBus("Quilpue").listarPasajero();
          //System.out.println(Ter);
          System.out.println("HolaMundo");
          int i=-1;
          
          
          //int i = 0;      
          while(i!=0){
              System.out.println("Presione 0 para terminar");
              System.out.println("Presione 1 para agregar pasajero");                 
              System.out.println("Presione 2 para listar Pasajeros de un Bus especifico");
              System.out.println("Presione 3 para eliminar pasajero");
              System.out.println("Presione 4 para agregar Bus al Terminal");
              int seleccion ;
              String nombrePasajero, destino, rut;
              System.out.println("Ingrese opcion");
              i = Integer.parseInt(lector.readLine());
              switch(i) {
                  
                case 0:
                  System.out.println("Se ha cancelado el programa");
                  break;
                case 1:
                    
                     
                    System.out.println("ingrese Nombre del Pasajero");
                    nombrePasajero = lector.readLine();
                    
                    System.out.println("ingrese Rut del Pasajero");
                    rut = lector.readLine();
                    
                    System.out.println("Ingrese Numero de Asiento");
                    System.out.println("Ingrese (0) para seleccionar un asiento aleatorio");
                    seleccion = Integer.parseInt(lector.readLine());
                  
                    System.out.println("Ingrese Destino");
                    destino = lector.readLine();
                    if(Ter.obtenerBus(destino)==null){
                        System.out.println("No se ha encontrado el destino");
                        break;
                    }
                    Puppy.setNombre(nombrePasajero);
                    Puppy.setRut(rut);
                    
                    if (seleccion == 0){
                        Ter.obtenerBus(destino).agregarPasajero(Puppy);
                    }
                    else{
                         Ter.obtenerBus(destino).agregarPasajero(Puppy,seleccion);
                    }
                  break;
                case 2:
                   destino = lector.readLine();
                   Ter.obtenerBus(destino).listarPasajero();
                  break;
                case 3:
                    System.out.println("Ingrese destino del Bus");
                    destino = lector.readLine();
                    System.out.println("Ingrese Rut del Pasajero");
                    rut = lector.readLine();
                   Ter.obtenerBus(destino).eliminarPasajero(rut);
                  break;
                case 4:
                    System.out.println("Ingrese nuevo destino de Bus");
                    destino = lector.readLine();
                    BB.setDestino(destino);
                    
                    Ter.agregarBus(destino, BB); 
                
                default:
                  System.out.println("Default xd");
              }
          }
                      
          

    }
}
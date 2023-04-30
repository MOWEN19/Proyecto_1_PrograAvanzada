import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String arg[ ] ) throws IOException{  
          BufferedReader lector = new BufferedReader( new InputStreamReader( System.in ) );
          
          //int i = Integer.parseInt(lector.readLine());
          
          Terminal Ter = new Terminal(); 
          
          VentanaMain  VentanaM = new VentanaMain(Ter);
          VentanaM.setVisible(true);
          // metodo de la clase Terminal que leeria los datos de Personasa y los almacenaría  
          Ter.leerPasajeros();
          
          
          Bus BB = new Bus("Quilpue");
          Ter.agregarBus("Quilpue", BB);
          Pasajero Puppy = new Pasajero("Claudio","10856985-5","aMayor");
          BB.agregarPasajero(Puppy,5);
          int i=-1;
          
          
          
          while(i!=0){
              System.out.println("Presione 0 para terminar");
              System.out.println("Presione 1 para agregar pasajero");                 
              System.out.println("Presione 2 para listar Pasajeros de un Bus especifico");
              System.out.println("Presione 3 para eliminar pasajero");
              System.out.println("Presione 4 para agregar Bus al Terminal");
              System.out.println("Presione 5 para Editar informacion de un Pasajero");
              
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
                   Bus bb = Ter.obtenerBus(destino);
                   //bb.listarPasajero();
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
                    BB = new Bus(destino);
                    Ter.agregarBus(destino, BB); 
                    break;
                case 5:
                    //System.out.println("Ingrese destino del Bus");
                    //destino = lector.readLine();
                    System.out.println("Ingrese Rut de Pasajero");
                    rut = lector.readLine();
                    
                    //funcion para modificar datos de pasajero
                    System.out.println("QUE DESEA CAMIBIAR");
                    System.out.println("Nombre (0)");
                    System.out.println("Tipo");
                    System.out.println("Cambiar de Bus");
                    System.out.println("Cambiar asiento");
                    i = Integer.parseInt(lector.readLine());
                    Pasajero pp = new Pasajero();
                    switch(i){ 
                        case 1:
                            System.out.println("ingrese nombre");
                            String NuevoNombre = lector.readLine();
                            System.out.println("Ingrese destino del Bus");
                            destino = lector.readLine();
                            pp = Ter.obtenerBus(destino).obtenerPasajero(rut);
                            pp.setNombre(NuevoNombre);
                            break;
                        case 2:
                            System.out.println("ingrese Tipo de Pasajero ");
                            System.out.println("estudiante, aMayor, normal");
                            String nuevoTipo = lector.readLine();
                            System.out.println("Ingrese destino del Bus");
                            destino = lector.readLine();
                            pp = Ter.obtenerBus(destino).obtenerPasajero(rut);
                            pp.setTipoPasajero(nuevoTipo);
                            break;
                        case 3:
                            
                            System.out.println("ingrese Destino actual ");
                            destino = lector.readLine();
                            System.out.println("Ingrese Destino nuevo");
                            String nuevoDestino = lector.readLine();
                            pp = Ter.obtenerBus(destino).obtenerPasajero(rut);
                            Ter.obtenerBus(destino).eliminarPasajero(rut);
                            
                            
                            System.out.println("Ingrese nuevo Numero de Asiento");
                            System.out.println("Ingrese (0) para seleccionar un asiento aleatorio");
                            seleccion = Integer.parseInt(lector.readLine());

                            if(Ter.obtenerBus(nuevoDestino)==null){
                                System.out.println("No se ha encontrado el destino");
                                break;
                            }
                            if (seleccion == 0){
                                Ter.obtenerBus(nuevoDestino).agregarPasajero(pp);
                            }
                            else{
                                 Ter.obtenerBus(nuevoDestino).agregarPasajero(pp,seleccion);
                            }
                                    break;
                                    
                        case 4:
                            
                            System.out.println("ingrese Destino actual ");
                            destino = lector.readLine();
                            pp = Ter.obtenerBus(destino).obtenerPasajero(rut);
                            System.out.println("Ingrese nuevo Numero de Asiento");
                            System.out.println("Ingrese (0) para seleccionar un asiento aleatorio");
                            seleccion = Integer.parseInt(lector.readLine());
                            Ter.obtenerBus(destino).eliminarPasajero(rut);
                            if(Ter.obtenerBus(destino)==null){
                                System.out.println("No se ha encontrado el destino");
                                break;
                            }
                            if (seleccion == 0){
                                
                                Ter.obtenerBus(destino).agregarPasajero(pp);
                            }
                            else{
                                 Ter.obtenerBus(destino).agregarPasajero(pp,seleccion);
                            }
                            
                            break;
                            
                                default:
                                    System.out.println("Default xd2");
                            }
                    
                    
                    
                    break;
                default:
                  System.out.println("Default xd");
              }
          }
                      
          

    }
}
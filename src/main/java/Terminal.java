import csv.CSV;
import java.util.HashMap;
//import java.util.Scanner;
import java.io.*;

  public class Terminal{
    //private int cantBuses;
    //llave destino y valor el bus (?) 
    HashMap<String, Bus> andenes;
    
    public Terminal(){
      this.andenes = new HashMap();
        
      //this.cantBuses = 0;
      //System.out.println("cantBuses: "+andenes.size());
    }   

    public void agregarBus(String destino, Bus bus){
        
      if(andenes==null){
          andenes = new Hashmap();
          andenes.put(destino,bus);
          return;
      }  
      if(andenes.size()>10){
        System.out.println("Capacidad llena");
        return;
      }
      if(!andenes.containsKey(destino)){
        andenes.put(destino,bus);
        System.out.println("cantBuses: "+andenes.size());
      }
    }
    
    
    public void agregarBus(String destino){
      Bus BB = new Bus(destino);
      if(andenes==null){
          andenes = new Hashmap();
          andenes.put(destino,BB);
          return;
      }  
      if(andenes.size()>10){
        System.out.println("Capacidad llena");
        return;
      }
      if(!andenes.containsKey(destino)){
        andenes.put(destino,BB);
        System.out.println("cantBuses: "+andenes.size());
      }
    }
    
    private static class Hashmap extends HashMap<String, Bus> {
        public Hashmap() {
        }
    }
    //FileNotFoundException,
    public void leerPasajeros()throws IOException{
        //Scanner archivo = new Scanner(new File("Personas.csv"));
        CSV csv = new CSV("C:\\Users\\Fabrizzio\\OneDrive\\Documents\\NetBeansProjects\\proyecto1Java\\src\\main\\java\\","Personas.csv");
        String linea = csv.firstLine();
        int casilla1 = 1, casilla2 = 2;
        for (int i = 0; i<61;i++){
            linea = csv.nextLine();
            String rut = csv.get_csvField(linea, 0);
            String nombre = csv.get_csvField(linea, 1);
            
            
            String datosLinea[] = new String[2];
            datosLinea[0] = nombre;
            datosLinea[1] = rut;
            System.out.print(datosLinea[1]);
            System.out.println(datosLinea[0]);
            
        }
    }
    
    
    
    
    
    
  }
  


    

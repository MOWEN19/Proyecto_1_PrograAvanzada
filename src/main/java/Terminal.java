import java.util.HashMap;

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
  }
  


    


    

    
  

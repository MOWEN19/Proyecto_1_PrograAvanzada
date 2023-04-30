import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;


public class Bus{
    // private Pasajero[] listado;
    //la llave seria el numero de asiento, el valor seria la persona
    private HashMap<Integer, Pasajero> listado;
    //private int cantPasajeros;
    private String destino;
    

    public Bus(String destino){
      this.listado = new HashMap<>();
      
      this.destino = destino;
      //this.cantPasajeros = 0;
    }


    //Funcion para mostrar los pasajeros en orden
    public void listarPasajero(JTable Tabla){
      //System.out.println(listado);
      DefaultTableModel mm = (DefaultTableModel) Tabla.getModel();
      for(int i = 1;i<=20;i++){
        if(this.listado.containsKey(i)){
          System.out.println(i + this.listado.get(i).getNombre());
          Object[] nuevaFila = {i, this.listado.get(i).getNombre(), this.listado.get(i).getRut()};
          mm.addRow(nuevaFila);
        }
      }
    }

    
    // Funcion para agregar personas con asiento personalizado
    public void agregarPasajero(Pasajero pasajero,int asiento){
      if(asiento>20 || asiento<1){
        System.out.println("Numero no disponible");
        return;
      }
      if(listado.containsKey(asiento)){
        System.out.println("Asiento ya ocupado");
        return;
      }
      listado.put(asiento, pasajero);
      System.out.println("Asiento asignado exitosamente");
    }

    // Funcion para agregar personas con el asiento disponible

    public void agregarPasajero(Pasajero pasajero){
      for(int i=0;i<=20;i++){
        if(!listado.containsKey(i)){
          listado.put(i,pasajero);
          return;
        }
      }
    }


    // Funcion para eliminar personas de acuerdo a un rut especifico
    public void eliminarPasajero(String rut){
      for(int i=1;i<=20;i++){
        if(listado.containsKey(i)){
        //((Pasajero)(listado.get(i)).getRut())  
            if((((Pasajero)(listado.get(i))).getRut()).equals(rut)){
                listado.remove(i);
                return;
            }
        }
      }
    }
    
    public Pasajero obtenerPasajero(String Rut){
        //(Bus)(Ter.andenes.get("Quilpue"))
        for(int i=1;i<=20;i++){
        if(listado.containsKey(i)){
        Pasajero pp = ((Pasajero)(listado.get(i)));
            if((pp.getRut()).equals(Rut)){
                System.out.println("------------------------------------------------------------");
                return pp;
            }
        }
        
      }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        return null; // Excepcion 
    }
    
    public void setDestino(String destino){
      this.destino = destino;
    }

    public String getDestino(){
      return destino;
    }
    
    
    }
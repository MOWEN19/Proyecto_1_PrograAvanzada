public class Pasajero{
    private String nombre;
    private String rut;
    private String tipoPasajero;

    public Pasajero(){
      this.nombre = null;
      this.rut = null;
      this.tipoPasajero = null;
    }
    
    public Pasajero(String nombre, String rut, String tipoPasajero){
      this.nombre = nombre;
      this.rut = rut;
      this.tipoPasajero = tipoPasajero;
    }
    
    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    public String getNombre(){
      return nombre;
    }

    public void setRut(String rut){
      this.rut = rut;
    }

    public String getRut(){
      return rut;
    }

    public void setTipoPasajero(String tipoPasajero){
      this.tipoPasajero = tipoPasajero;
    }

    public String getTipoPasajero(){
      return tipoPasajero;
    }
  }
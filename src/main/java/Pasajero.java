public class Pasajero{
    private String nombre;
    private String rut;

    public Pasajero(){
      this.nombre = null;
      this.rut = null;
    }
    
    public Pasajero(String nombre, String rut){
      this.nombre = nombre;
      this.rut = rut;
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
  }
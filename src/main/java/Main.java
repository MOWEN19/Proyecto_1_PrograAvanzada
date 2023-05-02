import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String arg[ ] ) throws IOException{  
          BufferedReader lector = new BufferedReader( new InputStreamReader( System.in ) );
          
          Terminal Ter = new Terminal(); 
          
          Bus BB = new Bus("Quilpue");
          Ter.agregarBus("Quilpue", BB);
          
          BB = new Bus("Santiago");
          Ter.agregarBus("Santiago", BB);
          
          BB = new Bus("SanAntonio");
          Ter.agregarBus("SanAntonio", BB);
          Ter.leerPasajeros();
          
          
          VentanaMain  VentanaM = new VentanaMain(Ter);
          VentanaM.setVisible(true);
          
    }
}
package procesos;

import java.awt.Color;
import javax.swing.JLabel;

//Esta clase se encarga de alterar los colores de las etiquetas las cuales representan botones.

public class ColorBotones {

    public ColorBotones() {
    }
    
//Se encarga de modificar el color de la letra y el fondo para los títulos.
  
    public void BotonTitulo(JLabel boton){
        boton.setBackground(Color.decode("#008080"));
        boton.setForeground(Color.decode("#ffffff"));
    }

//Se encarga de modificar los colores de los botones, junto con el texto que tienen.
   
    public void BotonMenu(JLabel boton){
        boton.setBackground(Color.decode("#008080"));
        boton.setForeground(Color.decode("#ffffff"));
    }
}

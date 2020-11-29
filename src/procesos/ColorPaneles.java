package procesos;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

//Se encarga de generar un degradado en los paneles.
 
public class ColorPaneles extends JPanel{
    
    private Color colorUno;
    private Color colorDos;
    
    //Método constructor que carga los colores y el panel a modificar.
    
    public ColorPaneles(JPanel panel) {
        this.colorUno = Color.decode("#000080");
        this.colorDos = Color.decode("#2F4F4F");
        this.setSize(panel.getSize());
        panel.add(this);
    }
    
    
    //Metodo encargado de la generación del degradado.
     
    @Override
    public void paint(Graphics g) {    
        Graphics2D g2 = (Graphics2D) g.create();
        Rectangle clip = g2.getClipBounds();                        
        g2.setPaint(new GradientPaint(0.0f, 0.0f, colorUno, getWidth()/2, getHeight(), colorDos));        
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);        
    }
}

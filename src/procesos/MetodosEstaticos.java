package procesos;

import almacenamiento.sqlsVisualizacion;
import almacenamiento.BaseDatos;
import java.util.LinkedList;

// Encargada de tener algunos métodos muy recurrentes, para no generarlos múltiples veces se crean en esta clase y son llamados directamente por ser métodos estáticos.
 
public class MetodosEstaticos {
    
    //Se utiliza para cargar las listas dentro de los comboBox que se usan la aplicación.
     
    public static void cargadorCombo(String tipo, javax.swing.JComboBox combo){
        combo.removeAllItems();
        String sql = new sqlsVisualizacion().constructorSQLs(tipo, "Listar", null);
        LinkedList lista = new BaseDatos().listarComponentes(sql);
        combo.addItem("");
        lista.forEach((object) -> {
            combo.addItem(object);
        });
    }
    
    // Utilizado para hacer las limitaciones de digitación en los campos de texto.
     
    public static void limitaCajas(javax.swing.JTextField caja, java.awt.event.KeyEvent e, int limite){
        if (caja.getText().length() >= limite){
            e.consume();
            /**
             * Genera un sonido bit indicando error.
             */
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }
    //Es una estructura HTML para utilizarla en un mensaje de información
     
    public static String informacion(){
        String mensaje = "<html>"
                + "<body>"
                + "<center><h1>Tecmilenio</h1>"
                + "<h1>Kurt Halbinger Bravo</h1>"
                + "<h2>al02943673</h2>"
                + "<p>Version: v1.0</p>"
                + "<br>"
                + "<br>"
                + "</center>"
                + "</body>"
                + "</html>";
        return mensaje;
    }
    // Método que se usa para validar los campos de texto
    
    public static boolean validador(String texto, int posicion){
        boolean correcto = true;
        texto = texto.toUpperCase().trim();
        String patrones[] = new String[]{
            "[A-Z]{1}[0-9]{2,}", "[A-Z0-9-\\s]{4,}", "[A-Z0-9\\s]{4,}", "[A-Z0-9,\\s]{3,}", "[A-Z\\s]{5,}", "[A-Z0-9,\\s-.]{3,}"
        };
        if (texto.matches(patrones[posicion])) {
            correcto = true;
        }
        return !correcto;
    }
}

package almacenamiento;

import almacenamiento.BaseDatos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import procesos.Computadoras;


public class sqlsGuardado {
    
    // Encargado en la inserción de informacion en la base de datos.
     
    public String sqlInsertaComponentes(String componente, String referencia){
        String sql = "INSERT INTO ";
        switch(componente) {
            case "Marca y Modelo":
                sql += "`marca_modelos`(`marca_modelo`, `activo_marca_modelo`)";
                break;
            case "Procesador":
                sql += "`procesadores`(`procesador`, `activo_procesador`)";
                break;
            case "Sistema operativo":
                sql += "`sistemas_operativos`(`sistema_operativo`, `activo_sistema_operativo`)";
                break;
        }
        sql += " VALUES (\""+ referencia + "\"," + true + ")";
        return sql;
    }
    
    // Genera la instricción SQL para inserta un computador
     
    public String sqlInsertaComputadores(Computadoras c){
        int idMarcaModelo = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Marca y Modelo", "recuperar ID", c.getMarcaModelo()));
        int idProcesador = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Procesador", "recuperar ID", c.getProcesador()));
        int idSistemaOperativo = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Sistema operativo", "recuperar ID", c.getSistemaOperativo()));
        String sql = "INSERT INTO `computadores`"
                + "(`id_placa`, `fk_id_marca_modelo`, `tipo`, `fk_id_procesador`, `serial_placa`, `memoria_ram`, `disco_duro`, `fk_id_sistema_operativo`, `tipo_office`, `antivirus`, `responsable`, `ubicacion`, `observaciones`, `activo_pc`) "
                + "VALUES (\""+ c.getPlaca() 
                +"\",\""+ idMarcaModelo 
                +"\",\""+ c.getTipo()
                +"\",\""+ idProcesador 
                +"\",\""+ c.getPlacaBase()
                +"\",\""+ c.getMemoriaRam()
                +"\",\""+ c.getDiscoDuro()
                +"\",\""+ idSistemaOperativo 
                +"\",\""+ c.getSoftware()
                +"\",\""+ c.getAntivirus()
                +"\",\""+ c.getResponsable()
                +"\",\""+ c.getUbicacion()
                +"\",\""+ c.getObservaciones()
                +"\","+ true +")";
        return sql;
    }
    
    // Método utilizado para actualizar el computador que se encuentra en la base de datos.
    
    public String sqlActualizaComputador(Computadoras c){
        int idMarcaModelo = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Marca y Modelo", "recuperar ID", c.getMarcaModelo()));
        int idProcesador = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Procesador", "recuperar ID", c.getProcesador()));
        int idSistemaOperativo = new BaseDatos().consultaIDs(new sqlsVisualizacion().constructorSQLs("Sistema operativo", "recuperar ID", c.getSistemaOperativo()));
        String sql = "UPDATE `computadores` SET "
                + "`fk_id_marca_modelo`=\""+ idMarcaModelo +"\","
                + "`tipo`=\""+ c.getTipo() + "\","
                + "`fk_id_procesador`=\""+ idProcesador + "\","
                + "`serial_placa`=\""+ c.getPlacaBase() + "\","
                + "`memoria_ram`=\""+ c.getMemoriaRam()+ "\","
                + "`disco_duro`=\""+ c.getDiscoDuro() + "\","
                + "`fk_id_sistema_operativo`=\""+ idSistemaOperativo + "\","
                + "`tipo_office`=\""+ c.getSoftware() + "\","
                + "`antivirus`=\""+ c.getAntivirus() + "\","
                + "`responsable`=\""+ c.getResponsable() + "\","
                + "`ubicacion`=\""+ c.getUbicacion() + "\","
                + "`observaciones`=\""+ c.getObservaciones() + "\""
                + "WHERE `id_placa` = \""+ c.getPlaca() + "\"";
        return sql;
    }
    
    // Método que entrega la sql de eliminación de componentes o cumputadores.
     
    public String sqlEliminar(String identificador, String tipo, String razon){
        Date date = new Date();
        DateFormat fechahora = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");
        String nuevoID = "DEL" + fechahora.format(date);
        String sql = "UPDATE ";
        razon = "===" + razon + "===";
        switch(tipo) {
            case "PC":
                sql += "`computadores` SET `id_placa` = \"" + nuevoID + "\", `observaciones` = \"" + razon + "\", `activo_pc`= " + false + " WHERE `id_placa`";
                break;
            case "Marca y Modelo":
                sql += "`marca_modelos` SET `activo_marca_modelo`= " + false + " WHERE `marca_modelo`";
                break;
            case "Procesador":
                sql += "`procesadores` SET `activo_procesador`= " + false + " WHERE `procesador`";
                break;
            case "Sistema operativo":
                sql += "`sistemas_operativos` SET `activo_sistema_operativo`= " + false + " WHERE `sistema_operativo`";
                break;
        }
        sql +=  " = \"" + identificador + "\"";
        return sql;
    }
    
    
}

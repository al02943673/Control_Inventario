package almacenamiento;

// Clase encargada de generar los SQLs para la visualización de equipos o componentes.
 
public class sqlsVisualizacion {
    
    // Método que realiza la consulta de componentes o computadores de forma individual.
     
    public String constructorSQLs(String componente, String accion, Object identificador){
        String sql = "SELECT ";
         switch(componente) {
            case "Marca y Modelo":
                switch(accion) {
                    case "Listar":
                        sql += "`marca_modelo` FROM `marca_modelos` WHERE `activo_marca_modelo` = 1";
                        break;
                    case "recuperar ID":
                        sql += "`id_marca_modelo` FROM `marca_modelos` WHERE `marca_modelo` = \"" + identificador.toString() + "\"";
                        break;
                    case "Recuperar Nombre":
                        sql += "`marca_modelo` FROM `marca_modelos` WHERE `id_marca_modelo` = \"" + (int)identificador + "\"";
                        break;
                }
                break;
            case "Procesador":
                switch(accion) {
                    case "Listar":
                        sql += "`procesador` FROM `procesadores` WHERE `activo_procesador` = 1";
                        break;
                    case "recuperar ID":
                        sql += "`id_procesador` FROM `procesadores` WHERE `procesador` = \"" + identificador.toString() + "\"";
                        break;
                    case "Recuperar Nombre":
                        sql += "`procesador` FROM `procesadores` WHERE `id_procesador` = \"" + (int)identificador + "\"";
                        break;
                }
                break;
            case "Sistema operativo":
                switch(accion) {
                    case "Listar":
                        sql += "`sistema_operativo` FROM `sistemas_operativos` WHERE `activo_sistema_operativo` = 1";
                        break;
                    case "recuperar ID":
                        sql += "`id_sistema_operativo` FROM `sistemas_operativos` WHERE `sistema_operativo` = \"" + identificador.toString() + "\"";
                        break;
                    case "Recuperar Nombre":
                        sql += "`sistema_operativo` FROM `sistemas_operativos` WHERE `id_sistema_operativo` = \"" + (int)identificador + "\"";
                        break;
                }
                break;
            case "Placas":
                sql += "`id_placa` FROM `computadores` WHERE `activo_pc` = 1";
                break;
        }
        return sql;
    }
    
    //* Método que genera el SQL donde esta toda la información del computador
     
    public String sqlPCs(String tipo, String id){
        String sql =    "SELECT c.id_placa, mm.marca_modelo, c.tipo, p.procesador, c.serial_placa, c.memoria_ram, c.disco_duro, so.sistema_operativo, c.tipo_office, c.antivirus, c.responsable, c.ubicacion, c.observaciones " +
                        "FROM `computadores` c " +
                        "INNER JOIN `marca_modelos` mm ON mm.id_marca_modelo = c.fk_id_marca_modelo " +
                        "INNER JOIN `procesadores` p ON p.id_procesador = c.fk_id_procesador " +
                        "INNER JOIN `sistemas_operativos` so ON so.id_sistema_operativo = c.fk_id_sistema_operativo ";
        
        if (tipo.equalsIgnoreCase("PC")) {
            sql += "WHERE `id_placa` = \"" + id + "\"";
        } else {
            sql += "WHERE `activo_pc` = 1";
        }
        return sql;
    }
}

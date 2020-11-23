
package procesos;

public class Computadoras {
    
    private String placa;
    private String marcaModelo;
    private String tipo;
    private String procesador;
    private String placaBase;
    private String memoriaRam;
    private String discoDuro;
    private String sistemaOperativo;
    private String software;
    private String responsable;
    private String ubicacion;
    private String observaciones;
    private boolean inactivo;

    public Computadoras() {
    }

    public Computadoras(String placa, String marcaModelo, String tipo, String procesador, String placaBase, String memoriaRam, String discoDuro, String sistemaOperativo, String software, String responsable, String ubicacion, String observaciones, boolean inactivo) {
        this.placa = placa;
        this.marcaModelo = marcaModelo;
        this.tipo = tipo;
        this.procesador = procesador;
        this.placaBase = placaBase;
        this.memoriaRam = memoriaRam;
        this.discoDuro = discoDuro;
        this.sistemaOperativo = sistemaOperativo;
        this.software = software;
        this.responsable = responsable;
        this.ubicacion = ubicacion;
        this.observaciones = observaciones;
        this.inactivo = inactivo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(String placaBase) {
        this.placaBase = placaBase;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

   
    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isInactivo() {
        return inactivo;
    }

    public void setInactivo(boolean inactivo) {
        this.inactivo = inactivo;
    }
}

public class Vuelo {
    private String codigo;
    private String destino;
    private float precio;
    private int numplazas;
    private int numpasajeros;
    private String fecha;
    private Piloto piloto;

    public Vuelo(String codigo, String destino, float precio, int numplazas, int numpasajeros, String fecha, Piloto piloto) {
        this.codigo = codigo;
        this.destino = destino;
        this.precio = precio;
        this.numplazas = numplazas;
        this.numpasajeros = numpasajeros;
        this.fecha = fecha;
        this.piloto = piloto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public float getPrecio() {
        return precio;
    }

    public int getNumplazas() {
        return numplazas;
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public String getFecha() {
        return fecha;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNumplazas(int numplazas) {
        this.numplazas = numplazas;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public String toString(){
        return "Vuelo\nCódigo: " + getCodigo() + "\nDestino: " + getDestino() + "\nPrecio: " + getPrecio() +
                "\nNúmero de plazas: " + getNumplazas() + "\nNúmero de pasajeros: " + getNumpasajeros() +
                "\nFecha: " + getFecha() + "\nPiloto: " + getPiloto();
    }
}

public class Camioneta {
    private String marca;
    private String placas;
    private int anio;

    public Camioneta(String marca, String placas, int anio) {
        this.marca = marca;
        this.placas = placas;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                ", placas='" + placas + '\'' +
                ", anio='" + anio + '\''
                ;
    }
}

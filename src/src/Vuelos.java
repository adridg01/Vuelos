public class Vuelos {
    private String origen;
    private String destino;
    private String numero;
    private String dia;
    private String clase;
    public Vuelos(String origen, String destino, String numero, String dia, String clase){
        this.origen=origen;
        this.destino=destino;
        this.numero=numero;
        this.dia=dia;
        this.clase=clase;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getNumero() {
        return numero;
    }

    public String getDia() {
        return dia;
    }

    public String getClase() {
        return clase;
    }
    public static Vuelos Crearvuelo(String origen, String destino, String numero, String dia, String clase){
        return new Vuelos(origen,destino,numero,dia,clase);
    }

    @Override
    public String toString() {
        return "origen: " + origen + ", destino:" +  destino + ", numero:" + numero + ", dia:" + dia + ", clase:" + clase;
    }
}

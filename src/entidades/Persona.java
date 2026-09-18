package entidades;

public class Persona {

    private final String cedula;
    private final String codigoElectoral;
    private final String nombre;
    private final String primerApellido;
    private final String segundoApellido;
    private final String nombreCompleto;

    public Persona(String cedula, String codigoElectoral, String nombre, String primerApellido, String segundoApellido) {
        this.cedula = cedula;
        this.codigoElectoral = codigoElectoral;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombreCompleto = construirNombreCompleto(nombre, primerApellido, segundoApellido);
    }

    private String construirNombreCompleto(String nombre, String primerApellido, String segundoApellido) {
        return String.join(" ",
                valorSeguro(nombre),
                valorSeguro(primerApellido),
                valorSeguro(segundoApellido)).trim().replaceAll("\\s+", " ");
    }

    private String valorSeguro(String valor) {
        return valor == null ? "" : valor.trim();
    }

    public String getCedula() {
        return cedula;
    }

    public String getCodigoElectoral() {
        return codigoElectoral;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}

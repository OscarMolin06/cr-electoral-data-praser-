package dto;

public class SolicitudPadron {

    private final String cedula;
    private final FormatoSalida formatoSalida;

    public SolicitudPadron(String cedula, FormatoSalida formatoSalida) {
        this.cedula = cedula;
        this.formatoSalida = formatoSalida;
    }

    public String getCedula() {
        return cedula;
    }

    public FormatoSalida getFormatoSalida() {
        return formatoSalida;
    }
}

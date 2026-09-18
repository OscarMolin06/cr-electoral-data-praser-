package dto;

import entidades.Direccion;
import entidades.Persona;

public class RespuestaPadron {

    private final boolean exito;
    private final int codigoHttp;
    private final String mensaje;
    private final Persona persona;
    private final Direccion direccion;

    private RespuestaPadron(boolean exito, int codigoHttp, String mensaje, Persona persona, Direccion direccion) {
        this.exito = exito;
        this.codigoHttp = codigoHttp;
        this.mensaje = mensaje;
        this.persona = persona;
        this.direccion = direccion;
    }

    public static RespuestaPadron exito(Persona persona, Direccion direccion) {
        return new RespuestaPadron(true, 200, "Consulta exitosa", persona, direccion);
    }

    public static RespuestaPadron error(int codigoHttp, String mensaje) {
        return new RespuestaPadron(false, codigoHttp, mensaje, null, null);
    }

    public boolean isExito() {
        return exito;
    }

    public int getCodigoHttp() {
        return codigoHttp;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Persona getPersona() {
        return persona;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}

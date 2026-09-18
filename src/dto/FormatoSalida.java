package dto;

public enum FormatoSalida {
    JSON("application/json; charset=utf-8"),
    XML("application/xml; charset=utf-8");

    private final String contentType;

    FormatoSalida(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public static FormatoSalida desde(String valor) {
        if (valor == null || valor.isBlank()) {
            return JSON;
        }

        String normalizado = valor.trim().toUpperCase();
        for (FormatoSalida formato : values()) {
            if (formato.name().equals(normalizado)) {
                return formato;
            }
        }

        throw new IllegalArgumentException("Formato no soportado: " + valor);
    }
}

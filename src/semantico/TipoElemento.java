package semantico;

public enum TipoElemento {
    VAR,
    CTE;

    public static TipoElemento getVAR() {
        return VAR;
    }

    public static TipoElemento getCTE() {
        return CTE;
    }
}

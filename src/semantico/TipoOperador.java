package semantico;

public enum TipoOperador {
    ABRE_PAR,
    FECHA_PAR,
    ADD,
    SUB,
    MUL,
    DIV,
    OU,
    IGUAL,
    CONCAT;

    public static TipoOperador getABRE_PAR() {
        return ABRE_PAR;
    }

    public static TipoOperador getFECHA_PAR() {
        return FECHA_PAR;
    }

    public static TipoOperador getADD() {
        return ADD;
    }

    public static TipoOperador getSUB() {
        return SUB;
    }

    public static TipoOperador getMUL() {
        return MUL;
    }

    public static TipoOperador getDIV() {
        return DIV;
    }

    public static TipoOperador getOU() {
        return OU;
    }

    public static TipoOperador getIGUAL() {
        return IGUAL;
    }

    public static TipoOperador getCONCAT() {
        return CONCAT;
    }

}

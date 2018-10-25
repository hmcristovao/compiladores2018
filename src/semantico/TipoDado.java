package semantico;

public enum TipoDado {
    NUM,
    STR;
	
    public static TipoDado getTipoDado(TipoDado _tipo) {
        if (_tipo.equals(NUM)) return NUM;
        else return STR;
    }
    public static TipoDado getTipoDado(String _tipo) {
        if (_tipo.equals("NUMERO")) return NUM;
        else return STR;
    }
}
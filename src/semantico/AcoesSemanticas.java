package semantico;

import apoio.ErroSemantico;

public class AcoesSemanticas {

    public static void verificarInicializacao(Tabela tabela, String t, int l) {
        if (!(tabela.verificaExistenciaSimbolo(t))) {
            throw new ErroSemantico("Erro semântico variável " + t + " não foi declarada na linha " + l);
        }
    }

//    public static void adicionarTabela(Tabela tabela, String t, String tipo, int l) {
//        if ((tabela.verificaExistenciaSimbolo(t))) {
//            throw new ErroSemantico("Erro: variável " + t + " duplicada na linha " + l);
//        } else {
//            if (tipo.equals("NUMERO")) {
//                Simbolo simb = new Simbolo(t, , Tipo.NUMERO);
//                tabela.incluiSimbolo(simb);
//            } else {
//                Simbolo simb = new Simbolo(t, Tipo.PALAVRA);
//                tabela.incluiSimbolo(simb);
//
//            }
//        }
//    }
}

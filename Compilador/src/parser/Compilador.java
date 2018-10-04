/* Generated By:JavaCC: Do not edit this line. Compilador.java */
package parser;

import java.io.*;
import semantico.*;
import geradorCodigo.*;
import apoio.*;
import tratamentoErro.*;
import java.util.LinkedList;

public class Compilador implements CompiladorConstants {

  public static Tabela tab = new Tabela();

   public static void main(String args[])  throws ParseException  {
      Compilador compilador = null;

      try {

         compilador = new Compilador(new FileInputStream("exemplo20.spc"));
         Compilador.inicio();
         System.out.println("");
         Tabela.imprimeTabela();
      }
      catch(FileNotFoundException e)
      {
         System.err.println("Erro: arquivo nao encontrado");
      }
      catch(TokenMgrError e)
      {
         System.err.println("Erro lexico: " + e.getMessage());
      }
      catch(ParseException e)
      {
                System.err.println("Erro Sintatico: " + e.getMessage());
      }
      catch(ErroSemantico e)
      {
                System.err.println("Erro Semantico: " + e.getMessage());
      }
   }

//Gramatica de expressoes:
  static final public void iniciaExpressao() throws ParseException {
 Expressao exp = new Expressao();
    expressao(exp);
         exp.imprimeExpressao();
  }

  static final public void expressao(Expressao exp) throws ParseException {
 Token t ;TipoOperador operador = null;
    termo(exp);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OU:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      t = jj_consume_token(OU);
      termo(exp);
                exp.addListaExpPosFixa(operador.OU, t.image);
    }
  }

  static final public void termo(Expressao exp) throws ParseException {
 Token t; TipoOperador operador = null;
    termo1(exp);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IGUAL:
      t = jj_consume_token(IGUAL);
      termo1(exp);
                exp.addListaExpPosFixa(operador.IGUAL, t.image);
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
  }

  static final public void termo1(Expressao exp) throws ParseException {
 Token t; TipoOperador operador = null;
    termo2(exp);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CONCAT:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      t = jj_consume_token(CONCAT);
      termo2(exp);
                exp.addListaExpPosFixa(operador.CONCAT, t.image);
    }
  }

  static final public void termo2(Expressao exp) throws ParseException {
 Token t; TipoOperador operador;
    termo3(exp);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SOMA:
      case SUB:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SOMA:
        t = jj_consume_token(SOMA);
                                  operador = TipoOperador.SOMA;
        break;
      case SUB:
        t = jj_consume_token(SUB);
                                                                              operador = TipoOperador.SUB;
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      termo3(exp);
                exp.addListaExpPosFixa(operador, t.image);
    }
  }

  static final public void termo3(Expressao exp) throws ParseException {
 Token t; TipoOperador operador;
    termo4(exp);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MUL:
      case DIV:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MUL:
        t = jj_consume_token(MUL);
                            operador = TipoOperador.MUL;
        break;
      case DIV:
        t = jj_consume_token(DIV);
                                                                       operador = TipoOperador.DIV;
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      termo4(exp);
        exp.addListaExpPosFixa(operador, t.image);
    }
  }

  static final public void termo4(Expressao exp) throws ParseException {
        Token var, entrada, sinal;
        TipoDado tipo = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AP:
      jj_consume_token(AP);
      expressao(exp);
      jj_consume_token(FP);
      break;
    case NUM:
      entrada = jj_consume_token(NUM);
        exp.addListaExpPosFixa(tipo.NUMERO, entrada.image);
      break;
    case SOMA:
      jj_consume_token(SOMA);
      entrada = jj_consume_token(NUM);
        exp.addListaExpPosFixa(tipo.NUMERO, entrada.image);
      break;
    case SUB:
      sinal = jj_consume_token(SUB);
      entrada = jj_consume_token(NUM);
        exp.addListaExpPosFixa(tipo.NUMERO, (sinal.image+entrada.image));
      break;
    case VAR:
      var = jj_consume_token(VAR);
        AcoesSemanticas.verificaVariavelDeclarada(tab, var.image);
        exp.addListaExpPosFixa(tab.tipoVariavel(var.image), var.image);
      break;
    case STRING:
      entrada = jj_consume_token(STRING);
        exp.addListaExpPosFixa(tipo.PALAVRA, entrada.image);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

//GRAMATICA COMPLETA
  static final public void inicio() throws ParseException {
    programa();
    jj_consume_token(0);
  }

  static final public void programa() throws ParseException {
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EXIBE:
      case LEITURA:
      case SE:
      case ENQUANTO:
      case NUMERO:
      case PALAVRA:
      case VAR:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_5;
      }
      comando();
    }
  }

  static final public void comando() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VAR:
      atribuicao();
      break;
    case NUMERO:
    case PALAVRA:
      declaracao();
      break;
    case SE:
      se();
      break;
    case ENQUANTO:
      enquanto();
      break;
    case LEITURA:
      le();
      break;
    case EXIBE:
      exibe();
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void atribuicao() throws ParseException {
    jj_consume_token(VAR);
    jj_consume_token(ATRIB);
    iniciaExpressao();
    jj_consume_token(PV);
  }

  static final public void declaracao() throws ParseException {
        Token tipo, variavel;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      tipo = jj_consume_token(NUMERO);
      break;
    case PALAVRA:
      tipo = jj_consume_token(PALAVRA);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    variavel = jj_consume_token(VAR);
                Tabela.insereNaTabela(tab, variavel.image, tipo.image);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ATRIB:
      jj_consume_token(ATRIB);
      iniciaExpressao();
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULA:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_6;
      }
      jj_consume_token(VIRGULA);
      variavel = jj_consume_token(VAR);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ATRIB:
        jj_consume_token(ATRIB);
        iniciaExpressao();
        break;
      default:
        jj_la1[13] = jj_gen;
        ;
      }
                Tabela.insereNaTabela(tab, variavel.image, tipo.image);
    }
    jj_consume_token(PV);
  }

  static final public void se() throws ParseException {
    jj_consume_token(SE);
    jj_consume_token(AP);
    iniciaExpressao();
    jj_consume_token(FP);
    programa();
    jj_consume_token(FIMSE);
  }

  static final public void enquanto() throws ParseException {
    jj_consume_token(ENQUANTO);
    jj_consume_token(AP);
    iniciaExpressao();
    jj_consume_token(FP);
    programa();
    jj_consume_token(FIMENQUANTO);
  }

  static final public void le() throws ParseException {
    jj_consume_token(LEITURA);
    jj_consume_token(VAR);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULA:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_7;
      }
      jj_consume_token(VIRGULA);
      jj_consume_token(VAR);
    }
    jj_consume_token(PV);
  }

  static final public void exibe() throws ParseException {
    jj_consume_token(EXIBE);
    iniciaExpressao();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULA:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_8;
      }
      jj_consume_token(VIRGULA);
      iniciaExpressao();
    }
    jj_consume_token(PV);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[16];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x4000000,0x10000000,0x20000000,0xc00000,0xc00000,0x3000000,0x3000000,0xec4000,0x81ae0,0x81ae0,0x1800,0x8000000,0x20000,0x8000000,0x20000,0x20000,};
   }

  /** Constructor with InputStream. */
  public Compilador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Compilador(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Compilador(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Compilador(CompiladorTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompiladorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[30];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 16; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 30; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}

/* Generated By:JavaCC: Do not edit this line. Compilador.java */
package javacc;
import java.util.ArrayList;

public class Compilador implements CompiladorConstants {
        public static ArrayList<String> tablaTok = new ArrayList();

  final public void Programa() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTMAIN:
      case USINGNMST:
      case RETURN:
      case SUMA:
      case RESTA:
      case MULTI:
      case DIVI:
      case INCREMENTO:
      case DECREMENTO:
      case MODU:
      case IGUALACION:
      case PORIGUAL:
      case DIVIIGUAL:
      case SUMIGUAL:
      case RETIGUAL:
      case MINIGUAL:
      case IGUAL:
      case MENORIGUAL:
      case MAYORIGUAL:
      case DIFFERENT:
      case MAYOR:
      case MENOR:
      case AND:
      case OR:
      case NOT:
      case CAPTURA:
      case IMPRESION:
      case ENTCIN:
      case SALCOUT:
      case ENDL:
      case ESTANDAR:
      case FUNCIONMAT:
      case MATRIZ:
      case CADENA:
      case LISTA:
      case INCLUIR:
      case DEFINIR:
      case CONIF:
      case CONELSE:
      case CONSWITCH:
      case OPCASE:
      case FOR:
      case WHILE:
      case DOWHILE:
      case TYPEINT:
      case TYPELONG:
      case TYPEBOOLEAN:
      case TYPECHAR:
      case TYPEFLOAT:
      case TYPEDOUBLE:
      case VALCHAR:
      case VALFLOAT:
      case VALINT:
      case VALLONG:
      case VALDOUBLE:
      case VALBOOL:
      case VALSHORT:
      case VARIABLE:
      case COMA:
      case LIMITANTE:
      case PUNTUAR:
      case PARIZQ:
      case PARDER:
      case CORIZQ:
      case CORDER:
      case LLAIZQ:
      case LLADER:
      case ERROR:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TYPEINT:
        jj_consume_token(TYPEINT);
        break;
      case TYPELONG:
        jj_consume_token(TYPELONG);
        break;
      case TYPEBOOLEAN:
        jj_consume_token(TYPEBOOLEAN);
        break;
      case TYPECHAR:
        jj_consume_token(TYPECHAR);
        break;
      case TYPEFLOAT:
        jj_consume_token(TYPEFLOAT);
        break;
      case TYPEDOUBLE:
        jj_consume_token(TYPEDOUBLE);
        break;
      case INTMAIN:
        jj_consume_token(INTMAIN);
        break;
      case USINGNMST:
        jj_consume_token(USINGNMST);
        break;
      case SUMA:
        jj_consume_token(SUMA);
        break;
      case RESTA:
        jj_consume_token(RESTA);
        break;
      case MULTI:
        jj_consume_token(MULTI);
        break;
      case DIVI:
        jj_consume_token(DIVI);
        break;
      case INCREMENTO:
        jj_consume_token(INCREMENTO);
        break;
      case DECREMENTO:
        jj_consume_token(DECREMENTO);
        break;
      case MODU:
        jj_consume_token(MODU);
        break;
      case IGUALACION:
        jj_consume_token(IGUALACION);
        break;
      case PORIGUAL:
        jj_consume_token(PORIGUAL);
        break;
      case DIVIIGUAL:
        jj_consume_token(DIVIIGUAL);
        break;
      case SUMIGUAL:
        jj_consume_token(SUMIGUAL);
        break;
      case RETIGUAL:
        jj_consume_token(RETIGUAL);
        break;
      case MINIGUAL:
        jj_consume_token(MINIGUAL);
        break;
      case IGUAL:
        jj_consume_token(IGUAL);
        break;
      case MENORIGUAL:
        jj_consume_token(MENORIGUAL);
        break;
      case MAYORIGUAL:
        jj_consume_token(MAYORIGUAL);
        break;
      case DIFFERENT:
        jj_consume_token(DIFFERENT);
        break;
      case MAYOR:
        jj_consume_token(MAYOR);
        break;
      case MENOR:
        jj_consume_token(MENOR);
        break;
      case AND:
        jj_consume_token(AND);
        break;
      case OR:
        jj_consume_token(OR);
        break;
      case NOT:
        jj_consume_token(NOT);
        break;
      case CAPTURA:
        jj_consume_token(CAPTURA);
        break;
      case IMPRESION:
        jj_consume_token(IMPRESION);
        break;
      case ESTANDAR:
        jj_consume_token(ESTANDAR);
        break;
      case FUNCIONMAT:
        jj_consume_token(FUNCIONMAT);
        break;
      case MATRIZ:
        jj_consume_token(MATRIZ);
        break;
      case CADENA:
        jj_consume_token(CADENA);
        break;
      case LISTA:
        jj_consume_token(LISTA);
        break;
      case INCLUIR:
        jj_consume_token(INCLUIR);
        break;
      case DEFINIR:
        jj_consume_token(DEFINIR);
        break;
      case CONIF:
        jj_consume_token(CONIF);
        break;
      case CONELSE:
        jj_consume_token(CONELSE);
        break;
      case CONSWITCH:
        jj_consume_token(CONSWITCH);
        break;
      case OPCASE:
        jj_consume_token(OPCASE);
        break;
      case FOR:
        jj_consume_token(FOR);
        break;
      case WHILE:
        jj_consume_token(WHILE);
        break;
      case DOWHILE:
        jj_consume_token(DOWHILE);
        break;
      case VALCHAR:
        jj_consume_token(VALCHAR);
        break;
      case VALFLOAT:
        jj_consume_token(VALFLOAT);
        break;
      case VALINT:
        jj_consume_token(VALINT);
        break;
      case VALLONG:
        jj_consume_token(VALLONG);
        break;
      case VALDOUBLE:
        jj_consume_token(VALDOUBLE);
        break;
      case VALBOOL:
        jj_consume_token(VALBOOL);
        break;
      case VALSHORT:
        jj_consume_token(VALSHORT);
        break;
      case COMA:
        jj_consume_token(COMA);
        break;
      case LIMITANTE:
        jj_consume_token(LIMITANTE);
        break;
      case PUNTUAR:
        jj_consume_token(PUNTUAR);
        break;
      case PARIZQ:
        jj_consume_token(PARIZQ);
        break;
      case ERROR:
        jj_consume_token(ERROR);
        break;
      case PARDER:
        jj_consume_token(PARDER);
        break;
      case CORIZQ:
        jj_consume_token(CORIZQ);
        break;
      case CORDER:
        jj_consume_token(CORDER);
        break;
      case LLAIZQ:
        jj_consume_token(LLAIZQ);
        break;
      case LLADER:
        jj_consume_token(LLADER);
        break;
      case RETURN:
        jj_consume_token(RETURN);
        break;
      case ENTCIN:
        jj_consume_token(ENTCIN);
        break;
      case SALCOUT:
        jj_consume_token(SALCOUT);
        break;
      case VARIABLE:
        jj_consume_token(VARIABLE);
        break;
      case ENDL:
        jj_consume_token(ENDL);
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
  }

  /** Generated Token Manager. */
  public CompiladorTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xfffffffe,0xfffffffe,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0xffffffff,0xffffffff,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x2f,0x2f,};
   }

  /** Constructor with InputStream. */
  public Compilador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Compilador(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Compilador(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Compilador(CompiladorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompiladorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
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
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[75];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 75; i++) {
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
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}

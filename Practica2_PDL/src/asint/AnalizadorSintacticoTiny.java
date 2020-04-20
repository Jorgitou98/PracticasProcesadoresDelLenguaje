
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140220
// Sun Apr 19 20:12:40 CEST 2020
//----------------------------------------------------

package asint;

import java_cup.runtime.*;
import alex.AnalizadorLexicoTiny;
import alex.UnidadLexica;
import errors.GestionErroresTiny;
import java_cup.runtime.ComplexSymbolFactory.Location;

/** CUP v0.11b beta 20140220 generated parser.
  * @version Sun Apr 19 20:12:40 CEST 2020
  */
public class AnalizadorSintacticoTiny extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintacticoTiny() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoTiny(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoTiny(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\002\003\000\002\002\004\000\002\002" +
    "\002\000\002\003\005\000\002\003\003\000\002\004\005" +
    "\000\002\004\003\000\002\005\005\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\005\005\000\002" +
    "\005\005\000\002\005\003\000\002\006\004\000\002\006" +
    "\004\000\002\006\003\000\002\007\005\000\002\007\005" +
    "\000\002\007\003\000\002\010\005\000\002\010\005\000" +
    "\002\010\005\000\002\010\003\000\002\011\004\000\002" +
    "\011\003\000\002\012\006\000\002\012\005\000\002\012" +
    "\003\000\002\013\003\000\002\013\003\000\002\013\003" +
    "\000\002\013\003\000\002\013\003\000\002\013\003\000" +
    "\002\013\005\000\002\014\003\000\002\015\011\000\002" +
    "\015\015" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\106\000\006\002\uffff\013\005\001\002\000\004\002" +
    "\110\001\002\000\004\037\010\001\002\000\006\002\001" +
    "\042\001\001\002\000\006\002\uffdd\042\uffdd\001\002\000" +
    "\026\010\016\011\027\030\031\031\032\032\026\034\014" +
    "\037\030\043\012\044\033\056\011\001\002\000\022\010" +
    "\016\011\027\030\031\031\032\032\026\034\014\037\030" +
    "\056\011\001\002\000\022\010\016\011\027\030\031\031" +
    "\032\032\026\034\014\037\030\056\011\001\002\000\044" +
    "\025\uffe5\035\uffe5\036\uffe5\040\uffe5\043\uffe5\044\uffe5\045" +
    "\uffe5\046\uffe5\047\uffe5\050\uffe5\051\uffe5\052\uffe5\053\uffe5" +
    "\054\uffe5\055\uffe5\057\uffe5\060\uffe5\001\002\000\044\025" +
    "\uffdf\035\uffdf\036\uffdf\040\uffdf\043\uffdf\044\uffdf\045\uffdf" +
    "\046\uffdf\047\uffdf\050\uffdf\051\uffdf\052\uffdf\053\uffdf\054" +
    "\uffdf\055\uffdf\057\uffdf\060\uffdf\001\002\000\044\025\101" +
    "\035\102\036\uffe8\040\uffe8\043\uffe8\044\uffe8\045\uffe8\046" +
    "\uffe8\047\uffe8\050\uffe8\051\uffe8\052\uffe8\053\uffe8\054\uffe8" +
    "\055\uffe8\057\uffe8\060\uffe8\001\002\000\044\025\uffe1\035" +
    "\uffe1\036\uffe1\040\uffe1\043\uffe1\044\uffe1\045\uffe1\046\uffe1" +
    "\047\uffe1\050\uffe1\051\uffe1\052\uffe1\053\uffe1\054\uffe1\055" +
    "\uffe1\057\uffe1\060\uffe1\001\002\000\040\036\uffea\040\uffea" +
    "\043\uffea\044\uffea\045\uffea\046\uffea\047\uffea\050\uffea\051" +
    "\uffea\052\uffea\053\uffea\054\uffea\055\uffea\057\uffea\060\uffea" +
    "\001\002\000\040\036\uffee\040\uffee\043\uffee\044\uffee\045" +
    "\041\046\042\047\040\050\uffee\051\uffee\052\uffee\053\uffee" +
    "\054\uffee\055\uffee\057\uffee\060\uffee\001\002\000\032\036" +
    "\ufff1\040\ufff1\043\036\044\035\050\ufff1\051\ufff1\052\ufff1" +
    "\053\ufff1\054\ufff1\055\ufff1\057\ufff1\060\ufff1\001\002\000" +
    "\026\036\ufff4\040\ufff4\050\071\051\070\052\066\053\072" +
    "\054\065\055\067\057\ufff4\060\ufff4\001\002\000\012\036" +
    "\ufffb\040\ufffb\057\063\060\ufffb\001\002\000\010\036\ufffd" +
    "\040\ufffd\060\061\001\002\000\004\040\051\001\002\000" +
    "\044\025\uffe2\035\uffe2\036\uffe2\040\uffe2\043\uffe2\044\uffe2" +
    "\045\uffe2\046\uffe2\047\uffe2\050\uffe2\051\uffe2\052\uffe2\053" +
    "\uffe2\054\uffe2\055\uffe2\057\uffe2\060\uffe2\001\002\000\044" +
    "\025\uffe0\035\uffe0\036\uffe0\040\uffe0\043\uffe0\044\uffe0\045" +
    "\uffe0\046\uffe0\047\uffe0\050\uffe0\051\uffe0\052\uffe0\053\uffe0" +
    "\054\uffe0\055\uffe0\057\uffe0\060\uffe0\001\002\000\026\010" +
    "\016\011\027\030\031\031\032\032\026\034\014\037\030" +
    "\043\012\044\033\056\011\001\002\000\044\025\uffe4\035" +
    "\uffe4\036\uffe4\040\uffe4\043\uffe4\044\uffe4\045\uffe4\046\uffe4" +
    "\047\uffe4\050\uffe4\051\uffe4\052\uffe4\053\uffe4\054\uffe4\055" +
    "\uffe4\057\uffe4\060\uffe4\001\002\000\044\025\uffe3\035\uffe3" +
    "\036\uffe3\040\uffe3\043\uffe3\044\uffe3\045\uffe3\046\uffe3\047" +
    "\uffe3\050\uffe3\051\uffe3\052\uffe3\053\uffe3\054\uffe3\055\uffe3" +
    "\057\uffe3\060\uffe3\001\002\000\022\010\016\011\027\030" +
    "\031\031\032\032\026\034\014\037\030\056\011\001\002" +
    "\000\032\036\ufff3\040\ufff3\043\036\044\035\050\ufff3\051" +
    "\ufff3\052\ufff3\053\ufff3\054\ufff3\055\ufff3\057\ufff3\060\ufff3" +
    "\001\002\000\022\010\016\011\027\030\031\031\032\032" +
    "\026\034\014\037\030\056\011\001\002\000\022\010\016" +
    "\011\027\030\031\031\032\032\026\034\014\037\030\056" +
    "\011\001\002\000\040\036\ufff0\040\ufff0\043\ufff0\044\ufff0" +
    "\045\041\046\042\047\040\050\ufff0\051\ufff0\052\ufff0\053" +
    "\ufff0\054\ufff0\055\ufff0\057\ufff0\060\ufff0\001\002\000\022" +
    "\010\016\011\027\030\031\031\032\032\026\034\014\037" +
    "\030\056\011\001\002\000\022\010\016\011\027\030\031" +
    "\031\032\032\026\034\014\037\030\056\011\001\002\000" +
    "\022\010\016\011\027\030\031\031\032\032\026\034\014" +
    "\037\030\056\011\001\002\000\040\036\uffec\040\uffec\043" +
    "\uffec\044\uffec\045\uffec\046\uffec\047\uffec\050\uffec\051\uffec" +
    "\052\uffec\053\uffec\054\uffec\055\uffec\057\uffec\060\uffec\001" +
    "\002\000\040\036\uffed\040\uffed\043\uffed\044\uffed\045\uffed" +
    "\046\uffed\047\uffed\050\uffed\051\uffed\052\uffed\053\uffed\054" +
    "\uffed\055\uffed\057\uffed\060\uffed\001\002\000\040\036\uffeb" +
    "\040\uffeb\043\uffeb\044\uffeb\045\uffeb\046\uffeb\047\uffeb\050" +
    "\uffeb\051\uffeb\052\uffeb\053\uffeb\054\uffeb\055\uffeb\057\uffeb" +
    "\060\uffeb\001\002\000\040\036\uffef\040\uffef\043\uffef\044" +
    "\uffef\045\041\046\042\047\040\050\uffef\051\uffef\052\uffef" +
    "\053\uffef\054\uffef\055\uffef\057\uffef\060\uffef\001\002\000" +
    "\004\040\050\001\002\000\044\025\uffde\035\uffde\036\uffde" +
    "\040\uffde\043\uffde\044\uffde\045\uffde\046\uffde\047\uffde\050" +
    "\uffde\051\uffde\052\uffde\053\uffde\054\uffde\055\uffde\057\uffde" +
    "\060\uffde\001\002\000\004\041\052\001\002\000\006\013" +
    "\005\042\uffff\001\002\000\004\042\054\001\002\000\010" +
    "\002\uffdc\014\055\042\uffdc\001\002\000\004\041\056\001" +
    "\002\000\006\013\005\042\uffff\001\002\000\004\042\060" +
    "\001\002\000\006\002\uffdb\042\uffdb\001\002\000\026\010" +
    "\016\011\027\030\031\031\032\032\026\034\014\037\030" +
    "\043\012\044\033\056\011\001\002\000\006\036\ufffe\040" +
    "\ufffe\001\002\000\026\010\016\011\027\030\031\031\032" +
    "\032\026\034\014\037\030\043\012\044\033\056\011\001" +
    "\002\000\010\036\ufffc\040\ufffc\060\ufffc\001\002\000\026" +
    "\010\016\011\027\030\031\031\032\032\026\034\014\037" +
    "\030\043\012\044\033\056\011\001\002\000\026\010\016" +
    "\011\027\030\031\031\032\032\026\034\014\037\030\043" +
    "\012\044\033\056\011\001\002\000\026\010\016\011\027" +
    "\030\031\031\032\032\026\034\014\037\030\043\012\044" +
    "\033\056\011\001\002\000\026\010\016\011\027\030\031" +
    "\031\032\032\026\034\014\037\030\043\012\044\033\056" +
    "\011\001\002\000\026\010\016\011\027\030\031\031\032" +
    "\032\026\034\014\037\030\043\012\044\033\056\011\001" +
    "\002\000\026\010\016\011\027\030\031\031\032\032\026" +
    "\034\014\037\030\043\012\044\033\056\011\001\002\000" +
    "\012\036\ufff9\040\ufff9\057\ufff9\060\ufff9\001\002\000\012" +
    "\036\ufff7\040\ufff7\057\ufff7\060\ufff7\001\002\000\012\036" +
    "\ufff6\040\ufff6\057\ufff6\060\ufff6\001\002\000\012\036\ufffa" +
    "\040\ufffa\057\ufffa\060\ufffa\001\002\000\012\036\ufff8\040" +
    "\ufff8\057\ufff8\060\ufff8\001\002\000\012\036\ufff5\040\ufff5" +
    "\057\ufff5\060\ufff5\001\002\000\004\034\105\001\002\000" +
    "\026\010\016\011\027\030\031\031\032\032\026\034\014" +
    "\037\030\043\012\044\033\056\011\001\002\000\004\036" +
    "\104\001\002\000\044\025\uffe7\035\uffe7\036\uffe7\040\uffe7" +
    "\043\uffe7\044\uffe7\045\uffe7\046\uffe7\047\uffe7\050\uffe7\051" +
    "\uffe7\052\uffe7\053\uffe7\054\uffe7\055\uffe7\057\uffe7\060\uffe7" +
    "\001\002\000\044\025\uffe6\035\uffe6\036\uffe6\040\uffe6\043" +
    "\uffe6\044\uffe6\045\uffe6\046\uffe6\047\uffe6\050\uffe6\051\uffe6" +
    "\052\uffe6\053\uffe6\054\uffe6\055\uffe6\057\uffe6\060\uffe6\001" +
    "\002\000\032\036\ufff2\040\ufff2\043\036\044\035\050\ufff2" +
    "\051\ufff2\052\ufff2\053\ufff2\054\ufff2\055\ufff2\057\ufff2\060" +
    "\ufff2\001\002\000\040\036\uffe9\040\uffe9\043\uffe9\044\uffe9" +
    "\045\uffe9\046\uffe9\047\uffe9\050\uffe9\051\uffe9\052\uffe9\053" +
    "\uffe9\054\uffe9\055\uffe9\057\uffe9\060\uffe9\001\002\000\004" +
    "\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\106\000\010\002\003\014\005\015\006\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\024\003\024\004\023\005\022\006\021\007" +
    "\020\010\017\011\016\012\014\013\012\001\001\000\010" +
    "\011\106\012\014\013\012\001\001\000\014\007\105\010" +
    "\017\011\016\012\014\013\012\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\024\003\046" +
    "\004\023\005\022\006\021\007\020\010\017\011\016\012" +
    "\014\013\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\007\033\010\017\011\016\012\014\013\012\001" +
    "\001\000\002\001\001\000\012\010\045\011\016\012\014" +
    "\013\012\001\001\000\012\010\036\011\016\012\014\013" +
    "\012\001\001\000\002\001\001\000\010\011\044\012\014" +
    "\013\012\001\001\000\010\011\043\012\014\013\012\001" +
    "\001\000\010\011\042\012\014\013\012\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\002\052\014\005\015\006\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\002\056" +
    "\014\005\015\006\001\001\000\002\001\001\000\002\001" +
    "\001\000\024\003\061\004\023\005\022\006\021\007\020" +
    "\010\017\011\016\012\014\013\012\001\001\000\002\001" +
    "\001\000\022\004\063\005\022\006\021\007\020\010\017" +
    "\011\016\012\014\013\012\001\001\000\002\001\001\000" +
    "\016\006\077\007\020\010\017\011\016\012\014\013\012" +
    "\001\001\000\016\006\076\007\020\010\017\011\016\012" +
    "\014\013\012\001\001\000\016\006\075\007\020\010\017" +
    "\011\016\012\014\013\012\001\001\000\016\006\074\007" +
    "\020\010\017\011\016\012\014\013\012\001\001\000\016" +
    "\006\073\007\020\010\017\011\016\012\014\013\012\001" +
    "\001\000\016\006\072\007\020\010\017\011\016\012\014" +
    "\013\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\024\003\102\004\023\005" +
    "\022\006\021\007\020\010\017\011\016\012\014\013\012" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintacticoTiny$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintacticoTiny$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalizadorSintacticoTiny$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 
   errores = new GestionErroresTiny();
   AnalizadorLexicoTiny alex = (AnalizadorLexicoTiny)getScanner();
   alex.fijaGestionErrores(errores);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return getScanner().next_token(); 
    }

 
   private GestionErroresTiny errores;
   public void syntax_error(Symbol unidadLexica) {
     errores.errorSintactico((UnidadLexica)unidadLexica);
   }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintacticoTiny$actions {
  private final AnalizadorSintacticoTiny parser;

  /** Constructor */
  CUP$AnalizadorSintacticoTiny$actions(AnalizadorSintacticoTiny parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$do_action_part00000000(
    int                        CUP$AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintacticoTiny$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= Ins 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("S",0, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintacticoTiny$stack.elementAt(CUP$AnalizadorSintacticoTiny$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintacticoTiny$parser.done_parsing();
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // S ::= 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("S",0, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // E0 ::= E1 OR E0 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E0",1, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // E0 ::= E1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E0",1, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // E1 ::= E2 AND E1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E1",2, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // E1 ::= E2 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E1",2, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // E2 ::= E3 DIST E3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // E2 ::= E3 MEI E3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // E2 ::= E3 MAI E3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // E2 ::= E3 MAYOR E3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E2 ::= E3 MENOR E3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // E2 ::= E3 IGIG E3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // E2 ::= E3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // E3 ::= RESTA E4 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E3",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // E3 ::= SUMA E4 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E3",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // E3 ::= E4 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E3",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // E4 ::= E4 SUMA E5 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E4",5, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // E4 ::= E4 RESTA E5 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E4",5, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // E4 ::= E5 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E4",5, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // E5 ::= E5 MULT E6 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E5",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // E5 ::= E5 DIV E6 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E5",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // E5 ::= E5 MOD E6 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E5",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // E5 ::= E6 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E5",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // E6 ::= NEG E6 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E6",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // E6 ::= E7 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E6",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // E7 ::= E7 CA E0 CC 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E7",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // E7 ::= E7 PUNTO IDEN 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E7",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // E7 ::= E8 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E7",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // E8 ::= ENTERO 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E8",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // E8 ::= REAL 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E8",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // E8 ::= CARACTER 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E8",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // E8 ::= TRUE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E8",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // E8 ::= FALSE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E8",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // E8 ::= IDEN 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E8",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // E8 ::= PA E0 PC 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E8",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Ins ::= InsIf 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Ins",10, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // InsIf ::= IF PA E0 PC LLA S LLC 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("InsIf",11, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // InsIf ::= IF PA E0 PC LLA S LLC ELSE LLA S LLC 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("InsIf",11, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalizadorSintacticoTiny$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$do_action(
    int                        CUP$AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
              return CUP$AnalizadorSintacticoTiny$do_action_part00000000(
                               CUP$AnalizadorSintacticoTiny$act_num,
                               CUP$AnalizadorSintacticoTiny$parser,
                               CUP$AnalizadorSintacticoTiny$stack,
                               CUP$AnalizadorSintacticoTiny$top);
    }
}


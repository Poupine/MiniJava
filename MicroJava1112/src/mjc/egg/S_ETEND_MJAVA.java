package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_ETEND_MJAVA {
LEX_MJAVA scanner;
  S_ETEND_MJAVA() {
    }
  S_ETEND_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle7() throws Exception {

    //declaration
    //appel
  }
  private void regle8() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_etend);
    x_3.analyser(LEX_MJAVA.token_ident);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_implemente : // 1335
        regle7 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1319
        regle7 () ;
      break ;
      case LEX_MJAVA.token_etend : // 1334
        regle8 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }

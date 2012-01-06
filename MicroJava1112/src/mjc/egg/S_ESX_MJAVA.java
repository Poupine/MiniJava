package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ESX_MJAVA {
LEX_MJAVA scanner;
  S_ESX_MJAVA() {
    }
  S_ESX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle51() throws Exception {

    //declaration
    S_OPADD_MJAVA x_2 = new S_OPADD_MJAVA(scanner) ;
    S_T_MJAVA x_3 = new S_T_MJAVA(scanner) ;
    S_ESX_MJAVA x_4 = new S_ESX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
  private void regle52() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_plus : // 119
        regle51 () ;
      break ;
      case LEX_MJAVA.token_moins : // 120
        regle51 () ;
      break ;
      case LEX_MJAVA.token_ou : // 121
        regle51 () ;
      break ;
      case LEX_MJAVA.token_inf : // 113
        regle52 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 114
        regle52 () ;
      break ;
      case LEX_MJAVA.token_sup : // 115
        regle52 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 116
        regle52 () ;
      break ;
      case LEX_MJAVA.token_eg : // 117
        regle52 () ;
      break ;
      case LEX_MJAVA.token_neg : // 118
        regle52 () ;
      break ;
      case LEX_MJAVA.token_affect : // 100
        regle52 () ;
      break ;
      case LEX_MJAVA.token_virg : // 97
        regle52 () ;
      break ;
      case LEX_MJAVA.token_pv : // 98
        regle52 () ;
      break ;
      case LEX_MJAVA.token_parf : // 92
        regle52 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }

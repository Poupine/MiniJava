package mjc.egg;
public class S_DEFCLASSE_MJAVA {
LEX_MJAVA scanner;
  S_DEFCLASSE_MJAVA() {
    }
  S_DEFCLASSE_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle4() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_SUPER_MJAVA x_4 = new S_SUPER_MJAVA(scanner) ;
    S_CORPS_MJAVA x_5 = new S_CORPS_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_classe);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
    x_5.analyser() ;
  }
  public void analyser () throws Exception {
    regle4 () ;
  }
  }

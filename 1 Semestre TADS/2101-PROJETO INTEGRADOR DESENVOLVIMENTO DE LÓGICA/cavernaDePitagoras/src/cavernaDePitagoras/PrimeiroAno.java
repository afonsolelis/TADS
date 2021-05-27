
package cavernaDePitagoras;

import java.util.HashMap;

/*
A classe jogador foi criada para tirar mais responsabilidades da Interface;
Alta dependência da classe Pergunta;
*/

public class PrimeiroAno {

    private int totalRespondidas;
    private int totalAcertos;
    HashMap hashPergs;
    
    
    /*
    * Hash map utilizada para guardar as perguntas, randomizar e evitar null;
    */
    public PrimeiroAno(){
        hashPergs = new HashMap();
        
        Funcoes p1 = new Funcoes("<html>Sabendo que log3(7x - 1) = 3 e que log2(y3 + 3) = 7 pode-se afirmar que <br> logy(x2 + 9) é igual a:</html>",
            "a)6  b)2   c)4   d)-2","b");
        
        Funcoes p2 = new Funcoes("Se loga b = 3 e logab c = 4, então loga c é:",
            "a)12   b)16   c)24  d)8 ","b");
        
        Funcoes p3 = new Funcoes("Se log5 x = 2 e log10 y = 4, então log20 y/x é:",
            "a)2   b)4 c)6 d)8","d");
        
        Funcoes p4 = new Funcoes("<html>Se 10x = 20y , atribuindo 0,3 para log 2 , <br>então o valor de x/y é:</html>",
            "a)0,1  b)0,7  c)0,5  d)0,3","d");
        
        Funcoes p5 = new Funcoes("Atribuindo para log 2 o valor 0,3, então o valor de 1000,3 é:",
            "a)8 b)3  c)4  d)10","a");
        
        hashPergs.put(1,p1);
        hashPergs.put(2,p2);
        hashPergs.put(3,p3);
        hashPergs.put(4,p4);
        hashPergs.put(5,p5);
    }
    
    public HashMap gethashPergs() {
        return hashPergs;
    }
    
    public void sethashPergs(HashMap hashPergs) {
        this.hashPergs = hashPergs;
    } 
}

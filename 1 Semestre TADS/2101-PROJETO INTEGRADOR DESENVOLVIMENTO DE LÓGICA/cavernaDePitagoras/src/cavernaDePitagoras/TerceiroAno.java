
package cavernaDePitagoras;
import java.util.HashMap;

public class TerceiroAno {
    private int totalRespondidas;
    private int totalAcertos;
    HashMap hashPergs;
    
    
    /*
    * Hash map utilizada para guardar as perguntas, randomizar e evitar null;
    */
    public TerceiroAno(){
        hashPergs = new HashMap();
        
        Funcoes p1 = new Funcoes("Se x – y = 2 e x2 + y2 = 8, então x3 – y3 é igual a",
            "a)12.  b)14. c)18.  d)20. ","b");
         
        Funcoes p2 = new Funcoes("Se x + y = 13 e x · y = 1, então x2 + y2 é:",
            "a)166  b)169  c)172  d)167 ","d");
         
        Funcoes p3 = new Funcoes("<html>Uma compra no valor de 1.000 <br>reais será paga com uma entrada de 600 reais e uma <br>mensalidade de 420 reais. A taxa de juros <br>aplicada na mensalidade é igual a:</html>",
            "a)2 %.  b)8 %.  c)5 %.  d)10 %. ","c");
         
        Funcoes p4 = new Funcoes("<html>Uma compra no valor de 1.000 <br>reais será paga com uma entrada de 600 reais e <br>uma mensalidade de 420 reais. A taxa de juros aplicada <br>na mensalidade é igual a:</html>",
            "a)2%  b)8%  c)5%  d)10% ","c");
         
        Funcoes p5 = new Funcoes("<html>Sabendo-se que x = 2 é um<br> zero do polinômio p(x) = 9x³ − 21x² + 4x + 4, é <br>correto afirmar que a soma das outras duas raízes é <br>igual a:</html>",
            "a)1/3  b)3/7  c)1  d)4/21 ","a");
        
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
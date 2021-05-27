
package cavernaDePitagoras;
import java.util.HashMap;

public class Vestibular {
    private int totalRespondidas;
    private int totalAcertos;
    HashMap hashPergs;
    
    
    /*
    * Hash map utilizada para guardar as perguntas, randomizar e evitar null;
    */
    public Vestibular(){
        hashPergs = new HashMap();
        
        Funcoes p1 = new Funcoes("<html>Considere o <br>polinômio cúbico p(x) = x3 + x2 − ax − 3, <br>onde a é um número real. Sabendo que r e −r são raízes reais de p(x),<br> podemos afirmar que p(1) é igual a:</html>",
            "a)-2.  b)-4.  c)1.  d)3. ","b");
         
        Funcoes p2 = new Funcoes("<html>Seja P(z) um polinômio de <br>grau 2, com coeficientes complexos. Calcule P(1) , se <br>P(z) satisfaz: P(−i)=2, P(−1)=1+2i e P(0)=i.</html>",
            "a)−3i  b)−2−5i  c)3i  d)−2+5i ","d");
         
        Funcoes p3 = new Funcoes("<html>O número total de maneiras de escolher 5 <br>dos números 1, 2, 3, ..., 52 sem repetição é:</html>",
            "<html>a)entre 1 e 2 milhões.  b)entre 2 e 3 milhões. <br>c)entre 3 e 4 milhões.  d)menos de 1 milhão. </html>","b");
         
        Funcoes p4 = new Funcoes("<html>O número mínimo de pessoas que deve haver em <br>um grupo para que possamos garantir que nele há pelo menos três <br>pessoas nascidas no mesmo dia da <br>semana é igual a:</html>",
            "a)21.  b)15.  c)20.  d)14 ","b");
         
        Funcoes p5 = new Funcoes("<html>Sendo x um arco do segundo <br>quadrante tal que sen x = 3/7 , o valor de tgx é:</html>",
            "<html>a)(10 √10)/3  b)-(3 √10)/20 <br>c)(3√10)/20  d)-(2 √3)/5 </html>","b");
        
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
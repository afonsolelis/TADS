package cavernaDePitagoras;
import java.util.HashMap;

public class SegundoAno {
    private int totalRespondidas;
    private int totalAcertos;
    HashMap hashPergs;
    
    
    /*
    * Hash map utilizada para guardar as perguntas, randomizar e evitar null;
    */
    public SegundoAno(){
        hashPergs = new HashMap();
        
        Funcoes p1 = new Funcoes("Quantas soluções inteiras a inequação x² + x - 20 ≤ 0 admite?",
            "a)2  b)3  c)10  d)7","c");
        
        Funcoes p2 = new Funcoes("<html>Sejam x e y números tais que os conjuntos <br>{0, 7, 1} e {x, y, 1} são iguais. Então, <br>podemos afirmar que:</html>",
            "<html>a)x = 0 e y = 5  b)x + y = 7  <br>c)x = 0 e y = 1  d)x + 2 y = 7</html>","b");
        
        Funcoes p3 = new Funcoes("<html>A soma dos números inteiros x que satisfazem<br> 2x + 1 ≤ x +3 ≤ 4x é:</html>",
            "a)3  b)1  c)2  d)0","a");
         
        Funcoes p4 = new Funcoes("<html>A razão entre a idade de Pedro e a de seu<br> pai é igual a 2/9. Se a soma das duas idades é igual <br>a 55 anos, então Pedro tem:</html>",
            "a)12 anos.  b)13 anos.  c)15 anos.  d)10 anos.","d");
         
        Funcoes p5 = new Funcoes("<html>Comprando dois milk shakes e um bolo gastamos<br> R$13,00. Comprando um milk shake e dois bolos gastamos R$11,00. <br>Quanto gastamos comprando um milk shake e um bolo?</html>",
            "a)R$ 8,00 b)R$ 6,00  c)R$ 7,00  d)R$ 9,00","a");
        
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

package cavernaDePitagoras;

/* Lógica
    Funções get e set sobre enunciado, alternativas e respostas.
 */
public class Funcoes {
    
    private String pergunta;
    private String opcao;
    private String resp;
    
    
    /*
    * Construtor de lógica inicializa as perguntas e comparar respostas
    */
    public Funcoes(String perg,String opt,String answ){
        pergunta = perg;
        opcao = opt;
        resp = answ;
    }
    
    public String enunGet() {
        return pergunta;
    }

    public void enunSet(String enunciado) {
        this.pergunta = enunciado;
    }
    
    public String alterGet() {
        return opcao;
    }
    
    public void alterSet(String alternativa) {
        this.opcao = alternativa;
    }
    
    public String respGet() {
        return resp;
    }
    
    public void respSet(String resposta) {
        this.resp = resposta;
    }
}


import java.util.ArrayList;

public class Rodada {
    private ArrayList<Dado> meusDados;
    private int total;

    /**
     * Construtor para objetos da classe Jogada
     */
    public Rodada() {
        this.meusDados = new ArrayList<Dado>();
        this.meusDados.add(new Dado());
        this.meusDados.add(new Dado());
        this.meusDados.add(new Dado());
        this.setTotal();
    }

    /**
     * método que retorna um número inteiro resultante do somatório das faces dos dados.
     */
    public int getTotal() {
        return this.total;
    }
    
    /**
     * método que contabiliza o somatório das faces dos dados.
     */
    private void setTotal() {
        this.total = 0;
        for (Dado i : this.meusDados) {
            this.total = this.total + i.getFace();
        }
    }
    
    /**
     * método que retorna o ArrayList dos dados da jogada.
     * @return  ArrayList<Dado> contendo os objetos dados da Jogada. 
     */
    public ArrayList<Dado> getMeusDados() {
        return this.meusDados;
    }
    
    /**
     * método que atribuí uma nova configuração de dados a um objeto Jogada.
     */
    public void setMeusDados(ArrayList<Dado> meusDado) {
        this.meusDados = meusDados;
    }

    /**
     * Método que imprime o estado atual de uma jogada.
     * @return  uma string que representa o estado atual da jogada. 
     */
    public String toString() {
        return "Essa jogada rendeu " + this.total + " pontos.";
    }
}
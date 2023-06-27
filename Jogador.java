
public class Jogador {
    private String nome;
    private int placar;
    private int vitalidade;

    /**
     * Construtor para objetos da classe Jogador com parametros.
     * Inicialmente, o placar do jogador é 0.
     * @param  nome - string que representa o nome do jogador.
     */
    public Jogador(String nome) {
        this.setNome(nome);
        this.setPlacar(0);
        this.setVitalidade(100);
    }

    /**
     * Construtor para objetos da classe Jogador sem parametros.
     */
    public Jogador() {
        this.setNome("");
        this.setPlacar(0);
    }

    /**
     * setPlacar - metodo que atribui outro valor ao placar
     * @param  placar   novo placar do jogador.
     */
    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getVitalidade() {
        return this.vitalidade;
    }
    
    
    /**
     * setPlacar - metodo que atribui outro valor ao placar
     * @param  placar   novo placar do jogador.
     */
    public void setPlacar(int placar) {
        this.placar = placar;
    }
    
    /**
     * setNome - metodo que atribui outro nome ao jogador
     * @param  nome   novo nome do jogador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * getNome - metodo que retorna o nome do jogador
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * getPlacar - metodo que retorna o placar do jogador
     */
    public int getPlacar() {
        return this.placar;
    }

    /**
     * toString - metodo que retorna uma string que representa um jogador e 
     * seu placar atual.
     */
    public String toString() {
        return this.getNome() + ": " + this.getPlacar() + " pontos\n";
    }
}

/**
 * Classe que representa o elemento Dado em um jogo de tabuleiro.
 * 
 * @author Sandro Rautenberg 
 * @version 1.1
 * @date 2023-02-06
 * 
 * Em relação à versão 1.0, o método construtor e o método setFace foram
 * atualizados. O pacote Random somente é utilizado em setFace(), encapsulando
 * a aleatoriedade a este método. Também foi criada a contante N_FACES.
 */

import java.util.Random;

public class Dado {

    public static final int N_FACES = 6;
    private int face;

    /**
     * Construtor para objetos da classe Dado
     */
    public Dado() {
        this.setFace();
    }

    /**
     * Método que retorna uma face sorteada do dado.
     * @return     um número aleatório entre 1 e 6. 
     */
    public int getFace() {
        this.setFace();
        return this.face;
    }
    
    /**
     * Método que sorteia um novo valor da face dado.
     */
    private void setFace() {
        Random gerador = new Random();
        this.face = gerador.nextInt(N_FACES) + 1;
    }
        
    /**
     * Método que imprime o estado atual da face do dado.
     * @return  uma string que representa o estado atual do dado. 
     */
    public String toString() {
        return "A face atual deste dado é " + this.face;
    }
}

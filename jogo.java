import javax.swing.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 * Classe responsável pelo andamento.
 * 
 * @author Josimaik Cristo, 
 * @version 3.1 start 17/02/2023 - 17:09
 */
public class jogo{
    private static JButton jButton1;
    private Jogador umJogador;
    private static final int REDUTOR = 7;
    private boolean fimJogo = false;
    String fase = "Deserto";
    private boolean jangada;
    private int tentativas;

    /**
     * Construtor para objetos da classe jogo
     */
    public jogo(String nome){
        this.umJogador = new Jogador(nome);
    }
    
    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getFase() {
        return this.fase;
    }
    
    public void setJangada(boolean jangada) {
        this.jangada = jangada;
    }

    public boolean getJangada() {
        return this.jangada;
    }
    
    public void setFimJogo(boolean fimJogo) {
        this.fimJogo = fimJogo;
    }

    public boolean getFimJogo() {
        return this.fimJogo;
    }
    
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getTentativas() {
        return this.tentativas;
    }
    

    /**
     * Metodo utilizado para inciar o jogo, onde está contido todas as regras de jogo e instâncias das fases 
     */
    public void jogar (){
        JOptionPane.showMessageDialog(null, " 'Ancestral Valkner' - 'Você está no deserto, sua missão é avançar o mais depressa possível," 
                                    + "você precisa chegar a tempo a montanha do sacrifício. Escolha bem seu caminho, com prudência e ousadia," 
                                    + "se seus pés tomarem o caminho errado sua vida será tragada e o mundo que conhecemos irá desaparecer.' ", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, " 'Ancestral Valkner' - 'Você se descuidou muito, era de se imaginar que o caminho seria perigoso, que encontraria seres terríveis. Um deles os 'vitelineos vermes' assustadores a serviço dos Drawleses, haviam criado essa armadilha para capturar os aventureiros. '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);  
        JOptionPane.showMessageDialog(null, " 'Ancestral Valkner' - 'Você precisa usar os dados com habilidade e contar com a magia maior, precisa tirar no mínimo 9, para vencer e se ver livre'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);

        while (umJogador.getVitalidade() > 0 && !fimJogo && fase == "Deserto") {
            faseDeserto(new Rodada());
        }
        while (umJogador.getVitalidade() > 0 && !fimJogo && fase == "Mar") {
            faseMar(new Rodada());
        }
        while (umJogador.getVitalidade() > 0 && !fimJogo && fase == "MontanhaDoSacrificio") {
            faseMontanhaDoSacrificio(new Rodada());
        }
        
        
        
        
        //JOptionPane.showMessageDialog(null, " ' Ancestral Valkner - Isso! Você conseguiu avançar, precisa melhorar suas habilidades e concentração no caminho se quiser vencer. Siga em frente, precisamos atravessar o ‘Mar venenoso de Shanir’, conhecido por consumir com a alma dos que ousam navegar ali.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);  
        //JOptionPane.showMessageDialog(null, " ' Ancestral Valkner - Use os dados para construir um barco resistente. Precisa de no mínimo 14.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE); 
        //while (umJogador.getPlacar() >= 17 && umJogador.getPlacar() < 31) {
        //    inicioMar(new Rodada());
        //}
        
    }
    
    /**
     * Metodo que dá início a fase do Deserto, primeira fase do jogo.
     * implementado todas as condições para avanço e dificuldade que envolve o jogo
     */
    private void faseDeserto(Rodada rodadaAtual) {
        System.out.println("Dados: " + rodadaAtual.getTotal());
        if(rodadaAtual.getTotal() < 9){
            JOptionPane.showMessageDialog(null," 'Ancestral Valkner' - você esta perto, continue lutando, precisa evoluir, sua força continua inferior = " + rodadaAtual.getTotal() ,  umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null," 'Ancestral Valkner' - 'você conseguiu derrotar os Vitelineos, avance'",  umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                
            JOptionPane.showMessageDialog(null, " 'Casa 24 - A Perdição Desolante '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);  
            JOptionPane.showMessageDialog(null, " ' Ancestral Valkner' - 'Sinceramente achei que você possuía mais força de vontade,"
                                            + "mas se envolvendo no canto das 'Bromélias de Mil Olhos’, me faz imaginar que possa ter sido a escolha errada."
                                            + "Se você muito se demorar, sua vida iria se esvaziar, corra  e jogue os dados, você precisa de um precioso 14, "
                                            + "para seguir em direção, e se ver livre das distração.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
            if (rodadaAtual.getTotal() < 14 ){
                JOptionPane.showMessageDialog(null," 'Ancestral Valkner' - você esta perto, continue lutando, precisa evoluir, sua força continua inferior = " + rodadaAtual.getTotal() ,  umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        
            }else{
                JOptionPane.showMessageDialog(null, " 'Ancestral Valkner' - 'você conseguiu mais uma chance. Avance! Mas permaneca atento'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                
            }
            
            fase = "Mar";
        }
    }

    
    /**
     * Metodo que dá início a fase Mar, segunda fase do jogo.
     * implementado todas as condições para avanço e dificuldade que envolve o jogo
     */
    public void faseMar(Rodada rodadaAtual) {
        System.out.println(rodadaAtual.getTotal() + " vitalidade " + umJogador.getVitalidade());
        JOptionPane.showMessageDialog(null, " ' Ancestral Valkner - Isso! Você conseguiu avançar, precisa melhorar suas habilidades e concentração no caminho se quiser vencer. Siga em frente, precisamos atravessar o ‘Mar venenoso de Shanir’, conhecido por consumir com a alma dos que ousam navegar ali.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);  
        JOptionPane.showMessageDialog(null, " ' Ancestral Valkner - Use os dados para construir um barco resistente. Precisa de no mínimo 14.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE); 
       jangada = false;
       if (rodadaAtual.getTotal() < 14 ){
           JOptionPane.showMessageDialog(null, " 'Você fracassou, mas temos uma outra saída, use sua vitalidade para construir uma jangada '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
           umJogador.setVitalidade(umJogador.getVitalidade() - REDUTOR);
           JOptionPane.showMessageDialog(null, " 'tirei vitalidade. ficou com: " + umJogador.getVitalidade() + "Porém sua jangada agora esta pronta", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
           // metodo para decrementar vitalidade.
           jangada = true;
       }jangada = true;
       if(jangada = true){
           JOptionPane.showMessageDialog(null, " 'Agora você esta navegando pelo mar'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
           JOptionPane.showMessageDialog(null, " ' Ancestral Valkner ' - Você acaba de ser preso pelas ‘Piranhas Sanguessugas.'"
                                            +" Tenha habilidade ao agir, se não, elas irão dilacerar seus vasos sanguíneos e você irá sangrar até seus sonhos deixarem de existir."
                                            +" Use os dados, você precisa tirar 12 para conseguir manter sua vida.", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);  
           if (rodadaAtual.getTotal() < 12) {
                JOptionPane.showMessageDialog(null, " 'Você fracassou, sua vitalidade esta diminuinda a cada vez que você falha '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                umJogador.setVitalidade(umJogador.getVitalidade() - REDUTOR);
                if(umJogador.getVitalidade() < 1){
                   fimJogo = true; 
                }
            }else{
               JOptionPane.showMessageDialog(null, " 'Ancestral Valkner - Agora você precisa tirar no mínimo 11, para invocar o elixir de luz que agride a existência delas.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                            
           }if(rodadaAtual.getTotal() < 11){
               JOptionPane.showMessageDialog(null, " 'Você fracassou, continue tatando!! '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                
           }else{
               JOptionPane.showMessageDialog(null, " 'Você conseguiu, avance!'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
               JOptionPane.showMessageDialog(null, " ' Ancestral Valkner ' - Você acaba de encontrar seu maior desafio até aqui, sua vida corre maior perigo,"
                                            + "você irá enfrentar a ‘Serpente Marinha Drawles.’  '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE); 
                JOptionPane.showMessageDialog(null, " 'Você precisa ser astuto e dominar a arte de um objeto Valkner, o ‘Medalhão de Gun’, o sábio."
                                            + " Para destravar você precisa tirar 10 nos dados ", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                if(rodadaAtual.getTotal() < 10){
                   JOptionPane.showMessageDialog(null, " 'Você precisa ser ágil porque a cada rodada neste local você perde sua consciência."
                                                + "cada rodada drena 7 pontos de vitalidade. '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                   umJogador.setVitalidade(umJogador.getVitalidade() - REDUTOR);
                   if(umJogador.getVitalidade() < 1){
                   fimJogo = true; 
                    }
                }else{
                    JOptionPane.showMessageDialog(null, " 'Ancestral Valkner' - 'você conseguiu mais uma chance. Avance! Mas permaneca atento'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                    
                }
                
           }
            
       } 
       fase = "MontanhaDoSacrificio"; 
            
               // JOptionPane.showMessageDialog(null, umJogador.getNome()," 'Você precisa ser astuto e dominar a arte de um objeto Valkner, o ‘Medalhão de Gun’, o sábio."
               //PARTE PARA SER INCREMENTADA                             + " Para destravar você precisa tirar 10 nos dados e responder uma pergunta, pergunta milenar. ", JOptionPane.WARNING_MESSAGE);
            
    }
    
    /**
     * Metodo que dá início a fase Montanha do Sacrificio, última fasedo jogo.
     * implementado todas as condições para avanço e dificuldade que envolve o jogo
     */
    private void faseMontanhaDoSacrificio(Rodada rodadaAtual) {
        JOptionPane.showMessageDialog(null, " Ancestral Valkner 'Sinceramente pelo seu porte mental, estava apostando que não existia capacidade em você para avançar,"
                                    + "mas me surpreendeu, parabéns, você irá seguir em direção a montanha do sacrifício, não se engane o que enfrentou até aqui não se compara"
                                     + "o que encontrará nesse perverso caminho. '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE); 
        JOptionPane.showMessageDialog(null, "'Ancestral Valkner' - Você acaba de entrar no domínio das 'Árvores pantanosas', enquanto estiver no domínio,"
                                          + "As raízes gungunar, lhe prenderam, a cada jogada de dados, seus membros são rasgados lentamente e a dor é sufocante,"
                                          + "\npor causa da seiva com enxofre, que age diretamente nas células, além de dor em escala terrível pode causar alucinações.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' -  Essa é a casa 'A chance'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, " 'Ancestral Valkner' -  Você encontrou a janela de Futtgar o peregrino Valkner, essa janela permite você ter acesso a sabedoria"
             + "desse poderoso mago Valkner, as habilidades dele foram notória no período pré milenar, permitiram ele se aventurar por lugares que outras viveriam em pesadelo apenas por cogitar"
             + "\ncaminhar. Seja esperto e aproveite esta oportunidade utilizando as habilidades peregrinas,  para se livrar das árvores e do  gelatino lodo movediço.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' -  fidalgo destituído até que enfim você conseguiu algo notoriamente útil, descanse,"
                                                 + "vou lhe garantir um pouco do suco Valkner, e sua vitalidade será restituída em 7'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        umJogador.setVitalidade(umJogador.getVitalidade() + 7);
        JOptionPane.showMessageDialog(null," ''Ancestral Valkner' -  Sua jornada se aproxima do fim…", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' -  Todas as apostas estavam contra você, e com minha ajuda você conseguiu supera-las, você mostrou valor,"
                                                + "mas não se engane, foi nessa fase que muitos se ensoberbeceram-se e definharam na perdição.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null," ''Ancestral Valkner' -  Para prosseguir, você precisa unir tudo que aprendeu, com ferramentas Valkners que depositei um"
                                                 + "sua mochila, para acessar, tire pelo menos um 15.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
        if(rodadaAtual.getTotal() < 15){
                   JOptionPane.showMessageDialog(null, " 'Você precisa ser ágil porque a cada rodada neste local você perde sua consciência."
                                                + "cada rodada drena 7 pontos de vitalidade. '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                   umJogador.setVitalidade(umJogador.getVitalidade() - REDUTOR);
                   if(umJogador.getVitalidade() < 1){
                       fimJogo = true; 
                    }
        }else{
            JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' -  Acorde, você está litigando com seu coração, aos poucos sua vitalidade deixará de existir e"
                                                 + "não sobrará nem uma linha de história sobre você, as flores desse campo, causam uma paranoia, levando você a atacar a si mesmo,"
                                                 + "ferindo o seu âmago.'",  umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' -  resista, jogue os dados e tire um bom 15, acerte a pergunta sobre a verdadeira alegria,"
                                                 + "ganhe o direito de ler o livro da verdade, e utilize oque aprendeu no livro para avançar. ",umJogador.getNome(), JOptionPane.WARNING_MESSAGE); 
         
        }if ((rodadaAtual.getTotal() < 15)){
                JOptionPane.showMessageDialog(null, " 'Ancestral Valkner' -  Fidalgo você acaba de ser atingido por um raio plasmático, que causa o desperdício da vida,"
                                                     + "sua vitalidade foi reduzida em 9, a cada minuto que permanece aqui seus sentidos são aos poucos afetados.'",umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                umJogador.setVitalidade(umJogador.getVitalidade() - 9);
                if(umJogador.getVitalidade() < 1){
                   fimJogo = true; 
                }
            } else {
                JOptionPane.showMessageDialog(null," ''Ancestral Valkner' -  Jogue os dados para acessar sua mochila, tire mínimo 9 nos dados,"
                                              + "encontre o refletor de plasma de “Pináfico” , Pináfico o general do primeiro século de ouro, no bi milênio," 
                                              + "\nconhecido como o ponto final dos Drawleses.", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
            }if ((rodadaAtual.getTotal() < 9)){
                    JOptionPane.showMessageDialog(null, " 'Você precisa ser ágil porque a cada rodada neste local você perde sua consciência."
                                                + "cada rodada drena 7 pontos de vitalidade. '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                    umJogador.setVitalidade(umJogador.getVitalidade() - REDUTOR);
                    if(umJogador.getVitalidade() < 1){
                       fimJogo = true; 
                    }
                } else {
                    JOptionPane.showMessageDialog(null," 'Ancestral Valkner' -  'para utilizar o refletor e para acessar essa magia antiga específica você precisa tirar um bom 17'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                    if ((rodadaAtual.getTotal() < 9)){
                        JOptionPane.showMessageDialog(null, " 'Você precisa ser ágil porque a cada rodada neste local você perde sua consciência."
                                                    + "cada rodada drena 7 pontos de vitalidade. '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                        umJogador.setVitalidade(umJogador.getVitalidade() - REDUTOR);
                        if(umJogador.getVitalidade() < 1){
                           fimJogo = true; 
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, " 'Pináfico o general: boa rapaz, você conseguiu, utilize-a."
                                                  + " O poder é definido pelos números tirados nos dados. Para derrotar os raios precisa de no mínimo 9.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                        if ((rodadaAtual.getTotal() < 9)){
                             JOptionPane.showMessageDialog(null, " 'Você fracassou, continue tatando!! '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
               
                        } else {
                            JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' - 'Avançamos, corra não há tempo para, você precisa chegar ao código da vida antes que ele desapareça.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                            JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' - 'Tenha cautela, você está entrando em um lugar sombrio, frio e atormentador,"
                                                          + "só é capaz de sobreviver se conseguir utilizar todas as ferramentas combinadas que recebeu.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                            JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' - 'Convergência de Valk o terceiro, Valk o terceiro, um dos primeiros anciões dos Valkners,"
                                                          + "foi líder da linhagem Valk’s no tempo antigo, anterior aos séculos..'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                            JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' - 'Você só será capaz de criar uma poderosa arma, utilizando esta fabulosa magia,"
                                                          + "ela é capaz de unir qualquer ferramenta, e com habilidade, tornando ela 3 vezes mais forte do que o poder somado, das ferramentas que forem utilizadas na fusão.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                            //JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' - 'Mas o acesso não é tão simples, você precisa  usar o poder dos dados tirando no mínimo 15."
                                                         // + "Para ativar o estágio 1, precisa acertar uma pergunta sobre pré história, de um mundo ainda primitivo.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                            JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' - 'Mas o acesso não é tão simples, você precisa  usar o poder dos dados tirando no mínimo 15, entretanto você possui apenas 3 chances.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                            tentativas = 0;
                            if ((rodadaAtual.getTotal() < 15)){
                                JOptionPane.showMessageDialog(null, " 'Você fracassou, continue tatando!! '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                                tentativas+=1;
                                if(tentativas<4){
                                    JOptionPane.showMessageDialog(null, " 'Ancestral Valkner - Sinceramente achei que você seria capaz de ser focado, mas, me provou ao contrário,"
                                                                     + "sua vida foi drenada e sua existência, chegou ao fim'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                                    fimJogo = true;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null," ''Ancestral Valkner' - 'Para iniciar a convergência, precisa escolher a opção correta em um desafio."
                                                          + "Somente após isso pode usar seu poder, que será definido pelo número que tirar nos dados, para vencer o Escuro da Solidão, irá precisar de um 14.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                                 if ((rodadaAtual.getTotal() < 14)){
                                    JOptionPane.showMessageDialog(null, " 'Você precisa ser ágil porque a cada rodada neste local você perde sua consciência."
                                                                    + "cada rodada drena 7 pontos de vitalidade. '", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                                    umJogador.setVitalidade(umJogador.getVitalidade() - REDUTOR);
                                    if(umJogador.getVitalidade() < 1){
                                        fimJogo = true;
                                    }
                                } else {
                                   JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' - 'Enfim, chegamos ao fim desta saga, você atingiu o ápice da humanidade, você se torna um Valkner menor.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                                    JOptionPane.showMessageDialog(null, " ''Ancestral Valkner' - 'Veja, é lindo, você está diante do código da vida, poder superior,"
                                                 + "agora você pode entender coisas que aos outros causaria devastação na alma, levando-os a definhar na loucura. Use-a  bem, evolua e salve essa era.'", umJogador.getNome(), JOptionPane.WARNING_MESSAGE);
                                    fimJogo = true;
                                }
                            }
                        }
                    }
                }
            
        
                                                 
            // // mensgem de parabenização, agora ele parece ser alguma coisa. 
                  // }
                    
                // }
                
            // }
            
    }
}
    



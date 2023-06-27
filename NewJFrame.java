import javax.swing.JFrame;
/**
 * Escreva uma descrição da classe botãoFim aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class NewJFrame extends javax.swing.JFrame {
    public javax.swing.JButton jButton1;
    private String mensagemFim;
    
    
    public NewJFrame (String mensagemFim){
        this.mensagemFim = mensagemFim;
        System.out.println(" 'Ancestral Valkner - Sinceramente achei que você seria capaz de ser focado, mas, me provou ao contrário,"
                                     + "sua vida foi drenada e sua existência, chegou ao fim '");
    }
    
    public String getMensagemFim(){
        return this.mensagemFim;
      
    }
    
    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
        

    }
    
    
    
}
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
 


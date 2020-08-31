/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeton1;

/**
 *
 * @author lucas
 */
public class ProjetoN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa jose = new PessoaTimida("José");
        Pessoa joao = new PessoaExtrovertida("João");
        jose.saudacao("João");
        jose.perguntarSentimento();
        joao.responderSentimento();
        joao.perguntarSentimento();
        jose.responderSentimento(joao.getSentimento());
    }
    
}

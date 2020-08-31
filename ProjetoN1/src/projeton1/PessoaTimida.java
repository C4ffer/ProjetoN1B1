/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeton1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class PessoaTimida extends Pessoa {
    
    public PessoaTimida(String nome) {
        super(nome);
    }
   
    @Override
    public void saudacao(String outraPessoa) {
        System.out.println("Oi...");
    }
    
    @Override
    public void perguntarSentimento () {
        if (this.sentimento == null)
            System.out.println("Como vai?");
        else 
            System.out.println("E você?");
    }
    
    @Override
    public void responderSentimento() {
        setSentimento(verificaSentimento(this.nome));
        if (this.sentimento == "Feliz")
            System.out.println("Estou bem...");
        else if (this.sentimento == "Triste")
            System.out.println("Não estou muito bem...");
        else
            System.out.println("Não quero falar sobre isso!");
    }
    @Override
    public void responderSentimento(String outraPessoaSentimento){
        setSentimento(verificaSentimento(this.nome));
        if (this.sentimento == "Feliz")
            if (outraPessoaSentimento != "Feliz")
                System.out.println("Estou bem...");
            else
                System.out.println("Também estou");
        else if (this.sentimento == "Triste")
            if (outraPessoaSentimento == "Triste")
                System.out.println("Também não estou...");
            else
                System.out.println("Não estou muito bem...");
        else
            if (outraPessoaSentimento != "Irritado")
                System.out.println("Não quero falar sobre isso!");
            else
                System.out.println("Também...");
    }
    
    static String verificaSentimento(String nome) {
        do {
                System.out.println("1 - Feliz");
                System.out.println("2 - Triste");
                System.out.println("3 - Raiva");
                System.out.print("Como você está se sentindo " + nome + "? ");
                Scanner scan = new Scanner(System.in);
            try {
                int opcao = scan.nextInt();

                switch (opcao){
                    case 1:
                        return "Feliz";
                    case 2:
                        return "Triste";
                    case 3:
                        return "Raiva";
                    default:
                        System.out.println("\nResposta inválida!\n");
                        break;
                }
            } 
            catch (Exception e) {
                System.out.println("\nResposta inválida!\n");
            }
        } while (true);
    }
}

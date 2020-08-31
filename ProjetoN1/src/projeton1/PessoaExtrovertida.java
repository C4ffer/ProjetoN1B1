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
public class PessoaExtrovertida extends Pessoa {
    
    public PessoaExtrovertida(String nome) {
        super(nome);
    }
    
    @Override
    public void saudacao(String outraPessoa) {
        System.out.println("E aí " + outraPessoa + "!");
    }
    
    @Override
    public void perguntarSentimento () {
        if (this.sentimento == null)
            System.out.println("Beleza? Como vai indo?");
        else 
            System.out.println("E você, como está?");
    }
    
    @Override
    public void responderSentimento() {
        setSentimento(verificaSentimento(this.nome));
        if (this.sentimento == "Feliz")
            System.out.println("Estou indo muito bem, obrigado!");
        else if (this.sentimento == "Triste")
            System.out.println("Não estou muito bem...");
        else
            System.out.println("Tem algo me tirando do sério!");
    }
    @Override
    public void responderSentimento(String outraPessoaSentimento){
        setSentimento(verificaSentimento(this.nome));
        if (this.sentimento == "Feliz")
            if (outraPessoaSentimento != "Feliz")
                System.out.println("Estou indo muito bem, obrigado!");
            else
                System.out.println("UAU! Também estou muito feliz!");
        else if (this.sentimento == "Triste")
            if (outraPessoaSentimento == "Triste")
                System.out.println("Nossa, também não estou bem...");
            else
                System.out.println("Não estou muito bem...");
        else
            if (outraPessoaSentimento != "Irritado")
                System.out.println("Tem algo me tirando do sério!");
            else
                System.out.println("Você também?");
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

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
public class Pessoa {
    protected String nome;
    protected String sentimento;
    
    Pessoa(String nome){
        this.nome = nome;
    }
    
    public void saudacao(String outraPessoa) {
        System.out.println("Olá " + outraPessoa + "!");
    }
    
    public void perguntarSentimento () {
        if (sentimento == null)
            System.out.println("Como você está?");
        else 
            System.out.println("E você, como está?");
    }
    
    public void responderSentimento() {
        setSentimento(verificaSentimento(this.nome));
        if (this.sentimento == "Feliz")
            System.out.println("Estou muito bem!");
        else if (this.sentimento == "Triste")
            System.out.println("Não estou bem...");
        else
            System.out.println("Estou irritado!");
    }
    
    public void responderSentimento(String outraPessoaSentimento){
        setSentimento(verificaSentimento(this.nome));
        if (this.sentimento == "Feliz")
            if (outraPessoaSentimento != "Feliz")
                System.out.println("Estou muito bem!");
            else
                System.out.println("Também estou muito feliz!");
        else if (this.sentimento == "Triste")
            if (outraPessoaSentimento == "Triste")
                System.out.println("Também não estou bem...");
            else
                System.out.println("Não estou bem...");
        else
            if (outraPessoaSentimento != "Irritado")
                System.out.println("Estou irritado!");
            else
                System.out.println("Também estou!");
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
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sentimento
     */
    public String getSentimento() {
        return sentimento;
    }
    
    /**
     * @param sentimento the nome to set
     */
    public void setSentimento(String sentimento) {
        this.sentimento = sentimento;
    }
}

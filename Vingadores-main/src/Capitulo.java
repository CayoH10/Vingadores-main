import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    int alteracaoDePv;
    Personagem personagem1;
    Personagem personagem2;
    Scanner leitor;
    
    Capitulo(String nome, String texto, String escolha1,
      String escolha2, int alteracaoDePv, Personagem personagem1, Personagem personagem2, Scanner leitor) {
         this.nome = nome;
         this.texto = texto;
         this.escolha1 = escolha1;
         this.escolha2 = escolha2;
         this.alteracaoDePv = alteracaoDePv;
         this.personagem1 = personagem1;
         this.personagem2 = personagem2;
    }
    
    void mostrar() {
        System.out.println("Nome: "+ this.nome);
        System.out.println(this.texto);
        System.out.println("Alteração de PV: "+ this.alteracaoDePv);        
        System.out.println("1- " + this.escolha1);
        System.out.println("2- "+ this.escolha2);
    }
    
    int escolher() {
        leitor = new Scanner(System.in);
        int rota = -1;

        if (rota == -1) {
            System.out.println("Qual caminho seguir ?");
            rota = leitor.nextInt();
            return rota;
        } else {
            System.out.println("Opção inválida");
        }
         return rota;
            
        
    }

}
    
import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<String> escolhas;
    private int alteracaoDePv;
    private Personagem personagem;
    private Scanner sc;

    Capitulo(String nome, String texto,
            int alteracaoDePv, Personagem personagem, Scanner sc) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<String>();
        this.alteracaoDePv = alteracaoDePv;
        this.personagem = personagem;
        this.sc = sc;
    }

    void acrescentaEscolha(String escolha) {
        this.escolhas.add(escolha);
    }

    void mostrar() {
        System.out.println("Titulo: " + this.nome);
        System.out.println(this.texto);
        for (String y : this.escolhas) {
            System.out.println(y);
        }
        System.out.println("Alteração de PV: " + this.alteracaoDePv);

    }

    public int escolher(){
        String recebi;
        boolean stop = true;

        while(stop){
            recebi = this.sc.nextLine();
            for(int i = 0; i < this.escolhas.size(); i++){
                if(this.escolhas.get(i).equalsIgnoreCase(recebi)){
                    return i;
                }
            }
            System.out.println("erro");
        }
        return - 1;
    }

}

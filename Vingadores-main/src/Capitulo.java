import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
     String nome;
     String texto;
     ArrayList<Escolhas> escolhas;
     int alteracaoDePv;
     Personagem personagem;
     Scanner sc;

    Capitulo(String nome, String texto,
            int alteracaoDePv, Personagem personagem, Scanner sc) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<Escolhas>();
        this.alteracaoDePv = alteracaoDePv;
        this.personagem = personagem;
        this.sc = sc;
    }

    void acrescentaEscolha(Escolhas escolhas){
        this.escolhas.add(escolhas);
    }

    void mostrar() {
        System.out.println("Titulo: " + this.nome);
        System.out.println(this.texto);
        for (Escolhas y : this.escolhas) {
            System.out.println(y.textoMostrado);
        }
        personagem.mostrarStatus(alteracaoDePv);
        System.out.println("PV: "+ personagem.getPv());
        System.out.println("Alteração de PV: " + this.alteracaoDePv);

    }

    public int escolher(){
        String recebi;
        boolean stop = true;

        while(stop){
            recebi = this.sc.nextLine();
            for(int i = 0; i < this.escolhas.size(); i++){
                if(this.escolhas.get(i).textoDigitado.equalsIgnoreCase(recebi)){
                    return i;
                }
            }
            System.out.println("erro");
        }
        return - 1;
    }
    
    void executar() {
        mostrar();
        int m = escolher();
        if(m >= 0) {
            this.escolhas.get(m).proximu.executar();
        }
    }
}

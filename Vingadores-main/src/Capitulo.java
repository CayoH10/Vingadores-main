import java.util.ArrayList;
import java.util.Scanner;


public class Capitulo{
    private String nome;
    private String texto;
    private ArrayList<Escolhas> escolhas;
    private int alteracaoDePV;
    private Personagem personagem;
    private Scanner sc;

    Capitulo(
        String nome,
        String texto,
        int alteracaoDePV,
        Personagem personagem,
        Scanner sc
    ){
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<Escolhas>();
        this.alteracaoDePV = alteracaoDePV;
        this.personagem = personagem;
        this.sc = sc;
    }

    void acrescentaEscolha(Escolhas escolhas){
        this.escolhas.add(escolhas);
    }

    void mostrar(){
        System.out.println("Titulo: " + this.nome);
        System.out.println(this.texto);
        for(Escolhas y : this.escolhas){
            System.out.println(y.getTextoMostrado());
        }
        System.out.println("Alteração PV: " + this.alteracaoDePV );
    }

    int escolher(){
        String recebi;
        boolean stop = true;
        while(stop){
            recebi =  this.sc.nextLine();
            for(int i = 0; i < this.escolhas.size(); i++){
                if(this.escolhas.get(i).getTextoDigitado().equalsIgnoreCase(recebi)){
                    return i;
                }
            }
            System.out.println("erro");
        }
        return - 1;
    }

    void executar(){
        mostrar();
        int m = escolher();
        if(m >= 0){
            this.escolhas.get(m).getProximu().executar();
        }
    }
}
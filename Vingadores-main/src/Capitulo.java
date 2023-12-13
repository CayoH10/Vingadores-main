import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Capitulo {
     private String nome;
     private String texto;
     private ArrayList<Escolhas> escolhas;
     private int alteracaoDePv;
     private Personagem personagem;
     private Scanner sc;

    Capitulo(String nome, String texto,
            int alteracaoDePv, Personagem personagem, Scanner sc) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<Escolhas>();
        this.alteracaoDePv = alteracaoDePv;
        this.personagem = personagem;
        this.sc = sc;
    }

    

    public void acrescentaEscolha(Escolhas escolhas){
        this.escolhas.add(escolhas);
    }

    private void mostrar() {
        System.out.println("Titulo: " + this.nome);
        System.out.println(this.texto);
        for (Escolhas y : this.escolhas) {
            System.out.println(y.getTextoMostrado());
        }
        personagem.setPv(alteracaoDePv);
        System.out.println("PV: "+ personagem.getPv());
        System.out.println("Alteração de PV: " + this.alteracaoDePv);

    }

    public int escolher(){
        String recebi;
        boolean stop = true;

        while(stop){
            recebi = this.sc.nextLine();
            for(int i = 0; i < this.escolhas.size(); i++){
                if(this.escolhas.get(i).getTextoDigitado().equalsIgnoreCase(recebi)){
                    return i;
                }
            }
            System.out.println("erro");
        }
        return - 1;
    }
    
    public void executar() {
        mostrar();
        int m = escolher();
        if(m >= 0) {
            this.escolhas.get(m).getProximu().executar();
        }
    }

    public Map<String, String> getEscolhas() {
        return (Map<String, String>) escolhas;
    }

    public String getNome() {
        return null;
    }

    public String getTexto() {
        return null;
    }
}

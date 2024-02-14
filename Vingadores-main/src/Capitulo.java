import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Capitulo {

    
    private String texto;
    private ArrayList<Escolhas> escolhas;
    private int alteracaoDePv;
    private Personagem personagem;
    protected Scanner sc;

   Capitulo(String texto,
           int alteracaoDePv, Personagem personagem, Scanner sc) {
       
       this.texto = texto;
       this.escolhas = new ArrayList<Escolhas>();
       this.alteracaoDePv = alteracaoDePv;
       this.personagem = personagem;
       this.sc = sc;
   }

   public void acrescentaEscolha(Escolhas escolhas){
       this.escolhas.add(escolhas);
   }

   protected void mostrar() {
      
       System.out.println(this.texto);
       this.personagem.setPv(this.alteracaoDePv);
       System.out.println("PV: "+ personagem.getPv());
       System.out.println("Alteração de PV: " + this.alteracaoDePv);

   }

   public Escolhas escolher(){
       Escolhas resultado = null;

       System.out.println("Escolha: ");
       while (resultado == null) {
        String textoDigitado = sc.nextLine();
        for (Escolhas escolha : escolhas) {
            if(textoDigitado.equalsIgnoreCase(escolha.getTextoDigitado())) {
                resultado = escolha;
            }
        }
        if (resultado == null) {
            System.out.println("Erro!");
        }
       }
       return resultado;
   }
   
   public void executar() {
       mostrar();
       
       if(escolhas.size() >= 0) {
           Escolhas escolha = escolher();
           escolha.getProximu().executar();
        }
       
   } 

   public String getTexto() {
       return texto;
   }

   public ArrayList<Escolhas> getEscolhas() {
       return escolhas;
   }
    
}

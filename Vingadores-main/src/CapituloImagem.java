import java.util.Scanner;

public class CapituloImagem extends Capitulo {

    private String imagem;

    CapituloImagem(String texto, String imagem, int alteracaoDePv, Personagem personagem, Scanner joaquim) {
        super(texto, alteracaoDePv, personagem, joaquim);
       this.imagem = imagem;
    }

    @Override
    protected void mostrar() {
        super.mostrar();
        System.out.println(imagem); 
       
    }
    
}
import java.beans.EventHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controle {

    private Capitulo raiz;

    @FXML
    private Label asciiCap;
    // Caixinha que recebe a imagem ascii
    
    @FXML
    private ButtonBar escolhasBar;
    // Barrinha (vazia) onde serão criados os botões das escolhas

    @FXML
    private Button startBTN;
    // Botão da tela inicial (START), quando clica, ele some e começa os capítulos

    @FXML
    private Label textoCap;
    // Caixinha que recebe os textos dos capítulos

    private Scanner joaquim;

   
    public void mostrarTextoCapitulo(String texto) {
        // Insere os textos dos capítulos na caixinha "textoCap", ele é usado mais pra baixo
        
        textoCap.setText(texto);
        // Nessa linha o método "setText()" muda o nome do objeto referenciado, nesse caso o "textoCap"
    }


    public void mostrarImagemAscii(String imagem) {
        // Esse método tem a mesma lógica do de cima, só que com as imagens ascii, mas
        // não consegui
        // fazer funcionar '-'
        asciiCap.setText(imagem);
    }

    @FXML
    void iniciarHistoria(ActionEvent event) {
        // Esse método é pra quando clicar no botão "START"
        Gerenciador leitor = new Gerenciador();
        HashMap<String, Personagem> personagens = leitor.lerPersonagens();
        Map<String, Capitulo> capitulos = leitor.lerCapitulos(personagens, joaquim);

        raiz = capitulos.get("PROLOGO");

        mostrarCapitulo(raiz);
       
        startBTN.setVisible(false);
       

        asciiCap.setVisible(true);
       
    }


    private void mostrarCapitulo(Capitulo capitulo) {

        mostrarTextoCapitulo(capitulo.getTexto());
        mostrarEscolhas(capitulo.getEscolhas());
    }


    public void mostrarEscolhas(ArrayList<Escolhas> escolhas) {
        // Aqui ele acessa o dicionário das escolhas

        escolhasBar.getButtons().clear();
       


        escolhasBar.setPadding(new Insets(10));
       


        for (int i = 0; i < escolhas.size(); i++) {
          

            FxApp botao = new FxApp(escolhas.get(i));
           
            
            botao.setOnAction(new EventHandler<ActionEvent>() {
               

                @Override
                public void handle(ActionEvent event) {
                   
                    
                    System.out.println(botao.getText());
                  


                    mostrarCapitulo(botao.getEscolha().getProximu());
                  

                }
            });

           
            escolhasBar.getButtons().add(botao);
            
        }

    }
}
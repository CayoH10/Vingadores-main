import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FxApp extends Button {
      private Escolhas escolha;
      public Object getEscolhas;


      public FxApp(Escolhas escolhas) {
           super(escolhas.getTextoDigitado());
           this.escolha = escolha;
      }

      public Escolhas getEscolha() {
        return this.escolha;
      }
    
}
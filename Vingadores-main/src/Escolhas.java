public class Escolhas {
    private String textoMostrado;
    private String textoDigitado;
    private Capitulo proximu;

    Escolhas(
        String textoMostrado,
        String textoDigitado,
        Capitulo proximu
    ){
        this.textoMostrado = textoMostrado;
        this.textoDigitado = textoDigitado;
        this.proximu = proximu;
    }

    public String getTextoMostrado() {
        return textoMostrado;
    }
    
    public String getTextoDigitado() {
        return textoDigitado;
    }
    public Capitulo getProximu() {
        return proximu; 
    }
}
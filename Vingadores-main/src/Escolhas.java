public class Escolhas {
    private String textoDigitado;
    private Capitulo proximu;

    Escolhas(
            String textoDigitado,
            Capitulo proximu) {
    
        this.textoDigitado = textoDigitado;
        this.proximu = proximu;
    }

    

    public String getTextoDigitado() {
        return textoDigitado;
    }

    public Capitulo getProximu() {
        return proximu;
    }



    public Capitulo proximu() {
        return this.proximu;
    }

   

}
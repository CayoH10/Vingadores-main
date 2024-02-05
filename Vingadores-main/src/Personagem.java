public class Personagem {

    private String nome;
    private int pv;

    Personagem(String nome, int pv) {
        this.nome = nome;
        this.pv = pv;
    }

    public String getNome(){
        return nome;
    }

    public int getPv(){
        return pv;
    }

    

    public void setPv(int pv) {
        if (pv < 0) {
            this.pv += pv;
            System.out.println("O " + this.nome + " perdeu PV.");
            
            if(this.pv <= 0) {
                System.out.println("O heroi foi de base.");
            }

        } else if (pv > 0) {
            this.pv += pv;
            System.out.println("O " + this.nome + " ganhou PV.");
            
            
        } 

    }

}

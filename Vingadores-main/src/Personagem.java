package io.github.jiangdequan;

public class Personagem {
<<<<<<< HEAD

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

    void mostrarStatus(int pv) {
        if (pv < 0) {
            this.pv += pv;
            System.out.println("O " + this.nome + " perdeu PV.");
            
            if(this.pv <= 0) {
                System.out.println("o heroi foi de base");
            }

        } else if (pv > 0) {
            this.pv += pv;
            System.out.println("O " + this.nome + " ganhou PV.");
            
            
        } 

    }

}
=======
    
}
>>>>>>> parent of 2cc490f (Personagem)

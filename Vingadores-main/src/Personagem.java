public class Personagem {

    String nome;
    int pv;

    Personagem(String nome, int pv) {
        this.nome = nome;
        this.pv = pv;
    }

    void mostrarStatus(int pv) {
        if (pv <= 0) {
            this.pv += pv;

            System.out.println("O " + this.nome + " perdeu energia.");
            System.out.println("Energia: " + this.pv);

        } else if (pv > 0) {
            this.pv += pv;

            System.out.println("O " + this.nome + " ganhou energia.");
            System.out.println("Energia: " + this.pv);
        } else {
            System.out.println("A Energia continua a mesma");
            System.out.println("Energia: " + this.pv);
        }

    }

}

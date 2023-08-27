public class Personagem{
    String nome;
    int pv;

    Personagem (String nome, int pv){
        this.nome = nome;
        this.pv = pv;
    }

    void mostrarStats(int pv){
        if(pv <= 0 ){
            this.pv = pv;

            System.out.println("O " + this.nome + " perdeu pv");
            System.out.println("pv: " + this.pv);
        }else if(pv > 0){
            this.pv += pv;

            System.out.println("O " + this.nome + " ganhou pv");
            System.out.println("pv: " + this.pv);
        }else{
            System.out.println("O pv continua o mesmo");
            System.out.println("pv: " + this.pv);

        }
    }
}
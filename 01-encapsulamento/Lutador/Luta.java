import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    //Metodos especiais
    public void setDesafiado(Lutador l){
        this.desafiado = l;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador l){
        this.desafiante = l;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setRounds(int r){
        this.rounds = r;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setAprovado(boolean a){
        this.aprovado = a;
    }

    public boolean getAprovado(){
        return this.aprovado;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if(this.aprovado){
            System.out.println("--- Desafiado ---");
            this.desafiado.apresentar();
            System.out.println("--- Desafiante ---");
            this.desafiante.apresentar();

            //Gera 3 resultados, 0,1,2
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                
                case 1: //Desafiado vence
                    System.out.println("Vitoria do: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                
                case 2: //Desafiando vende
                    System.out.println("Vitoria do: " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

            
        }
        else {
            System.out.println("Luta nao pode acontecer");
        }
    }
}

package Pessoa;
public class Bolsista extends Aluno {
    
    private int bolsa;

    public int getBolsa(){
        return this.bolsa;
    }
    public void setBolsa(int b){
        this.bolsa = b;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() + " é bolsista! Pagamento facilitado");
    }

}

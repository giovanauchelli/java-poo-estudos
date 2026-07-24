public class Produto{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int qntd){
        this.nome = nome;
        
        if(qntd < 0 || preco < 0){
            System.out.println("Valores nao podem ser negativos");
        }else {
            this.quantidade = qntd;
            this.preco = preco;
        }
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public double getPreco(){
        return this.preco;
    }
    

    public int getQuantidade(){
        return this.quantidade;
    }

    public void adicionarEstoque(int qntd){
        if(qntd > 0){
            this.quantidade += qntd;
        }
    }

    public void removerEstoque(int qntd){
        if(this.quantidade >= qntd){
            this.quantidade -= qntd;
        }    
    }

    public void alterarPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }
    }

    public double calcularValorEstoque(){
        return this.quantidade * this.preco;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor em Estoque: " + calcularValorEstoque());
        System.out.println("");
    }
}
public class Pedido{
    private int numero;
    private String produto;
    private int quantidade;
    private boolean finalizado;
    private boolean cancelado;

    public Pedido(int numero, String produto, int quantidade){
        this.numero = numero;
        this.produto = produto;
        this.quantidade = quantidade;
        this.finalizado = false;
        this.cancelado = false;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getProduto(){
        return this.produto;
    }
    public void setProduto(String p){
        this.produto = p;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    
    public boolean getFinalizado(){
        return this.finalizado;
    }

    public void finalizarPedido(){
        if(cancelado){
            System.out.println("O pedido foi cancelado.");
        }else if(finalizado){
            System.out.println("O pedido já foi finalizado.");
        }else{
            finalizado = true;
            System.out.println("Pedido finalizado com sucesso.");
        }
    }

    public void cancelarPedido(){
        if(finalizado){
            System.out.println("Não é possível cancelar um pedido finalizado.");
        }else if(cancelado){
            System.out.println("O pedido já foi cancelado.");
        }else{
            cancelado = true;
            System.out.println("Pedido cancelado.");
        }

    }

    public void mostrarPedido(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Produto: " + this.produto);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Finalizado: " + this.finalizado);
        System.out.println("Cancelado: " + this.cancelado);
        System.out.println("");
    }
}
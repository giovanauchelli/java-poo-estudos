public class Cliente{
    private String nome;
    private String cpf;
    private Pedido pedido;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String c){
        this.cpf = c;
    }

    public Pedido getPedido(){
        return this.pedido;
    }

    public void fazerPedido(Pedido pedido){
        if(this.pedido != null){
            System.out.println("Pedido nao pode ser feito");
        }else {
            this.pedido = pedido;
            System.out.println("Pedido realizado com sucesso");
        }
    }

    public void cancelarPedido(){
        if(this.pedido == null){
            System.out.println("Nenhum pedido para ser cancelado");
        }else {
            pedido.cancelarPedido();
            this.pedido = null;
        }
        
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);

        if(pedido != null){
            pedido.mostrarPedido();
        }else {
            System.out.println("Pedido: Nenhum");
        }
    }
}
public class Main {
    public static void main(String[] args){

        Produto p1 = new Produto("Mouse", 100.00, 3);
        p1.adicionarEstoque(3);
        p1.alterarPreco(120.00);
        p1.calcularValorEstoque();
        p1.mostrarInformacoes();
    }
}

public class Main {
    public static void main(String[] args) {

        
        Cliente c1 = new Cliente("Giovana", "123.456.789-00");
        Cliente c2 = new Cliente("Pedro", "987.654.321-00");

        
        Pedido p1 = new Pedido(1, "Notebook", 1);
        Pedido p2 = new Pedido(2, "Mouse Gamer", 2);

        
        System.out.println("===== CLIENTE 1 FAZ UM PEDIDO =====");
        c1.fazerPedido(p1);
        c1.mostrarInformacoes();

        
        System.out.println("\n===== TENTANDO FAZER OUTRO PEDIDO =====");
        c1.fazerPedido(p2);

       
        System.out.println("\n===== FINALIZANDO PEDIDO =====");
        p1.finalizarPedido();

      
        System.out.println("\n===== CANCELANDO PEDIDO FINALIZADO =====");
        c1.cancelarPedido();

        
        System.out.println("\n===== CLIENTE 2 =====");
        c2.fazerPedido(p2);
        c2.mostrarInformacoes();

        
        System.out.println("\n===== CANCELANDO PEDIDO =====");
        c2.cancelarPedido();

        
        System.out.println("\n===== NOVO PEDIDO APÓS CANCELAMENTO =====");
        Pedido p3 = new Pedido(3, "Teclado Mecânico", 1);

        c2.fazerPedido(p3);
        c2.mostrarInformacoes();

    }
}
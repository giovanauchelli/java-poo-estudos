public class Main {
    public static void main(String[] args){

        ContaBancaria c1 = new ContaBancaria(123, "Giovana");
        ContaBancaria c2 = new ContaBancaria(321, "Maria");
        c1.abrirConta();
        c2.abrirConta();
        c1.depositar(300);
        c1.transferir(c2, 100);
        c1.consultarSaldo();
    }
}

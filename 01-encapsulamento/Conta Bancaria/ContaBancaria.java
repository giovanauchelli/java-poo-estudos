public class ContaBancaria{
    private int numeroConta;
    private String titular;
    private float saldo;
    private boolean ativa;


    //Metodos especiais
    public ContaBancaria(int num, String titular){
        this.numeroConta = num;
        this.titular = titular;
        this.saldo = 0;
        this.ativa = false;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(int n){
        this.numeroConta = n;
    }

    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String t){
        this.titular = t;
    }

    public float getSaldo(){
        return this.saldo;
    }
    

    public boolean getAtiva(){
        return this.ativa;
    }
    

    //Metodos
    public void abrirConta(){
        if(!ativa){
            this.ativa = true;
        }else{
            System.out.println("A conta já está aberta");
        }
    }

    public void fecharConta(){
        if(this.saldo == 0){
            this.ativa = false;
        }else {
            System.out.println("Saldo da conta deve ser retirado antes de fechar");
        }
    }

    public void depositar(double valor){
        if(ativa){
            if(valor > 0){
                this.saldo += valor;
            }else {
                System.out.println("Valor não pode ser negativo");
            }
        }else {
            System.out.println("Conta deve estar ativa");
        }
    }

    public void sacar(float valor){
        if(ativa){
            if(this.saldo >= valor){
                this.saldo -= valor;
            }else {
                System.out.println("Saldo insuficiente para saque");
            }
        }else {
            System.out.println("Conta inativa");
        }

    }

    public void transferir(ContaBancaria destino, float valor){
        if(destino.getNumeroConta() != this.numeroConta){
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Valor transferido para: " + destino.getNumeroConta());
        }else {
            System.out.println("Nao pode transferir para a propria conta");
        }
    }

    public void consultarSaldo(){
        System.out.print("Saldo disponivel na conta: " + this.saldo);
    }




}
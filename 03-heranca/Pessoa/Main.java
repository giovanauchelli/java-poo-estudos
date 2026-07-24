package Pessoa;
public class Main {
    public static void main(String[] args){

        //Pessoa p1 = new Pessoa(); essa linha nao funciona pois classe Pessoa é abstrata
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();

        p2.setNome("Joao");
        p3.setNome("Carla");
        p4.setNome("Pedro");
        v1.setNome("Monica");
        b1.setNome("Laura");
        b1.pagarMensalidade();

        p2.status();
        p3.status();
        p4.status();
        v1.status();
    }
}
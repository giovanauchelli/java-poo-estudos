package Livro;
public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 20, "M");
        p[1] = new Pessoa("Maria", 34, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Ana Souza", 250, p[1]);
        l[2] = new Livro("Estruturas de Dados", "Carlos Oliveira", 450, p[0]);

        // Exemplo de uso
        l[0].abrir();
        l[0].folhear(100);
        l[0].detalhes();

        l[1].abrir();
        l[1].detalhes();

        l[2].detalhes();
    }
}
public class Main {
    public static void main(String[] args){
        Livro l1 = new Livro("Joao e maria", "Carlos");
        Livro l2 = new Livro("Peter pan", "Claudio");

        Aluno a1 = new Aluno("Giovana", "123");

        a1.pegarLivro(l2);
        a1.pegarLivro(l1);
        a1.mostrarInformacoes();
    }
}

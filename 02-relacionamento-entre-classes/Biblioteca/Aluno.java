public class Aluno{
    private String nome;
    private String matricula;
    private Livro livroEmprestado;

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public Livro getLivroEmprestado(){
        return this.livroEmprestado;
    }

    public void pegarLivro(Livro livro){

        if(this.livroEmprestado != null){
            System.out.println("Você já possui um livro.");
            return;
        }

        if(livro.emprestar()){
            this.livroEmprestado = livro;
            System.out.println("Livro emprestado com sucesso.");
        }else{
            System.out.println("Livro indisponível.");
        }
    }

    public void devolverLivro(){
        this.livroEmprestado.devolver();
        this.livroEmprestado = null;
        System.out.println("Livro devolvido com sucesso");
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);

        if(livroEmprestado != null){
            System.out.println("Livro emprestado: " + this.livroEmprestado.getTitulo());
        }else {
            System.out.println("Livro: Nenhum");
        }
    }
}
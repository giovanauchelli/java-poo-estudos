public class Livro{

    private String titulo;
    private String autor;
    private boolean emprestado;

    //Constante
    public static final String BIBLIOTECA = "Biblioteca central";

    //Atributo compartilhado
    public static int quantidadeLivros = 0;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;

        quantidadeLivros ++;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }

    public String getAutor(){
        return this.autor;
    }
    
    public void emprestar() throws Exception {

        if(emprestado){
            throw new Exception("O livro ja esta emprestado");
        }

        emprestado = true;
    }

    public void devolver(){
        emprestado = false;
    }

    public static int getQuantidadeLivros(){
        return quantidadeLivros;
    }


    public void mostrarInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Emprestado: " + this.emprestado);
    }

}
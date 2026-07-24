public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;


    //Metodos especiais

    public Livro(String t, String a, int tp, Pessoa l){
        this.titulo = t;
        this.autor = a;
        this.totalPaginas  = tp;
        this.leitor = l;
        this.aberto = false;
        this.paginaAtual = 0;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }

    public String getAutot(){
        return this.autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }

    public int getTotalPaginas(){
        return this.totalPaginas;
    }
    public void setTotalPaginas(int t){
        this.totalPaginas = t;
    }

    public int getPaginaAtual(){
        return this.paginaAtual;
    }
    public void setPaginaAtual(int p){
        this.paginaAtual = p;
    }

    public boolean getAberto(){
        return this.aberto;
    }
    public void setAberto(boolean a){
        this.aberto = a;
    }

    public Pessoa getLeitor(){
        return this.leitor;
    }
    public void setLeitor(Pessoa p){
        this.leitor = p;
    }
    

    public void detalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + totalPaginas);
        System.out.println("Página atual: " + paginaAtual);
        System.out.println("Aberto: " + aberto);
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("--------------------------");
    }

    @Override
    public void abrir(){
        this.aberto = true;
    }

    @Override
    public void fechar(){
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina){
        if(pagina > this.totalPaginas){
            this.paginaAtual = 0;
        }
        else{
            this.paginaAtual = pagina;
        }
    }

    @Override
    public void avancarPag(){
        this.paginaAtual ++;
    }

    @Override
    public void voltarPag(){
        this.paginaAtual --;
    }


}

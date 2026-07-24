public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;

    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }

    public void setAvaliacao(int a){
        int nova;
        nova = (this.avaliacao + a)/this.views;

        this.avaliacao = nova;
    }

    public int getViews(){
        return this.views;
    }
    public void setViews(int v){
        this.views = v;
    }

    public int getCurtidas(){
        return this.curtidas;
    }
    public void setCurtidas(int c){
        this.curtidas = c;
    }

    public boolean getReproduzindo(){
        return this.reproduzindo;
    }
    public void setReproduzindo(boolean r){
        this.reproduzindo = r;
    }


    @Override
    public void play(){
        setReproduzindo(true);
        setViews(getViews() + 1);
    }

    @Override 
    public void pause(){
        setReproduzindo(false);
    }

    @Override 
    public void like(){
        setCurtidas(getCurtidas() + 1);
    }


    public void status(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Views: " + getViews());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Reproduzindo: " + getReproduzindo());
        System.out.println(" ");
    }
}

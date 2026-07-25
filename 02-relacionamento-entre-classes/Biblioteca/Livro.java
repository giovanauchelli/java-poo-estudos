public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = true;
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
    public void setAutor(String a){
        this.autor = a;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }


    public boolean emprestar(){
        if(disponivel){
            disponivel = false;
            return true;
        }
        return false;
    }

    public void devolver(){
        if(this.disponivel == false){
            this.disponivel = true;
            System.out.println("Livro devolvido com sucesso");

        }
    }

    public void mostrarInformacoes(){

        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponivel? " + this.disponivel);
        System.out.println("");
    }
}

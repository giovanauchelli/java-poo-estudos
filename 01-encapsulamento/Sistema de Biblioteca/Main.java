public class Main {
    public static void main(String[] args){

        try{
            Livro l1 = new Livro("O Hobbit", "J.R.R Tolkien");
            Livro l2 = new Livro("Dom Casmurro", "Machado de Assis");

            l1.mostrarInformacoes();
            l1.emprestar();
            System.out.println("");

            l1.mostrarInformacoes();
            l1.emprestar();

            System.out.println("");
            System.out.println("Biblioteca: " + Livro.BIBLIOTECA);
            System.out.println("Quantidade de livros: " + Livro.getQuantidadeLivros());

        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
}

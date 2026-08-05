public class Main {
    public static void main(String[] args){
        try{

            Cachorro c1 = new Cachorro("Bob", 2, 10, "Canino", "Golden");
            c1.mostrarDados();
            c1.setPeso(15);

            c1.mostrarDados();

            System.out.println("Nome da clinica: " + Animal.CLINICA);
            System.out.println("Quantidade de animais cadastrados: " + Animal.getTotalAnimais());


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

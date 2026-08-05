public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, float peso, String especie, String raca){
        super(nome, idade, peso, especie);
        this.raca = raca;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String r){
        this.raca = r;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Raça: " + raca);
        System.out.println("");
    }
}

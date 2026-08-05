public class Animal{
    private String nome;
    private int idade;
    private float peso;
    protected String especie;

    public static final String CLINICA = "Pet Vida";
    public static int totalAnimais = 0;

    public Animal(String nome, int idade, float peso, String especie){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.especie = especie;

        totalAnimais ++;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int id) throws Exception{
        if(id < 0){
            throw new Exception("Idade invalida");
        }

        this.idade = id;
    }

    public float getPeso(){
        return this.peso;
    }

    
    public void setPeso(float p) throws Exception{
        if(p <= 0){
            throw new Exception("Peso invalido");
        }

        this.peso = p;
    }

    public String getEspecie(){
        return this.especie;
    }


    public static int getTotalAnimais(){
        return totalAnimais;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Especie: " + especie);
        
    }

    



}
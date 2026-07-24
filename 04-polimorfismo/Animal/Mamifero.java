package Animal;
public class Mamifero extends Animal{
    private String corPelo;

    public String getPelo(){
        return this.corPelo;
    }
    public void setPelo(String p){
        this.corPelo = p;
    }

    @Override
    public void locomover(){
        System.out.println("Correndo");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero");
    }

    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }

}

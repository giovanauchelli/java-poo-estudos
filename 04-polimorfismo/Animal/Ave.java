package Animal;
public class Ave extends Animal {
    private String corPena;

    public String getCorPena(){
        return this.corPena;
    }
    public void setCorPena(String c){
        this.corPena = c;
    }

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de aves");
    }

    public void fazerNinho(){
        System.out.println("Constrtui Ninho");
    }
}

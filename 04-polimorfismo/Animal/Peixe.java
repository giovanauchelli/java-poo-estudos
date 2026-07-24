package Animal;
public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama(){
        return this.corEscama;
    }

    public void setCorEscama(String c){
        this.corEscama = c;
    }

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de rpeixe");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

}

package Lutador;
public class Lutador{

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    
    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int i){
        this.idade = i;
    }


    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float a){
        this.altura = a;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float p){
        this.peso = p;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }

    private void setCategoria(){

        if(this.peso < 52.2f){
            this.categoria = "Invalido";
        }
        else if(this.peso <= 70.3f){
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Invalido";
        }
    }

    public int getVitoria(){
        return this.vitorias;
    }

    public void setVitoria(int v){
        this.vitorias = v;
    }

    public int getDerrota(){
        return this.derrotas;
    }

    public void setDerrota(int d){
        this.derrotas = d;
    }

    public int getEmpate(){
        return this.empates;
    }

    public void setEmpate(int e){
        this.empates = e;
    }

    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() +"anos");
        System.out.println("Altura: " + getAltura() + "metros");
        System.out.println("Peso: " + getPeso() + "kg");
        System.out.println("Ganhou: " + getVitoria());
        System.out.println("Derrotas: " + getDerrota());
        System.out.println("Empatou: " + getEmpate());
        System.out.println("");
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso: " + getCategoria());
        System.out.println(getVitoria() + "vitorias");
        System.out.println(getDerrota() + "derrotas");
        System.out.println(getEmpate() + "empates");
        System.out.println("");
    }

    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }

    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }

    public void empatarLuta(){
        this.setEmpate(this.getEmpate() +1);
    }

}

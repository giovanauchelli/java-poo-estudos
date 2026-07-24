package Livro;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //Metodos especiais
    public Pessoa(String n, int id, String s){
        this.nome = n;
        this.idade = id;
        this.sexo = s;
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
    public void setIdade(int id){
        this.idade = id;
    }

    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
    


    public void fazerAniver(){
        this.idade = this.idade +1;
    }
}

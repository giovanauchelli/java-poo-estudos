package Pessoa;
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }

    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String cur){
        this.curso = cur;
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno");
    }
}
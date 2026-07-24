public class Gafanhoto extends Pessoa {
    private String login;
    private float totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String l){
        this.login = l;
    }

    public float getTotAssistido(){
        return this.totAssistido;
    }
    public void setTotAssistido(float t){
        this.totAssistido = t;
    }

    public void viuMaisUm(){
        setTotAssistido(getTotAssistido() + 1);
    }

    @Override
    public void status(){
        super.status();
        System.out.println("Login: " + getLogin());
        System.out.println("Total Assistido: " + getTotAssistido());
        System.out.println("");

    }
}

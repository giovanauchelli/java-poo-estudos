package Pessoa;
    public abstract class Pessoa {
        private String nome;
        private int idade;
        private String sexo;

        public Pessoa(){

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
        public void setIdade(int i){
            this.idade = i;
        }

        public String getSexo(){
            return this.sexo;
        }
        public void setSexo(String s){
            this.sexo = s;
        }

        public final void fazerAniv(){
            this.idade ++;
        }

        public void status(){
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Sexo: " + getSexo());
            System.out.println("");
        }



    }
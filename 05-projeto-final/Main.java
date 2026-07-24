public class Main {
    public static void main(String[] args){
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao vz[] = new Visualizacao[5];


        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

        g[0] = new Gafanhoto("Giovana", 19, "F", "gi123");
        g[1] = new Gafanhoto("Marcio", 47, "M", "m123");

        v[0].play();
        v[0].like();
        v[0].status();

        v[1].like();
        v[1].status();


        vz[0] = new Visualizacao(g[0], v[0]);
        vz[0].status();
        vz[0].avaliar(4);
        g[0].status();

        
    }
}

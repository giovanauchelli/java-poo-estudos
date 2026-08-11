public class Main {
    public static void main(String[] args) {

        
        System.out.println("Quantidade de datas: " + Data.getQtd()); // 0

        System.out.println("2000 é bissexto? " + Data.isBissexto((short)2000)); // true

        System.out.println("10/08/2026 é válida? " + Data.isValida((byte)10, (byte)8, (short)2026)); // true

        try {

            Data niverMaligno = new Data((byte)19, (byte)1, (short)1966);

            System.out.println("\nData criada:");

            System.out.println(
                niverMaligno.getDia() + "/" +
                niverMaligno.getMes() + "/" +
                niverMaligno.getAno()
            );

            System.out.println("Quantidade de datas: " + Data.getQtd());

            System.out.println("\nData atual:");
            System.out.println(
                niverMaligno.getDia() + "/" +
                niverMaligno.getMes() + "/" +
                niverMaligno.getAno()
            );

            niverMaligno.avanceUmDia();

            System.out.println("Depois de avançar 1 dia:");
            System.out.println(
                niverMaligno.getDia() + "/" +
                niverMaligno.getMes() + "/" +
                niverMaligno.getAno()
            );

            niverMaligno.avanceVariosDias(5);

            System.out.println("Depois de avançar 5 dias:");
            System.out.println(
                niverMaligno.getDia() + "/" +
                niverMaligno.getMes() + "/" +
                niverMaligno.getAno()
            );

            Data seguinte = niverMaligno.getDiaSeguinte();

            System.out.println("\nData original:"); // com 5 dias a mais 
            System.out.println(
                niverMaligno.getDia() + "/" +
                niverMaligno.getMes() + "/" +
                niverMaligno.getAno()
            );

            System.out.println("Dia seguinte:"); // 26/1/1966
            System.out.println(
                seguinte.getDia() + "/" +
                seguinte.getMes() + "/" +
                seguinte.getAno()
            );

        }
        catch (Exception erro) {
            System.err.println(erro.getMessage());
        }
    }
}
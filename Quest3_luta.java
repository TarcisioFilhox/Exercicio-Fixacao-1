package Quest3;

public class Quest3_luta {

    public static void main(String[] args){

    	Quest3_lutador Ryu = new Quest3_lutador(100, 10, "Ryu");
    	Quest3_lutador Bison = new Quest3_lutador(100, 12, "Bison");

        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);

        System.out.println("Energia de "+Bison.nome+": "+Bison.energia);

        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);

        System.out.println("Energia de "+Ryu.nome+": "+Ryu.energia);
    }
}

package Quest4;

public class Quest4_post2 {

    public static void main(String[] args){

    	Quest4_post1 p1 = new Quest4_post1("Escutem essa nova música de Joao Gomes", "https://www.youtube.com/watch?v=HnfinlIq7s4");

        p1.curtir();
        p1.curtir();
        p1.curtir();

        System.out.println("\nNumero de curtidas: "+p1.numeroCurtidas);

        p1.compartilhar();
        p1.compartilhar();

        System.out.println("\nNumero de compartilhamento: "+p1.numeroCompartilhamentos);
    }
}

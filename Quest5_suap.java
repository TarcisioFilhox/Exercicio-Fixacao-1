package Quest5;

public class Quest5_suap {

    public static void main(String[] args){

        double media;
        Quest5_aluno n1 = new Quest5_aluno("Tarcísio de Pinho Silva Filho", "088.480.355-40");

        n1.n1 = 9.00;
        n1.n2 = 8.50;
        n1.n3 = 10.00;

        media = n1.calcularMedia();

        System.out.printf("\nMedia: %.2f", media);

        n1.n2 = 4.00;
        
       media = n1.calcularMedia();

        System.out.printf("\nMedia: %.2f", media);
    }
}

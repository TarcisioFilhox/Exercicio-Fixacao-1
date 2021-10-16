package Quest1;

public class Quest1_clinica {

public static void main(String[] args) {

	Quest1_paciente n1 = new Quest1_paciente(1, "Tarcísio de Pinho Silva Filho", "14/04/2005", "Masculino", "Individual", "Sem alergias", "B-");

    System.out.println("\nCodigo: " + n1.codigo);
    System.out.println("Nome: " + n1.nome);
    System.out.println("Data de nascimento: " + n1.dataNascimento);
    System.out.println("Sexo: " + n1.sexo);
    System.out.println("Plano de saúde: " + n1.planoSaude);
    System.out.println("Alergia: " + n1.alergia);
    System.out.println("Tipo Sanguíneo: " + n1.tipoSanguineo + "\n");

    n1.codigo = n1.codigo + 1;
    n1.nome = "Maria Regiane de França Macêdo";
    n1.dataNascimento = "20/12/1982";
    n1.sexo = "Feminino";
    n1.alergia = "Sem Alergias";
    n1.planoSaude = "individual";
    n1.tipoSanguineo = "B+";

    System.out.println("\nCodigo: " + n1.codigo);
    System.out.println("Nome: " + n1.nome);
    System.out.println("Data de nascimento: " + n1.dataNascimento);
    System.out.println("Sexo: " + n1.sexo);
    System.out.println("Plano de saúde: " + n1.planoSaude);
    System.out.println("Alergia: " + n1.alergia);
    System.out.println("Tipo Sanguíneo: " + n1.tipoSanguineo + "\n");


}
}

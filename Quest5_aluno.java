package Quest5;

public class Quest5_aluno {

    String nome, cpf; Double n1, n2, n3;

    public Quest5_aluno(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;
    }

    public Double calcularMedia(){
        return (this.n1 + this.n2 + this.n3)/3;
    }
}

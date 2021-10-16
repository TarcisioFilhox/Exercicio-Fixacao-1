package Quest2;

public class Quest2_medico {

    int codigo; String nome, sexo, especialidade; Quest2_endereco endereco;

    public Quest2_medico(int codigo, String nome, String sexo, String especialidade, Quest2_endereco endereco){

        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public String getEndereco(){
        return  "UF: "+this.endereco.uf+"\nCEP: "+this.endereco.cep+"\nCidade: "+this.endereco.cidade+"\nBairro: "+this.endereco.bairro+"\nRua: "+this.endereco.rua+"\nNumero: "+this.endereco.numero+"\nComplemento: "+this.endereco.complemento;
    }
}

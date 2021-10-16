EXERCÍCIO DE FIXAÇÃO 1
Curso:
Técnico em Informática


Disciplina:
Linguagem de Programação I
Campus:
Euclides da Cunha
Professor:
Breno Araújo
Assunto:
Orientação a objetos com Java: classes, atributos e métodos 


Você foi contratado para implementar um sistema de clínica médica, crie uma classe “Paciente” com os atributos e e construtor descritos e depois realize os passos definidos a seguir:
ATRIBUTOS: 
codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo.

CONSTRUTOR: 
Deve receber os parâmetros para iniciar os atributos: codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo.

PASSOS: 
Instanciar um objeto paciente com o seu nome, data de nascimento, sexo, alergia (caso você tenha) e tipo sanguíneo. 
Imprimir cada um dos dados do objeto (acessando os atributos). 
Modificar cada um dos dados do objeto com os valores correspondentes aos dados da sua mãe ou seu pai (modificando os atributos). 
Imprimir dados do objeto novamente.

Dando prosseguimento ao sistema de Clínica Médica, crie uma classe “Medico” e uma classe “Endereco” com os atributos e métodos descritos abaixo e depois realize os passos definidos a seguir:
ATRIBUTOS DA CLASSE ENDERECO: 
rua, numero, complemento, bairro, cidade, uf, cep.

CONSTRUTOR DA CLASSE ENDERECO: 
Deve receber os parâmetros para iniciar os atributos: rua, numero, complemento, bairro, cidade, uf, cep.

ATRIBUTOS DA CLASSE MÉDICO: 
codigo, nome, sexo, especialidade, endereco.

CONSTRUTOR DA CLASSE MÉDICO: 
Deve receber os parâmetros para iniciar os atributos: codigo, nome, sexo, especialidade, endereco.

PASSOS: 
Instanciar um objeto endereço com os dados de rua, número, complemento, bairro, cidade, uf (invente essas informações). 
Instanciar um objeto médico com os dados de código, nome, sexo e especialidade (invente essas informações). O atributo endereco deve receber o objeto endereço que você criou no primeiro passo 1. 
Imprimir os dados dos dois objetos (acessando os atributos).
Modificar os dados do objeto médico e do objeto endereco (modificando os atributos).
Imprimir novamente os dados dos objetos (acessando os atributos).

Você foi contratado para implementar a nova versão do clássico game de luta Street Fighter. Crie uma classe “Lutador” com os atributos e métodos descritos abaixo e depois realize os passos definidos a seguir:
ATRIBUTOS: 
nome, energia, forca.

CONSTRUTOR: 
Deve receber os parâmetros para iniciar os atributos: nome, energia, forca.

MÉTODOS: 
reduzirEnergia, aplicarGolpe (deve receber como parâmetro outro lutador que irá levar o golpe e reduzir a energia desse lutador de acordo com a força do lutador que está aplicando o golpe).

PASSOS: 
Instanciar um objeto lutador com nome Ryu, energia 100 e forca 10. 
Instanciar outro objeto lutador, dessa vez com nome Bison, energia 100, forca 12. 
Faça com que Ryu aplique 3 golpes seguidos em Bison.
Imprimir a energia de Bison após receber os golpes (acessando o atributo energia). 
Faça com que Bison aplique 8 golpes seguidos em Ryu e em seguida.
Imprimir a energia de Ryu após receber os golpes (acessando o atributo energia).

Mark Zuckerberg descobriu que você é um grande desenvolvedor de software e te contratou para refazer uma parte do Facebook. Crie uma classe “Post” com os atributos e métodos descritos abaixo e depois realize os passos definidos a seguir:
ATRIBUTOS: 
texto, link, numeroCurtidas, numeroCompartilhamentos.

CONSTRUTOR: 
Deve receber os parâmetros para iniciar os atributos: texto, link.

MÉTODOS: 
curtir (acrescenta 1 ao numero de curtidas), compartilhar (acrescenta 1 ao numero de compartilhamentos).

PASSOS: 
Instanciar um objeto post que o texto seja igual ao último post que você postou no facebook e o link seja a url do seu site preferido. 
Curtir o post 3 vezes seguidas (através do método curtir) 
Imprimir o número de curtidas (acessando o atributo numeroCurtidas)
Compartilhar o post 2 vezes (através do método compartilhar) 
Imprimir o número de compartilhamentos do post (acessando o atributo numeroCompartilhamentos)

A equipe de TI do IFBA precisa reformular o sistema SUAP e te contratou para implementá-lo. Crie uma classe “Aluno” com os atributos e métodos descritos abaixo e depois realize os passos definidos a seguir:

ATRIBUTOS: 
nome, cpf, notas (três notas, uma para cada unidade)

CONSTRUTOR: 
Deve receber os parâmetros para iniciar os atributos: nome, cpf

MÉTODOS: 
calcularMedia (deve calcular e retornar a média em função das três notas).

PASSOS: 
Instanciar um objeto aluno com o seu nome e cpf. 
Definir as três notas do aluno
Chamar o método calcularMedia, armazene o retorno do cálculo da média em uma variável
Imprimir o valor da variável que está armazenando a média. 
Modificar a sua segunda nota com um valor diferente do inicial (acessando o atributo notas) 
Recalcular a média (através do método calcularMedia) 
Imprimir o valor da nova média.

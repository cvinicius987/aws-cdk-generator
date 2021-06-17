## AWS

#### Criação da Conta AWS

O Primeiro passo é a criação de uma conta da [AWS](https://aws.amazon.com/pt/);

#### Criando Usuários

Ao criar uma conta no provedor de nuvem, temos acesso através do usuário *root*, este usuário não deveria ser utilizado para criar e manipular aplicações, devido a ter acesso full a todo ambiente, portanto podemos seguir algumas práticas de segurança, tais como:
- Habilitar 2FA no usuário root;
- Criar uma senha com um alto padrão de segurança para a usuário *root*;
- Criar um novo usuário para executar e criar as aplicações, utilizando somente as permissões necessárias;

Tudo isso pode ser feito através do [AWS IAM](https://aws.amazon.com/pt/iam/)

#### Instalação do AWS CLI V2

O AWS CLI é uma interface para se comunicar com as APIs da AWS através da linha de comando, devemos utilizar de acordo com o seu sistema operacional [AWS CLI](https://docs.aws.amazon.com/pt_br/cli/latest/userguide/install-cliv2.html)

Após a instalação execute:
```
aws --version
```
#### Criação de Chaves de Autenticação AWS
Para realizar o acesso através do AWS CLI são necessárias chaves de acesso, para cria-lás, seguir os passos:
- Logar na conta através do AWS Console Web;
- Ir em IAM;
- Ir em Credenciais de Segurança.

Obs: Nunca forneça as chaves a outros usuários os as salves em locais públicos como GitHub, HardCode em códigos, etc.

#### Configuração do AWS CLI
A configuração pode ser realizada seguindo os passos do comando abaixo:
```
aws configure
```
Após no próprio terminal será pedido várias informações, entre elas:
- Chaves criadas anteriormente;
- Região Padrão;
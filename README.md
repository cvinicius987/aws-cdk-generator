# AWS CDK Series

Criação de Construtores para criação de infraestrutura como código na AWS utilizando o CDK.

## Configuração do Ambiente

#### AWS CDK
O [CDK](https://aws.amazon.com/pt/cdk/) permite a criação de infraestrura e deploy de aplicações na nuvem da AWS, utilizando as linguagens Java, C#, JavaScript.
O CDK engine cria os arquivos Cloud Formation que serão executados na Cloud.

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

#### Configuração do AWS CDK

Para instalar o CDK precisamos ter o [NodeJS](https://nodejs.org/en/) instalado, devemos instalar de acordo com o Sistema Operacional, após a instalação execute o comando abaixo:
```
node --version
```
Após o Node podemos instalar o [CDK](https://docs.aws.amazon.com/cdk/latest/guide/getting_started.html) através do comando:
```
npm install -g aws-cdk
```

Após a instalação execute:
```
cdk --version
```

## Execução


#### Criando a Stack  

```
cdk deploy -c accountId=<here> -c region=<here>  -c envName=<here> -c stackName=<here>
```
- *accountId*: ID da conta onde os recursos serão criados (Caso não informado pegará o default do AWS CLI);
- *region*: Região onde os recursos serão criados (Casos não informado perará o default do AWS CLI);
- *envName*: No do ambiente que será criado, no caso podemos ter prod, homolog, dev, etc;
- *stackName*: Nome da Stack CloudFormation Criada.

#### Exclusão da Stack

```
cdk destroy
```

[⬆ Voltar ao topo](#aws-cdk-series)<br />
